/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)a[i]=sc.nextInt();
       int dp[]=new int[n];
       dp[0]=0;
       dp[1]=Math.abs(a[1]-a[0]);
       for(int i=2;i<n;i++)
       {dp[i]=Integer.MAX_VALUE;
           for(int j=Math.max(0,i-k);j<i;j++)
           {
               dp[i]=Math.min(dp[i],dp[j]+Math.abs(a[i]-a[j]));
           }
       }
       System.out.println(dp[n-1]);
       }
       
   }