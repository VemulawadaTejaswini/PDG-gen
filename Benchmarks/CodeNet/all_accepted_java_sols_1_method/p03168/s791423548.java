/*
If you want to aim high, aim high
Don't let that studying and grades consume you
Just live life young
******************************
*/
import java.util.*;
import java.io.*;

   public class Main
   {
      public static void main(String args[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         double[] arr = new double[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i] = Double.parseDouble(st.nextToken());
         int headcount = N/2+1;
         double[][] dp = new double[N][N+1];
         dp[0][0] = 1.0-arr[0];
         dp[0][1] = arr[0];
         for(int a=1; a < N; a++)
            for(int b=0; b < N; b++)
            {
               dp[a][b] += dp[a-1][b]*(1-arr[a]);
               dp[a][b+1] += dp[a-1][b]*(arr[a]);
            }
         double res = 0.0;
         for(int x=headcount; x <= N; x++)
            res += dp[N-1][x];
         System.out.println(res);
      }
   }