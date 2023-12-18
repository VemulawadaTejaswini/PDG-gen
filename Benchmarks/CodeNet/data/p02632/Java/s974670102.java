import java.util.*;
import java.io.*;
public class Main{
	static int mod = 1000000007;
   public static void main(String[] main) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      PrintWriter out = new PrintWriter(System.out);
      int k = Integer.parseInt(st.nextToken());
      st = new StringTokenizer(br.readLine());
      String s = st.nextToken();
      long ans = 0;
      long[] fact = new long[2000001];
      fact[0] = 1;
      for(int i = 1; i < 2000001; i++)
    	  fact[i] = (fact[i-1]*i)%mod;
      long inv = pow(fact[s.length()-1],mod-2);
      for(int i = 0; i <= k; i++) {
    	  ans = (ans + multiply(pow(25,i),multiply(multiply(pow(26,k-i),fact[s.length()+i-1]),multiply(inv,pow(fact[i],mod-2)))))%mod;
      }
      out.println(ans);
      out.close();
   }
   static long multiply(long a, long b) {
	   return (a*b)%mod;
   }
   static long pow(long l, int p) {
	   if(p == 0)
		   return 1;
	   if(p == 1 || l == 1)
		   return l;
	   long temp = pow(l, p/2);
	   long temp1 = (temp*temp)%mod;
	   if(p%2 == 1)
		   temp1 = (temp1*l)%mod;
	   return temp1;
   }
}