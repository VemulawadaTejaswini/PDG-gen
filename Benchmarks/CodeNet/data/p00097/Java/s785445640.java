import java.util.*;
import java.io.*;

public class Main {
	public void solve() throws IOException {
		int n = nextInt();
		int s = nextInt();
		long[][][] dp = new long[10][10][1010];
		for(int i = 1; i <= 9; i++){
			dp[i][0][0] = 1;
			for(int j = 1; j <= i; j++){
				for(int k = 0; k < dp[i][j].length; k++){
					if( dp[i][j-1][k] > 0 ){
						for(int l = 1; l <= 100 && k+l < dp[i][j].length; l++){
							int idx = (i-j+1)*l+k;
							if( idx >= dp[i][j].length ){
								break;
							}
							dp[i][j][idx] += dp[i][j-1][k];
						}
					}
				}
			}
		}
		while( n != 0 || s != 0 ){
			writer.println(dp[n][n][s+n]);
			n = nextInt();
			s = nextInt();
		}
	/*	for(int i = 1; i < 4; i++){
			for(int j = 0; j < 20; j++){
				writer.println("i = " + i + ", j = " + j + ", " + dp[i][i][j+i]);
			}
		}*/
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	BufferedReader reader;
	StringTokenizer tokenizer;
	PrintWriter writer;

	public void run() throws IOException {
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			tokenizer = null;
			writer = new PrintWriter(System.out);
			solve();
			reader.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String nextToken() throws IOException {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}

	public int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}
}