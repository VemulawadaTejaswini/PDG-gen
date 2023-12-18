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
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		int m = Integer.parseInt(reader.readLine());
		st = new StringTokenizer(reader.readLine());
		for (int i = 0; i < m; i++) {
			if (subsetSum(n, a, Integer.parseInt(st.nextToken()))) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		reader.close();
	}
	
	private boolean subsetSum(int n, int[] a, int s) {
		boolean[][] dp = new boolean[n+1][s+1];
		dp[0][0] = true;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= s; j++) {
				if (j < a[i]) {
					dp[i+1][j] = dp[i][j];
				} else {
					dp[i+1][j] = dp[i][j] || dp[i][j-a[i]];
				}
			}
		}
		return dp[n][s];
	}
}
