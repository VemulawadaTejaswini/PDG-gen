package javaapplication1;

import java.util.Scanner;
public class sum {
    public static void main(String args[])
    {
        int m,n,sum=0;
        Scanner s=new Scanner(System.in);
        while(true)
        {
            //System.out.print("enter a number:");
           m=s.nextInt();
            if(m==0) break;
            sum=0;
            while(m!=0)
          {
            n=m%10;
            sum+=n;
            m=m/10;
          }
            System.out.println(sum);
        }
        
        }
    }
}

