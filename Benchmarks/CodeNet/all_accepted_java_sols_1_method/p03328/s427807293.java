/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package atcoder;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int f=b-a;
        int z=0;
        int c[]=new int[999];
        int count=0;
        for(int i=1;i<=999;i++)
        {
            c[count]=(i*(i+1))/2;
            count++;
        }
        for(int i=1;i<count;i++)
        {
            if(c[i]-c[i-1]==f)
            {
                z=c[i-1]-a;
            }
        }
        System.out.println(z);
    }
}
