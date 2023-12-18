import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
	static List<Integer> path;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int ma = Integer.parseInt(sa[1]);
		int mb = Integer.parseInt(sa[2]);

		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			a[i] = Integer.parseInt(sa[0]);
			b[i] = Integer.parseInt(sa[1]);
			c[i] = Integer.parseInt(sa[2]);
		}
		br.close();

		int[][] dp = new int[401][401];
		for (int i = 0; i < 401; i++) {
			for (int j = 0; j < 401; j++) {
				dp[i][j] = Integer.MAX_VALUE;
			}
		}
		for (int k = 0; k < n; k++) {
			int ak = a[k];
			int bk = b[k];
			int ck = c[k];
			for (int i = 10 * k; i > 0; i--) {
				for (int j = 10 * k; j > 0; j--) {
					if (dp[i][j] != Integer.MAX_VALUE) {
						dp[i + ak][j + bk] = Math.min(dp[i + ak][j + bk], dp[i][j] + ck);
					}
				}
			}
			dp[ak][bk] = Math.min(dp[ak][bk], ck);
		}

		int ans = Integer.MAX_VALUE;
		for (int i = 0, j = 0; i < 401 && j < 401; i += ma, j += mb) {
			ans = Math.min(ans, dp[i][j]);
		}
		if (ans == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}
	}
}
