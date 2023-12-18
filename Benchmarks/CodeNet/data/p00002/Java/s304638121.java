/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package aojdigitnumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author in2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        while( sc.hasNext() ){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a + b;
            int count = 0;
            while(c!=0){
                c = c/10;
                count++;
            }
           System.out.println(count);
        }
    }
}