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
Shining through the city with a little funk and soul
*******************************
300iq as writer = Sad!
*/
import java.util.*;
import java.io.*;
import java.math.*;

   public class Main
   {
      static final long MOD = 1000000007L;
      static final int LEN = 667;
      public static void main(String hi[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int S = Integer.parseInt(st.nextToken());
         long[][] dp = new long[LEN][S+1];
         dp[0][0] = 1L;
         for(int i=1; i < LEN; i++)
         {
            long[] psums = new long[S+1];
            psums[0] = dp[i-1][0];
            for(int a=1; a <= S; a++)
               psums[a] = (psums[a-1]+dp[i-1][a])%MOD;
            for(int v=3; v <= S; v++)
               dp[i][v] = psums[v-3];
         }
         long res = 0L;
         for(int len=1; len < LEN; len++)
            res = (res+dp[len][S])%MOD;
         System.out.println(res);
      }
   }