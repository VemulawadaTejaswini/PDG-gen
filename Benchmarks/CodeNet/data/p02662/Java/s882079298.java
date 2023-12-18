import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int s = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}
		
		// 計算
		long result = 0;
		long[][] dp = new long[3001][3001];
		int MOD = 998244353;
		dp[0][0] = 1;
		for(int i = 0; i < n; i++){
		    for(int j = 0; j < dp[0].length; j++){
		        if(j-a[i] >= 0) dp[i+1][j] = dp[i][j-a[i]];
		        dp[i+1][j] += dp[i][j]*2%MOD;
		        dp[i+1][j] %= MOD;
		    }
		}
		result = dp[n][s];
		
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
