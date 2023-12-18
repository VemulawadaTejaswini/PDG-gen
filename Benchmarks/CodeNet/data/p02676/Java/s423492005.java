package com.company;

import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);

	int n=sc.nextInt();
	String s= sc.next();
	int l=s.length();
	if(l<=n)
      {
          System.out.println(s);
      }
	else
      {
          System.out.println(s.substring(0,n)+"...");
         }

      }


    }

