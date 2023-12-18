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

		for (int i = 0; i < N; i++) {
			for (int j = 1; j <= K; j++) {
				if (i + j < N)
					dp[i + j] = Math.min(dp[i + j], dp[i] + Math.abs(a[i] - a[i + j]));
			}
		}

		System.out.println(dp[N - 1]);
	}

}
