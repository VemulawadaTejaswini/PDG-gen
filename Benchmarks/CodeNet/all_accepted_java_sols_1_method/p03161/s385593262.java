import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		int h[] = new int[100010];

		str = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			h[i] = Integer.parseInt(str[i]);
		}

		int dp[] = new int[100010];
		for (int i = 0; i < 100010; i++) {
			dp[i] = Integer.MAX_VALUE;
		}

		dp[0] = 0;

		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= k; j++) {
				if (i > j - 1)
					dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(h[i] - h[i - j]));
			}
		}

		System.out.println(dp[n-1]);
	}
}
