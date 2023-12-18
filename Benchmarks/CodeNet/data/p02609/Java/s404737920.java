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
         int N = Integer.parseInt(st.nextToken());
         String input = infile.readLine();
         char[] arr = input.toCharArray();
         int cnt = 0;
         for(int x: arr)
            cnt += x-'0';
         //normal vals
         int[] dp = new int[N+1];
         for(int v=1; v <= N; v++)
         {
            int bc = Integer.bitCount(v);
            dp[v] = dp[v%bc]+1;
         }
         BigInteger lol = new BigInteger(input, 2);
         BigInteger plus = new BigInteger((cnt+1)+"");
         BigInteger minus = new BigInteger((cnt-1)+"");
         StringBuilder sb = new StringBuilder();
         for(int i=0; i < N; i++)
         {
            BigInteger temp = lol.flipBit(N-i-1);
            int val = 0;
            if(arr[i] == '0')
               val = temp.mod(plus).intValue();
            else if(cnt-1 >= 1)
               val = temp.mod(minus).intValue();
            int res = dp[val]+1;
            if(arr[i] == '1' && cnt == 1)
               res = 0;
            sb.append(res+"\n");
         }
         System.out.print(sb);
      }
   }