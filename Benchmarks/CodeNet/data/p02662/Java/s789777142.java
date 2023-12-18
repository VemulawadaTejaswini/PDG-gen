import java.util.*;
import java.io.*;
public class Main{
	static int[][] dp;
	  static int mod = 998244353;
   public static void main(String[] main) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      PrintWriter out = new PrintWriter(System.out);
      int n = Integer.parseInt(st.nextToken());
      int s = Integer.parseInt(st.nextToken());
      int[] a = new int[n];
      dp = new int[n+1][s+1];
      st = new StringTokenizer(br.readLine());
      for(int i = 0; i < n; i++) {
          a[i] = Integer.parseInt(st.nextToken());
      }
      TreeSet<Pair> use = new TreeSet<Pair>();
      dp[0][0] = 1;
      use.add(new Pair(0,0));
      if(a[0] <= s) {
    	  dp[1][a[0]] = 1;
    	  use.add(new Pair(1,a[0]));
      }
      //int[][] prev = dp;
      for(int i = 1; i < n; i++) {
    	  //dp = new int[i+2][s+1];
    	  TreeSet<Pair> next = new TreeSet<Pair>();
    	  for(Pair p: use) {
    		  int numuse = p.getV();
    		  int sum = p.getI();
    		  next.add(p);
    		  //dp[numuse][sum] = (dp[numuse][sum] + dp[numuse][sum])%mod;
    		  if(sum + a[i] <= s) {
    			  dp[numuse+1][sum+a[i]]= (dp[numuse+1][sum+a[i]] + dp[numuse][sum])%mod;
    			  next.add(new Pair(numuse+1,sum+a[i]));
    		  }
    	  }
    	  use = next;
    	  //prev = dp;
      }
      long ans = 0;
      for(int i = 1; i <= n; i++) {
    	  ans = (ans + (dp[i][s]*pow(2,n-i))%mod)%mod;
      }
      out.println(ans);
      out.close();
   }
   static long pow(long a, int p) {
	   if(a == 0)
		   return 0;
	   if(a == 1 || p == 1)
		   return a;
	   if(p == 0)
		   return 1;
	   long val = pow(a,p/2);
	   long sq = (val*val)%mod;
	   if(p%2 == 0)
		   return sq;
	   return (a*sq)%mod;
   }
}
class Pair implements Comparable<Pair>{
	private int val;
	private int index;
	public Pair(int a, int b) {
		val = a;
		index = b;
	}
	public int hashCode() {
		return val*10000+index;
	}
	public boolean equals(Object o){
		Pair p = (Pair) o;
		return val == p.getV() && index == p.getI();
	}
	public int compareTo(Pair p) {
		if(val == p.getV())
			return index - p.getI();
		return -val + p.getV();
	}
	public int getV() {
		return val;
	}
	public void setI(int i) {
		index = i;
	}
	public int getI() {
		return index;
	}
}