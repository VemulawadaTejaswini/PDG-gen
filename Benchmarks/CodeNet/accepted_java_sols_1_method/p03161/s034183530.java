import java.util.*;
import java.io.*;
class Main{

     public static void main(String []args) throws Exception{
        //System.out.println("Hello World");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int N,k;
        String s;
        s=br.readLine();
        String ss[]=s.split(" ");
     N=Integer.parseInt(ss[0]);
     k=Integer.parseInt(ss[1]);
     
     int arr[]=new int[N];
     s=br.readLine();
     ss=s.split(" ");
     
     for(int i=0;i<N;i++)
     {
     arr[i]=Integer.parseInt(ss[i]);
     }
     if(N==2)
     {
         System.out.println(Math.abs(arr[0]-arr[1]));
     }
     else{
     long dp[]=new long[N];
     dp[0]=0l;
     dp[1]=Math.abs(arr[1]-arr[0])*1l;
     long temp=10000000009l;
     for (int i=2;i<N;i++)
     {
         temp=1000000009l;
         for(int j=1;j<=k;j++)
         {
             if(i-j<0)
             {
                 continue;
             }
             long var=(dp[i-j]+Math.abs(arr[i]-arr[i-j]))*1l;
             temp=Math.min(var,temp);
             
         }
         dp[i]=temp;
         
     }
         
         
         
       
System.out.println(dp[N-1]);         
     }
     }
         
         
         
         
         
     }
