import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] H = new int[N];
		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}
		int[] dp = new int[N];
		Arrays.fill(dp, (int)2e9);
		dp[0] = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 1; j <= K && i + j < N; j++) {
				if (dp[i] + Math.abs(H[i] - H[i + j]) < dp[i + j]) {
					dp[i + j] = dp[i] + Math.abs(H[i] - H[i + j]);
				}
			}
		}
		System.out.println(dp[N - 1]);
	}

}
