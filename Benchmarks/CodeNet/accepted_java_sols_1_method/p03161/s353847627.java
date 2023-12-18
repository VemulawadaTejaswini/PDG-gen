import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int[] dp = new int[N];
		dp[0] = 0;
		dp[1] = Math.abs(arr[0] - arr[1]);

		for (int i = 2; i < N; i++) {
			dp[i] = Integer.MAX_VALUE;

			for (int j = 1; j <= K; j++) {
				if (i - j < 0)
					break;
				dp[i] = Math.min(dp[i], dp[i-j] + Math.abs(arr[i] - arr[i-j]));
			}
		}

		System.out.println(dp[N-1]);
	}
}