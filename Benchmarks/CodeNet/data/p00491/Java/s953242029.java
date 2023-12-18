import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * Pasta
 * JOI 11th, Pre 4
 */
public class Main {

	static final int MOD = 10000;
	static int N;
	static int[] plan;
	static int[][][] memo;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();

		N = parseInt(line.substring(0, line.indexOf(' ')));
		int K = parseInt(line.substring(line.indexOf(' ') + 1));

		plan = new int[N + 1];

		for (int i = 0; i < K; i++) {
			line = br.readLine();
			int A, B;
			A = parseInt(line.substring(0, line.indexOf(' ')));
			B = parseInt(line.substring(line.indexOf(' ') + 1));
			plan[A] = B;
		}

		memo = new int[N + 1][4][3];

		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= 3; j++) {
				Arrays.fill(memo[i][j], -1);
			}
		}

		int count = solve(0, 0, 0);

		System.out.println(count);

	}

	//d ??\????????£?¶? s ?????????????????? p ????£??????????
	static int solve(int d, int p, int s) {

		if (d == N) return 1;

		if (memo[d][p][s] != -1) return memo[d][p][s];

		int ret = 0;

		if (plan[d + 1] != 0) {
			if (p == plan[d + 1]) {
				if (s == 1) ret = solve(d + 1, plan[d + 1], 2);
			} else {
				ret = solve(d + 1, plan[d + 1], 1);
			}
		} else {
			for (int _p = 1; _p <= 3; _p++) {
				if (_p == p) {
					if (s == 1) ret += solve(d + 1, _p, 2);
				} else {
					ret += solve(d + 1, _p, 1);
				}
			}
		}

		memo[d][p][s] = ret % MOD;

		return memo[d][p][s];
	}
}