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
         int M = Integer.parseInt(st.nextToken());
         long MOD = 1000000007L;
         int[][] grid = new int[N][M];
         for(int i=0; i < N; i++)
         {
            st = new StringTokenizer(infile.readLine());
            char[] c = st.nextToken().toCharArray();
            for(int a=0; a < M; a++)
               if(c[a] == '#')
                  grid[i][a] = 1;
         }
         long[][] dp = new long[N][M];
         dp[0][0] = 1L;
         for(int x=0; x < N; x++)
            for(int y=0; y < M; y++)
            {
               if(x < N-1 && grid[x+1][y] == 0)
               {
                  dp[x+1][y] += dp[x][y];
                  dp[x+1][y] %= MOD;
               }
               if(y < M-1 && grid[x][y+1] == 0)
               {
                  dp[x][y+1] += dp[x][y];
                  dp[x][y+1] %= MOD;
               }
            }
         System.out.println(dp[N-1][M-1]%MOD);
      }
   }