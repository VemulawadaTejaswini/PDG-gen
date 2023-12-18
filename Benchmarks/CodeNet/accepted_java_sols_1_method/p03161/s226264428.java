import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int h[] = new int[N+1];
		long dp[] = new long[N+1];
		for (int i = 1; i <= N; i++) {
			h[i] = sc.nextInt();
		}

		Arrays.fill(dp,1,N + 1, Integer.MAX_VALUE);
		dp[1] = 0;

		for (int i = 1; i < N; i++){
			for (int j = 1; j <= K; j++) {
				if (i <= N-j) {
					dp[i + j] = Math.min(dp[i + j], dp[i] + Math.abs(h[i] - h[i + j]));
				}
			}
//			dp[i + 1] = Math.min(dp[i + 1], dp[i] + Math.abs(h[i] - h[i + 1]));
		}
	  System.out.println(dp[N]);

	}
}
