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
      dp[0][0] = 2;
      if(a[0] <= s) {
    	  dp[0][a[0]] = 1;
      }
      for(int i = 1; i < n; i++) {
    	  for(int j = s; j >= 0; j--) {
    		  if(j + a[i] <= s) {
    			  dp[i][j+a[i]]= (dp[i][j+a[i]] + dp[i-1][j])%mod;
    		  }
    		  dp[i][j] = (dp[i][j] + 2*dp[i-1][j])%mod;
    	  }
      }
      out.println(dp[n-1][s]);
      out.close();
   }
}