/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author c0117321c5
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int sum=0;
        for(int i=1; i<=number;i++){
            for(int j=1;j<=number;j++){
                for(int k=1;k<=number;k++){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
    
}
