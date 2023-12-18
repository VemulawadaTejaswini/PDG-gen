/*
package com.company.practice;
*/

import java.util.Scanner;
import java.lang.*;
import java.util.Scanner;

import static java.lang.Character.isUpperCase;

public class Main {
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        char s = key.next().charAt(0);
        if(isUpperCase(s))
            System.out.println("A");
        else
            System.out.println("a");
    }
}
