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
         long N = Long.parseLong(st.nextToken());
         long X = Long.parseLong(st.nextToken());
         long MOD = Long.parseLong(st.nextToken());
         if(N <= MOD)
         {
            //DO NOT MOD RES
            long res = 0L;
            long val = X;
            for(int i=0; i < N; i++)
            {
               res += val;
               val = (val*val)%MOD;
            }
            System.out.println(res);
         }
         else
         {
            HashSet<Long> set = new HashSet<Long>();
            long val = -69;
            long res = 0L;
            for(int i=0; i < N; i++)
            {
               if(val == -69)
                  val = X;
               else
                  val = (val*val)%MOD;
               if(val == 22084)
                  System.out.println("gey");
               if(!set.add(val))
                  break;
               res += val;
            }
            N -= set.size();
            ArrayList<Long> cycle = new ArrayList<Long>();
            cycle.add(val);
            long head = (val*val)%MOD;
            while(head != val)
            {
               cycle.add(head);
               head = (head*head)%MOD;
            }
            long[] psums = new long[cycle.size()];
            psums[0] = cycle.get(0);
            for(int i=1; i < cycle.size(); i++)
               psums[i] = psums[i-1]+cycle.get(i);
            res += (N/cycle.size())*psums[cycle.size()-1];
            long leftover = N%cycle.size();
            if(leftover > 0)
               res += psums[(int)leftover-1];
            System.out.println(res);
         }
      }
      public static long power(long x, long y, long p) 
      { 
         //0^0 = 1
         long res = 1L;      
         x = x%p;  
         while(y > 0) 
         { 
            if((y&1)==1) 
               res = (res*x)%p;
            y >>= 1;
            x = (x*x)%p;  
         } 
         return res; 
      } 
   }