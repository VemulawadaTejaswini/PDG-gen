import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<Integer>[] edges = new List[N];
		for (int i = 0; i < N; i++) {
			edges[i] = new LinkedList<>();
		}
		for (int i = 0; i < M; i++) {
			edges[sc.nextInt() - 1].add(sc.nextInt() - 1);
		}
		int s = sc.nextInt() - 1;
		int t = sc.nextInt() - 1;
		int[][] dp = new int[N][3];
		for (int i = 0; i < N; i++) {
			Arrays.fill(dp[i], 1 << 25);
		}
		dp[s][0] = 0;
		Queue<int[]> Q = new LinkedList<>();
		Q.add(new int[] {s, 0});
		while (!Q.isEmpty()) {
			int u = Q.peek()[0];
			int d = Q.poll()[1];
			if (u == t && d == 0) {
				System.out.println(dp[u][d]/3);
				return;
			}
			for (int v: edges[u]) {
				if (dp[v][(d + 1) % 3] > dp[u][d] + 1) {
					dp[v][(d + 1) % 3] = dp[u][d] + 1;
					Q.add(new int[] {v, (d + 1) % 3});
				}
			}
		}
		System.out.println(-1);
	}
}