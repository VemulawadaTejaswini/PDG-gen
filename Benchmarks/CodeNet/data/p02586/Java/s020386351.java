import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		int k = Integer.parseInt(sa[2]);
		int[][] v = new int[h + 1][w + 1];
		for (int i = 0; i < k; i++) {
			sa = br.readLine().split(" ");
			int r = Integer.parseInt(sa[0]);
			int c = Integer.parseInt(sa[1]);
			v[r][c] = Integer.parseInt(sa[2]);
		}
		br.close();

		long[][][] dp = new long[h + 1][w + 1][4];
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				long ue = max(dp[i - 1][j]);
				dp[i][j][0] = Math.max(ue, dp[i][j - 1][0]);
				dp[i][j][1] = dp[i][j - 1][1];
				dp[i][j][2] = dp[i][j - 1][2];
				dp[i][j][3] = dp[i][j - 1][3];
				if (v[i][j] > 0) {
					dp[i][j][1] = Math.max(dp[i][j][1], ue + v[i][j]);
					dp[i][j][1] = Math.max(dp[i][j][1], dp[i][j - 1][0] + v[i][j]);
					dp[i][j][2] = Math.max(dp[i][j][2], dp[i][j - 1][1] + v[i][j]);
					dp[i][j][3] = Math.max(dp[i][j][3], dp[i][j - 1][2] + v[i][j]);
				}
			}
		}
		System.out.println(max(dp[h][w]));
	}

	static long max(long[] a) {
		long ret = 0;
		for (int i = 0; i < a.length; i++) {
			ret = Math.max(ret, a[i]);
		}
		return ret;
	}
}
