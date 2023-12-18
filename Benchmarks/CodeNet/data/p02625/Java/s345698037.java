import java.util.*;
import java.io.*;
public class Beg172E{
	static int mod = 1000000007;
   public static void main(String[] main) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      PrintWriter out = new PrintWriter(System.out);
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      long[] fact = new long[m+1];
      fact[0] = 1;
      for(int i = 1; i <= m; i++)
    	  fact[i] = (fact[i-1]*i)%mod;
      long total = 0;
      int sign = 1;
      for(int i = n; i >= 0; i--) {
    	  long add = (fact[m-n+i]*pow(fact[m-n], mod-2))%mod;
    	  add = (add*pow(fact[n - i], mod-2))%mod;
    	  add = (add*pow(fact[i], mod-2))%mod;
    	  add = (add*fact[n])%mod;
    	  total += sign*add;
    	  total = (total + mod)%mod;
    	  sign *= -1;
      }
      long mult = (fact[m]*pow(fact[m-n], mod-2))%mod;
      total = (total*mult)%mod;
      out.println(total);
      out.close();
   }
   static long pow(long l, int p) {
	   if(p == 1 || l == 1)
		   return l;
	   long root = pow(l, p/2);
	   long temp = (root*root)%mod;
	   if(p%2 == 1)
		   temp = (temp*l)%mod;
	   return temp;
   }
}