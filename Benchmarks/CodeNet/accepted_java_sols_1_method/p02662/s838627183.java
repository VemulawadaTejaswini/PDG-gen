import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int s = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		int mod = 998244353;
		long[][] dp = new long[n + 1][s + 1];
		dp[0][0] = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= s; j++) {
				dp[i + 1][j] += dp[i][j] * 2;
				if (j + a[i] <= s) {
					dp[i + 1][j + a[i]] += dp[i][j];
				}
			}
			for (int j = 0; j <= s; j++) {
				dp[i + 1][j] %= mod;
			}
		}
//		for (int i = 0; i <= n; i++) {
//			for (int j = 0; j <= s; j++) {
//				System.out.print(dp[i][j] + "\t");
//			}
//			System.out.println();
//		}
		System.out.println(dp[n][s]);
	}
}
