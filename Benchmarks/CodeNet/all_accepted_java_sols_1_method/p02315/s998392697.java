import java.util.*;
class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		int[] v = new int[N];
		int[] w = new int[N];
        for (int i = 0; i < N; i++) {
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }
		int[] dp = new int[W+1];
		for (int i = 0; i < N; i++) {
			for (int j = W-w[i]; j >= 0; j--) {
				dp[j+w[i]] = Math.max(dp[j+w[i]], dp[j] + v[i]);
			}
		}
		System.out.println(dp[W]);
	}
}
