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
      static final long MOD = 1000000007L;
      public static void main(String hi[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int K = Integer.parseInt(st.nextToken());
         String input = infile.readLine();
         int N = input.length();
         fac = new long[2000003];
         invfac = new long[2000003];
         fac[0] = invfac[0] = 1L;
         for(int i=1; i <= 2000002; i++)
            fac[i] = (fac[i-1]*i)%MOD;
         invfac[2000002] = power(fac[2000002], MOD-2, MOD);
         for(int i=2000001; i >= 1; i--)
            invfac[i] = (invfac[i+1]*(i+1))%MOD;
         long[] pow25 = new long[1000001];
         pow25[0] = 1L;
         for(int i=1; i <= 1000000; i++)
            pow25[i] = (pow25[i-1]*25)%MOD;
         long res = 0L;
         long pow26 = 1L;
         for(int suffix=0; suffix <= K; suffix++)
         {
            long temp = pow26;
            long mult = (pow25[K-suffix]*starbar(K-suffix, N-1))%MOD;
            temp = (temp*mult)%MOD;
            res += temp;
            if(res >= MOD)
               res -= MOD;
            pow26 *= 26;
            pow26 %= MOD;
         }
         System.out.println(res);
      }
      static long[] fac;
      static long[] invfac;
      public static long starbar(int stars, int bars)
      {
         long res = fac[stars+bars];
         res = (res*invfac[stars])%MOD;
         return (res*invfac[bars])%MOD;
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