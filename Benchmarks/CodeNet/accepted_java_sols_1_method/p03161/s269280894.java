import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		int[] dp = new int[N];
		Arrays.fill(dp, (int)Double.POSITIVE_INFINITY);
		dp[0] = 0;

		for (int i = 1; i < N; i++) {
			for (int j = 1; j <= K; j++) {
				if (i - j >= 0)
					dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(a[i] - a[i - j]));
			}
		}

		System.out.println(dp[N - 1]);
	}

}
