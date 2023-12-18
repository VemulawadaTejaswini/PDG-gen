/*
Roses are red
Memes are neat
All my test cases time out
Lmao yeet
**************************
Time to solve: 
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
         int[][] arr = new int[N][3];
         for(int i=0; i < N; i++)
         {
            st = new StringTokenizer(infile.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
         }
         int[][] dp = new int[N][3];
         for(int i=0; i < 3; i++)
            dp[0][i] = arr[0][i];
         for(int i=0; i < N-1; i++)
            for(int par=0; par < 3; par++)
               for(int next=0; next < 3; next++)
               {
                  if(par == next)
                     continue;
                  dp[i+1][next] = Math.max(dp[i+1][next], dp[i][par]+arr[i+1][next]);
               }
         int res = 0;
         for(int a: dp[N-1])
            res = Math.max(res, a);
         System.out.println(res);
      }
   }