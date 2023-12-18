
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int[] manju = new int[m];
		for (int i = 0; i < m; i++)
			manju[i] = scanner.nextInt();
		int[] dp = new int[m * 2];
		Arrays.fill(dp, 1 << 24);
		dp[0] = 0;
		for (int i = 0; i < n; i++) {
			int p = scanner.nextInt();
			int c = scanner.nextInt();
			for (int j = m * 2 - 1; j >= p; j--) {
				dp[j] = Math.min(dp[j], dp[j - p] + c);
			}
		}
		for (int i = m * 2 - 2; i >= 0; i--)
			dp[i] = Math.min(dp[i], dp[i + 1]);
		Arrays.sort(manju);
		int ans = 0;
		int sum = 0;
		for (int i = 0; i < m; i++) {
			sum += manju[m - i - 1];
			ans = Math.max(ans, sum - dp[i + 1]);
		}
		System.out.println(ans);
	}
}