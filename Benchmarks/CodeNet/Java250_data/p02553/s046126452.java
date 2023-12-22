//package com.company;
import java.util.*;
import java.io.*;
import java.lang.*;


public class Main {

    public static void main(String[] args) {
	// write your code here

      //  System.out.println("Hello World");
        // System.out.println("This is my first package ");
        Scanner s=new Scanner(System.in);
        long a=s.nextLong();
        long b=s.nextLong();
        long c=s.nextLong();
        long d=s.nextLong();

        long res=0,max=0;
        res=Integer.MIN_VALUE;
        max=Integer.MIN_VALUE;
     /*   for(long i=a;i<=b;i++)
        {
            for(long j=c;j<=d;j++)
            {
                max=i*j;
                res=Math.max(max,res);
            }
        }*/
      long p,q,r,st;
      
      if(a>0 && b>0 && c>0 && d>0)
      {
         p=a*c;
       q=b*d;
       res=Math.max(p,q);
        
      }
      else  if(a<0 && b<0 && c<0 && d<0)
      {
         p=a*c;
       q=b*d;
     res=Math.max(p,q);
        
      }
        else
      {
          p=a*c;
       q=b*d;
          r=a*d;
          st=b*c;
          r=Math.max(r,st);
      p=Math.max(p,q);
          res=Math.max(p,r);
        
      }
      
      
      
      
     
     // res=Math.max(r,res);
        System.out.println(res);



    }
}
