import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int r = sc.nextInt();
		int c = sc.nextInt();
		int K = sc.nextInt();
		long[][] rcv = new long[r][c];
		for(int i = 0; i < K; i++){
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			rcv[x][y] = sc.nextLong();
		}
		
		// 計算
		long result = 0;
		long[][][] dp = new long[r][c][4];
		if(rcv[0][0] > 0) dp[0][0][1] = rcv[0][0];
		for(int i = 0; i < r; i++){
		    for(int j = 0; j < c; j++){
		        for(int k = 0; k < 4; k++){
		            if(j-1 >= 0) dp[i][j][k] = max(dp[i][j][k], dp[i][j-1][k]);
		            if(j-1 >= 0 && k-1 >= 0) dp[i][j][k] = max(dp[i][j][k], dp[i][j-1][k-1] + rcv[i][j]);
		            if(i-1 >= 0) dp[i][j][0] = max(dp[i][j][0], dp[i-1][j][k]);
		            if(i-1 >= 0) dp[i][j][1] = max(dp[i][j][1], dp[i-1][j][k] + rcv[i][j]);
		        }
		    }
		}
		
		for(int k = 0; k < 4; k++){
		    result = max(result, dp[r-1][c-1][k]);
		}
		//System.out.println(Arrays.deepToString(dp));
		
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
