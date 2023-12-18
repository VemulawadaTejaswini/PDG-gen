import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solver();
	}

	long[] accum;
	long[] S;
	int N, M, L;
	int[] K;

	void solver() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		L = sc.nextInt();
		K = new int[N];
		S = new long[M];
		for (int i = 0; i < N; i++) {
			K[i] = sc.nextInt() - 1;
		}
		for (int i = 0; i < M; i++) {
			S[i] = sc.nextLong();
		}
		accum = new long[M];
		for (int i = 0; i < M; i++) {
			if (i >= 1)
				accum[i] += accum[i - 1];
			accum[i] += S[i];
		}
		Arrays.sort(K);
		for (int i = 0; i < 2010; i++) {
			for (int j = 0; j < 2010; j++) {
				memo[i][j] = -1;
			}
		}
		System.out.println(dfs(0, 0));

	}

	long dfs(int l, int r) {
		if (l > r) {
			int tmp = l;
			l = r;
			r = tmp;
		}
		int t = Math.max(l, r) + 1;
		if (t == N - 1) {
			return cost(t, l) + cost(t, r);
		}
		if (memo[l][r] != -1)
			return memo[l][r];
		return memo[l][r] = Math.min(cost(t, l) + dfs(t, r), dfs(l, t) + cost(t, r));
	}

	long cost(int l, int r) {
		l = K[l];
		r = K[r];
		return Math.abs((accum[r] - accum[l] + S[l]) / L);
	}

	long[][] memo = new long[2010][2010];
}