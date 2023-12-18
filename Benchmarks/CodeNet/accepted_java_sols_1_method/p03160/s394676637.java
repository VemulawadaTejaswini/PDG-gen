import java.util.*;
import java.io.*;
 public class Main{
   public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     long [] arr=new long[n];
     
     for(int i=0;i<n;i++)arr[i]=sc.nextLong();

     long [] dp=new long[n];
     dp[0]=0;
     if(n>=1)
        dp[1]=Math.abs(arr[0]-arr[1]);
     if(n>=2){
       for(int i=2;i<n;i++)
          dp[i]=Math.min(dp[i-2]+Math.abs(arr[i]-arr[i-2]),
          dp[i-1]+Math.abs(arr[i]-arr[i-1]));
     }

     System.out.println(dp[n-1]);
    }
   }
 