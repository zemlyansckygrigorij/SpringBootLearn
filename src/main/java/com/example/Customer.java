package com.example;

import org.springframework.beans.factory.annotation.Required;

public class Customer {
    private long id;
    private String firstName, lastName;

    public Customer(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer() {
    }

    public long getId() {
        return id;
    }

   /* public void setId(long id) {
        this.id = id;
    }*/

    public String getFirstName() {
        return firstName;
    }
   // @Required
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

    public void methodOne(){
        System.out.println("methodOne");
    }
    public void methodTwo(){
        System.out.println(" methodTwo()");
    }
}

// getters & s