import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] a = new int[n];
		StringTokenizer st = new StringTokenizer(reader.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		int q = Integer.parseInt(reader.readLine());
		st = new StringTokenizer(reader.readLine());
		for (int i = 0; i < q; i++) {
			if (subsetSum(Integer.parseInt(st.nextToken()), a)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		reader.close();
	}

	private boolean subsetSum(int s, int[] a) {
		int n = a.length;
		boolean[][] dp = new boolean[n+1][s+1];
		for (int i = 1; i <= n; i++) {
			int v = a[i-1];
			for (int j = 0; j <= s; j++) {
				if (v == j) {
					dp[i][j] = true;
				} else if (v > j) {
					dp[i][j] = dp[i-1][j];
				} else {
					dp[i][j] = /*dp[i-1][j] ||*/ dp[i-1][j-v];
				}
			}
		}
		return dp[n][s];
	}
}
