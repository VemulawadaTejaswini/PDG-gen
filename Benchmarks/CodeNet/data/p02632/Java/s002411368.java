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
      long[] fact = new long[2000001];
      fact[0] = 1;
      for(int i = 1; i < 2000001; i++)
    	  fact[i] = (fact[i-1]*i)%mod;
      long ans = pow(26,k);
      long prev = ans;
      long inv = pow(26, mod-2);
      for(int i = 1; i <= k; i++) {
    	  prev = (multiply(prev,inv)*multiply(25*(s.length()+i-1),pow(i,mod-2)))%mod;
    	  ans = (ans + prev)%mod;
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