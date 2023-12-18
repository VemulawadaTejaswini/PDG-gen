import java.util.Scanner;
import java.lang.Math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] dp = new int[N];
		int[] h = new int[N];

		for (int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}

		dp[0] = 0;

		for (int i = 1; i < N; i++) {
			dp[i] = Integer.MAX_VALUE;
		}

		for (int i = 1; i < N; i++) {
			for (int j = 1; j <= K; j++) {
				if (i - j >= 0) {
					int cost = Math.abs(h[i] - h[i - j]);
					dp[i] = Math.min(dp[i], dp[i - j] + cost);
				}
			}
		}
		System.out.println(dp[N - 1]);
	}

}
