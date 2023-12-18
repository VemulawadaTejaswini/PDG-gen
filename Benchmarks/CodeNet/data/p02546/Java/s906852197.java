package com.butugey;
import static java.lang.System.out;

//import java.lang.reflect.Array;
//import java.math.BigInteger;
//import java.util.Arrays;
//import java.util.HashMap;
import java.util.Scanner;


public class justAClass {

    public static void main( String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.next();
        if(S.endsWith("s")) {
            out.println(S+"es");
        }
        else {
            out.println(S+"s");
        }


     }



}



/*/private static void printArray(int[] NAMEOFARRAY) {
        for (int elem:chargeLevel) {
            out.print(elem +" ");
        }
        out.print("\n");
    */




