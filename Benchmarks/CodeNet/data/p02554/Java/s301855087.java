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
      public static void main(String hi[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         long[] fac = new long[N+1];
         long[] invfac = new long[N+1];
         fac[0] = invfac[0] = 1L;
         for(int i=1; i <= N; i++)
            fac[i] = (fac[i-1]*i)%MOD;
         invfac[N] = power(fac[N], MOD-2, MOD);
         for(int i=N-1; i >= 1; i--)
            invfac[i] = (invfac[i+1]*(i+1))%MOD;
         long res = 0L;
         long temp = power(8, N-2, MOD);
         long over8 = power(8, MOD-2, MOD);
         for(int i=2; i <= N; i++)
         {
            long choice = power(2, i, MOD)-2;
            if(choice < 0)
               choice += MOD;
            choice = (choice*fac[N])%MOD;
            choice = (choice*invfac[i])%MOD;
            choice = (choice*invfac[N-i])%MOD;
            res += (temp*choice)%MOD;
            if(res >= MOD)
               res -= MOD;
            temp = (temp*over8)%MOD;
         }
         System.out.println(res);
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