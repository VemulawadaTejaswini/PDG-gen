import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] s = new int[k][2];
		for(int i = 0; i < k; i++){
		    s[i][0] = sc.nextInt();
		    s[i][1] = sc.nextInt();
		}
		
		// 計算
		long result = 0;
		int MOD = 998244353;
		int[] dp = new int[n+1];
		dp[1] = 1;
		int[] sum = new int[n+1];
		sum[1] = 1;
		for(int i = 2; i <= n; i++){
		    for(int j = 0; j < k; j++){
		        int l = i - s[j][1];
		        int r = i - s[j][0];
		        if(r < 1) continue;
		        l = max(1, l);
		        dp[i] += (sum[r] - sum[l-1] + MOD)%MOD;
		        dp[i] %= MOD;
		    }
		    sum[i] = (sum[i-1] + dp[i])%MOD;
		}
		//System.out.println(Arrays.toString(dp));
		result = dp[n];
		
		// 出力
		System.out.println(result);
		
	}
	
	public static class Scanner {
		private BufferedReader br; private StringTokenizer tok;
		public Scanner(InputStream is) throws IOException { br = new BufferedReader(new InputStreamReader(is));}
		private void getLine() throws IOException { while(!hasNext()) tok = new StringTokenizer(br.readLine());}
		private boolean hasNext() { return tok != null && tok.hasMoreTokens();}
		public String next() throws IOException { getLine(); return tok.nextToken();}
		public int nextInt() throws IOException { return Integer.parseInt(next());}
		public long nextLong() throws IOException { return Long.parseLong(next());}
		public double nextDouble() throws IOException { return Double.parseDouble(next());}
	}

}
