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
      public static void main(String hi[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         int[] sieve = new int[1000001];
         for(int d=2; d <= 1000000; d++)
            for(int v=d; v <= 1000000; v+=d)
               if(sieve[v] == 0)
                  sieve[v] = d;
         long res = 0L;
         for(int c=1; c < N; c++)
         {
            int product = N-c;
            long temp = 1L;
            while(product > 1)
            {
               int p = sieve[product];
               int cnt = 1;
               while(product%p == 0)
               {
                  product /= p;
                  cnt++;
               }
               temp *= cnt;
            }
            res += temp;
         }
         System.out.println(res);
      }
   }