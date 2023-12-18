/*
If you want to aim high, aim high
Don't let that studying and grades consume you
Just live life young
******************************
What do you think? What do you think?
1st on Billboard, what do you think of it
Next is a Grammy, what do you think of it
However you think, I’m sorry, but shit, I have no fcking interest
*******************************
I'm standing on top of my Monopoly board
That means I'm on top of my game and it don't stop
til my hip don't hop anymore
https://www.a2oj.com/Ladder16.html
*******************************
300iq as writer = Sad!
*/
import java.util.*;
import java.io.*;
import java.math.*;

   public class Main
   {
      public static void main(String hi[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int R = Integer.parseInt(st.nextToken());
         int C = Integer.parseInt(st.nextToken());
         int K = Integer.parseInt(st.nextToken());
         int[][] grid = new int[R][C];
         for(int i=0; i < K; i++)
         {
            st = new StringTokenizer(infile.readLine());
            int r = Integer.parseInt(st.nextToken())-1;
            int c = Integer.parseInt(st.nextToken())-1;
            int x = Integer.parseInt(st.nextToken());
            grid[r][c] = x;
         }
         long[][] dp = new long[C][4];
         for(int r=0; r < R; r++)
         {
            long[][] next = new long[C][4];
            for(int c=0; c < C; c++)
               for(int t=0; t < 4; t++)
               {
                  next[c][0] = Math.max(next[c][0], dp[c][t]);
                  if(grid[r][c] > 0)
                     next[c][1] = Math.max(next[c][1], dp[c][t]+grid[r][c]);
               }
            for(int c=1; c < C; c++)
               for(int t=0; t < 4; t++)
               {
                  next[c][t] = Math.max(next[c][t], next[c-1][t]);
                  if(t < 3 && grid[r][c] > 0)
                     next[c][t+1] = Math.max(next[c][t+1], next[c-1][t]+grid[r][c]);
               }
            dp = next;
         }
         long res = 0L;
         for(int t=0; t < 4; t++)
            res = Math.max(res, dp[C-1][t]);
         System.out.println(res);
      }
   }