//I AM THE CREED
/* //I AM THE CREED
/* package codechef; // don't place package name! */
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 
import java.util.*;
import java.awt.Point;
public class Main{
    //#include <bits/stdc++. h> 
    public static void main(String[] args) throws IOException 
    { 
  
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            long[] l=new long[n];
            for(int i=0;i<n;i++){
                l[i]=input.nextLong();
            }
            long[][] dp=new long[n][n];
            long[] sum=new long[n];
            for(int i=0;i<n;i++){
                if(i==0){
                    sum[i]=l[i];
                    continue;
                }
                sum[i]=sum[i-1]+l[i];
            }
            for(int i=n-1;i>=0;i--){
                for(int j=i;j<n;j++){
                    if(i==j){
                        continue;
                    }
                    if(j==i+1){
                        dp[i][j]=l[i]+l[j];
                        continue;
                    }
                    long min=Long.MAX_VALUE;
                    for(int k=i;k<j;k++){
                        min=Math.min(min, dp[i][k]+dp[k+1][j]+sum[j]-(i==0?0:sum[i-1]));
                    }
                    dp[i][j]=min;
                }
            }
            System.out.println(dp[0][n-1]);
        }
        
    }
    

}