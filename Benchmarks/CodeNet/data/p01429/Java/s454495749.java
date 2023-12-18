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
		System.out.println(dfs(-1, -1));

	}

	long dfs(int l, int r) {
		if (l > r) {
			int tmp = l;
			l = r;
			r = tmp;
		}
		int t = Math.max(l, r) + 1;
		if (t == N - 1) {
			return cost(l, t) + cost(r, t);
		}
		if (l != -1 && r != -1 && memo[l][r] != -1)
			return memo[l][r];
		long tmp = Math.min(dfs(t, r) + cost(l, t), dfs(l, t) + cost(r, t));
		if (l != -1 && r != -1)
			memo[l][r] = tmp;
		return tmp;
	}

	long cost(int l, int r) {
		if (l == -1) {
			return accum[r];
		} else if (r == -1) {
			return accum[l];
		}
		l = K[l];
		r = K[r];
		return Math.abs(accum[r] - accum[l] + S[l]);
	}

	long[][] memo = new long[2010][2010];
}