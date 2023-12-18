/*
If you want to aim high, aim high
Don't let that studying and grades consume you
Just live life young
******************************
What do you think? What do you think?
1st on Billboard, what do you think of it
Next is a Grammy, what do you think of it
However you think, I’m sorry, but shit, I have no fucking interest
*******************************
Higher, higher, even higher, to the point you won’t even be able to see me
https://www.a2oj.com/Ladder16.html
*******************************
NEVER DO 300IQ CONTESTS EVER
300IQ AS WRITER = EXTRA NONO
*/
import java.util.*;
import java.io.*;
import java.math.*;

   public class Main
   {
      static long MOD = 998244353L;
      public static void main(String omkar[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         int S = Integer.parseInt(st.nextToken());
         int[] arr = new int[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
         long[][] dp = new long[N][S+1];
         dp[0][0] = 2L;
         if(arr[0] <= S)
            dp[0][arr[0]] = 1L;
         for(int i=1; i < N; i++)
            for(int v=0; v <= S; v++)
            {
               dp[i][v] += (dp[i-1][v]*2)%MOD;
               dp[i][v] %= MOD;
               if(v+arr[i] <= S)
               {
                  dp[i][v+arr[i]] += dp[i-1][v];
                  dp[i][v+arr[i]] %= MOD;
               }
            }
         System.out.println(dp[N-1][S]);
      }
   }