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
      static long MAX = 100000000000000L;
      public static void main(String omkar[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         int[] arr = new int[N+1];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N+1; i++)
            arr[i] = Integer.parseInt(st.nextToken());
         long[] suff = new long[N+1];
         suff[N] = arr[N];
         for(int i=N-1; i >= 0; i--)
            suff[i] = suff[i+1]+arr[i];
         long active = 1L;
         long res = 1L;
         for(int i=0; i <= N; i++)
         {
            long chains = arr[i];
            if(active < chains)
            {
               System.out.println(-1);
               return;
            }
            active -= chains;
            if(i < N)
               active = Math.min(2*active, suff[i+1]);
            res += active;
         }
         System.out.println(res);
      }
   }