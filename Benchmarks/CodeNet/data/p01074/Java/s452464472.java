import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();
		ArrayList<ArrayList<Integer>> cs = new ArrayList<>();
		for (int i = 0; i < N * M; ++i) {
			cs.add(new ArrayList<>());
		}
		for (int i = 0; i < M; ++i) {
			int D = sc.nextInt();
			int A = sc.nextInt() - 1;
			int K = sc.nextInt();
			int T = sc.nextInt();
			int start = D * N + A;
			cs.get(start).add((K << 16) | T);
		}
		int[][] dp = new int[L + 1][N * M + 1];
		for (int i = 0; i < N * M; ++i) {
			for (int j = 0; j < L; ++j) {
				for (int c : cs.get(i)) {
					int len = c >> 16;
					int t = c & 0xFFFF;
					dp[j + 1][i + len] = Math.max(dp[j + 1][i + len], dp[j][i] + t);
				}
			}
			for (int j = 0; j <= L; ++j) {
				dp[j][i + 1] = Math.max(dp[j][i + 1], dp[j][i]);
			}
		}
		int ans = 0;
		for (int i = 0; i <= L; ++i) {
			ans = Math.max(ans, dp[i][N * M]);
		}
		System.out.println(ans);
	}
}