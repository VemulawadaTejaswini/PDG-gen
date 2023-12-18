import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		Arrays.setAll(A, i -> sc.nextInt());
		Arrays.sort(A);
		boolean[] dp = new boolean[1000001];
		for (int i = 1; i < n; i++) {
			if (A[i] == A[i - 1]) {
				if (!dp[A[i]]) {
					for (int j = A[i]; j < 1000001; j += A[i]) {
						dp[j] = true;
					}
				}
			}
		}
		long ans = 0;
		for (int i = 0; i < n; i++) {
			if (!dp[A[i]]) {
				ans++;
				for (int j = A[i]; j < 1000001; j += A[i]) {
					dp[j] = true;
				}
			}
		}
		System.out.println(ans);
	}

}
