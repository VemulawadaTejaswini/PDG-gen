/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    //static long memo[][];
    //static int w[];
    //static int v[];
    //static int n;
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int W=sc.nextInt();
       int w[]=new int[n];
       int v[]=new int[n];
       long dp[]=new long[100000+1];
       for(int i=0;i<n;i++)
       {
           w[i]=sc.nextInt();
           v[i]=sc.nextInt();
       }
       Arrays.fill(dp,(long)1e9+2);
       dp[0]=0;
       for(int i=0;i<n;i++)
              {
       for(int j=100000;j>=0;j--)
           {
               if((j-v[i])>=0)dp[j]=Math.min(dp[j],dp[j-v[i]]+w[i]);
           }
       }
       for(int i=100000;i>=0;i--)
       {
           if(dp[i]<=W)
           {
               System.out.println(i);
               break;
           }
       }
       
   }
}