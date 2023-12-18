import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		boolean[] dp = new boolean[K + 1];
		for (int i = A[0]; i <= K; i++) {
			for (int j = 0; j < N && i - A[j] >= 0; j++) {
				if (!dp[i - A[j]]) {
					dp[i] = true;
					break;
				}
			}
		}
		System.out.println(dp[K] ? "First" : "Second");
	}
}