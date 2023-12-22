import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		char[][] grid = new char[h][w];
		for (int i = 0; i < h; i++) {
			grid[i] = br.readLine().toCharArray();
		}
		br.close();

		long[][] dp = new long[h + 1][w + 1];
		dp[1][1] = 1;
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				if (grid[i - 1][j - 1] == '.') {
					dp[i][j] += dp[i][j - 1];
					dp[i][j] += dp[i - 1][j];
					dp[i][j] %= 1000000007;
				}
			}
		}
		System.out.println(dp[h][w]);
	}
}
