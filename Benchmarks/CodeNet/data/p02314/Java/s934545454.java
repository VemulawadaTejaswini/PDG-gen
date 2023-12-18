import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int[] c = new int[n];
		st = new StringTokenizer(reader.readLine());
		for (int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		reader.close();
		int ans = getMinNoOfCoins(m, c);
		System.out.println(ans);
	}
	
	private int getMinNoOfCoins(int m, int[] coins) {
		int[] dp = new int[m+1];
		for (int i = 1; i < dp.length; i++) {
			dp[i] = Integer.MAX_VALUE;
		}
		for (int coin : coins) {
			for (int i = coin; i <= m; i++) {
				dp[i] = Math.min(dp[i], dp[i-coin] + 1);
			}
		}
		return dp[m];
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}
