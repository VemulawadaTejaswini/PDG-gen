import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int h = Integer.parseInt(str[0]);
		int n = Integer.parseInt(str[1]);

		int a[] = new int[n];
		int b[] = new int[n];
		for (int i = 0; i < n; i++) {
			str = br.readLine().split(" ");

			a[i] = Integer.parseInt(str[0]);
			b[i] = Integer.parseInt(str[1]);
		}

		int dp[][] = new int[n + 1][h + 1];

		for (int i = 0; i <= n; i++) {
			Arrays.fill(dp[i], 1_000_000_000);
		}
		dp[0][0] = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= h; j++) {
				dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j]);
				dp[i + 1][Math.min(j + a[i], h)] = Math.min(dp[i + 1][Math.min(j + a[i], h)], dp[i + 1][j] + b[i]);
			}
		}

		System.out.println(dp[n][h]);
	}
}