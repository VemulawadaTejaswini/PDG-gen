import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{

public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
       int n=s.nextInt(),k=s.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){arr[i]=s.nextInt();}
        int[] dp=new int[n];
      Arrays.fill(dp,1000000002);dp[0]=0;
      dp[1]=Math.abs(arr[1]-arr[0]);
      for(int i=2;i<n;i++){
        for(int j=i-1;j>=0&&j>=i-k;j--){
                  dp[i]=Math.min(Math.abs(arr[i]-arr[j])+dp[j],dp[i]);

        }
      }
      System.out.println(dp[n-1]);
    }
}
    
  










