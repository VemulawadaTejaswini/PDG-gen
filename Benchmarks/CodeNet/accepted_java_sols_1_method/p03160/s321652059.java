import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int h[] = new int[N];

		int a = 0;
		int b = 0;

		for (int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}

		int dp[] = new int[N];
		dp[0] = 0;
		dp[1] = Math.abs(h[1] - h[0]);

		for (int i = 2; i < N; i++) {

			a = dp[i - 2] + Math.abs(h[i] - h[i - 2]);
			b = dp[i - 1] + Math.abs(h[i] - h[i - 1]);

			if (a < b) {
				dp[i] = a;
			} else {
				dp[i] = b;
			}
		}

		System.out.print(dp[N-1]);

	}
}
