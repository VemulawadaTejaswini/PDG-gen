//package  com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(Character.isUpperCase(s.charAt(0))) System.out.println("A");
        else System.out.println("a");
    }
}