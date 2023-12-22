import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine().trim();
		String[] arr = line.split(" ");
		final int n = Integer.parseInt(arr[0]);
		final int m = Integer.parseInt(arr[1]);

		final int[] c = new int[m];
		line = br.readLine().trim();
		arr = line.split(" ");
		for (int i = 0; i < m; i++) {
			c[i] = Integer.parseInt(arr[i]);
		}
		br.close();

		final int[] dp = new int[n + 1];
		Arrays.fill(dp, 50000);
		dp[0] = 0;

		for (int i = 0; i < m; i++) {
			for (int j = c[i]; j <= n; j++) {
				dp[j] = Math.min(dp[j], dp[j - c[i]] + 1);
			}
		}

		System.out.println(dp[n]);
	}
}