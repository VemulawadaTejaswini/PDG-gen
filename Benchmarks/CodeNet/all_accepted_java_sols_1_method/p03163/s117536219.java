import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int N = Integer.parseInt(str[0]);
		int W = Integer.parseInt(str[1]);

		int w[] = new int[110];
		int v[] = new int[110];

		for (int i = 0; i < N; i++) {
			str = br.readLine().split(" ");
			w[i] = Integer.parseInt(str[0]);
			v[i] = Integer.parseInt(str[1]);
		}

		long dp[][] = new long[110][W + 1];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= W; j++) {
				if (j - w[i] >= 0)
					dp[i + 1][j] = Math.max(dp[i][j], dp[i][j - w[i]] + v[i]);

				dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j]);
			}
		}

		System.out.println(dp[N][W]);
	}
}
