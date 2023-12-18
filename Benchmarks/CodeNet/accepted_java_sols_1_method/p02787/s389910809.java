import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int H = sc.nextInt();
			int N = sc.nextInt();
			int[] A = new int[N];
			int[] B = new int[N];
			int max = 0;
			for (int i = 0; i < N; i++) {
				int a = sc.nextInt();
				A[i] = a;
				B[i] = sc.nextInt();
				if (a > max)
					max = a;
			}
			int[] dp = new int[H + max];
			for (int i = 1; i < H + max; i++) {
				dp[i] = -1;
			}
			for (int j = 0; j < H; j++) {
				for (int i = 0; i < N; i++) {
					if (dp[j] == -1) {
						continue;
					}
					if (dp[j] + B[i] < dp[j + A[i]] || dp[j + A[i]] == -1) {
						dp[j + A[i]] = dp[j] + B[i];
					}
				}
			}
			int ans = Integer.MAX_VALUE;
			for (int i = H; i < H + max; i++) {
				if (dp[i] < ans && dp[i] != -1) {
					ans = dp[i];
				}
			}
			System.out.print(ans);
		}
	}
}
