import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int h[] = new int[100010];

		String str[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			h[i] = Integer.parseInt(str[i]);
		}

		int dp[] = new int[100010];
		for (int i = 0; i < 100010; i++) {
			dp[i] = Integer.MAX_VALUE;
		}

		dp[0] = 0;

		for (int i = 1; i < n; i++) {
			dp[i] = Math.min(dp[i], dp[i - 1] + Math.abs(h[i] - h[i - 1]));
			if (i > 1)
				dp[i] = Math.min(dp[i], dp[i - 2] + Math.abs(h[i] - h[i - 2]));
		}

		System.out.println(dp[n - 1]);
	}
}
