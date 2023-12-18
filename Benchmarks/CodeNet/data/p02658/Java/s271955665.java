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
      static double MAX = 1000000000000000000.00;
      public static void main(String omkar[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         long[] arr = readArr2(N, infile, st);
         long res = 1L;
         for(long x: arr)
            if(x == 0)
            {
               System.out.println(0);
               return;
            }
         for(long x: arr)
         {
            if(res > MAX/x)
            {
               System.out.println(-1);
               return;
            }
            res *= x;
         }
         if(res > 1000000000000000000L)
            res = -1;
         System.out.println(res);
      }
      public static long[] readArr2(int N, BufferedReader infile, StringTokenizer st) throws Exception
      {
         long[] arr = new long[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i] = Long.parseLong(st.nextToken());
         return arr;
      }
   }