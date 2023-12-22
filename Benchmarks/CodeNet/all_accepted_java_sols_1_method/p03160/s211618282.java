import java.util.*;
import java.io.*;
class Main{

     public static void main(String []args) throws Exception{
        BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
        int N=0;
        
        N=Integer.parseInt(br.readLine());
        int arr[]=new int[N];
        
        String s=br.readLine();
        String ss[]=s.split(" ");
        int val=0;
        for(int i=0;i<N;i++)
        {
            arr[i]=Integer.parseInt(ss[i]);
            
        }
        int dp[]=new int [N];
        dp[0]=arr[0];
        dp[1]=Math.abs(arr[0]-arr[1]);      
        int n=N;         
        if(N==2)
        {
            val= Math.abs(arr[0]-arr[1]);
            
        }
         else{
             
              //val=Math.min(Math.abs(arr[0]-arr[1]),Math.abs(arr[0]-arr[2]));
             for(int i=2;i<N;i++)
             {
                 if(i==2)
                 {
                     dp[i]=Math.min(dp[i-1]+Math.abs(arr[i]-arr[i-1]),Math.abs(arr[0]-arr[i]));
                 }
                 else{
                 dp[i]=Math.min(dp[i-2]+Math.abs(arr[i]-arr[i-2]),dp[i-1]+Math.abs(arr[i]-arr[i-1]));
                 }
                 //val+=Math.min(temp,temp1);
             }
             
             
             
             
             
             
         }
         System.out.println(dp[n-1]);
         
         
         
         
     }
}