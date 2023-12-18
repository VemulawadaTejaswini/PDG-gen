import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Chain
 * JOI 2009 予選3
 */
public class Main {

	private static int[] C;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int N = parseInt(line);
			if (N == 0) break;

			C = new int[N + 2];

			C[N + 1] = 4;

			for (int i = 1; i <= N; i++) {
				C[i] = parseInt(br.readLine());
			}

			int ans = 0;

			for (int i = 1; i <= N; i++) {
				if (C[i] != 1) ans = Math.max(ans, solve(i, 1));
				if (C[i] != 2) ans = Math.max(ans, solve(i, 2));
				if (C[i] != 3) ans = Math.max(ans, solve(i, 3));
			}

			System.out.println(N - ans);
		}
	}

	private static int solve(int i, int c) {

		int p = i, q = i, l = 0, r = 0, ret = 0;

		while (C[p - 1] == c) {
			l++;
			p--;
		}
		while (C[q + 1] == c) {
			r++;
			q++;
		}
		if (l + r + 1 >= 4) {
			ret = l + r + 1;
			ret += solve2(p, q);
		}

		return ret;
	}

	private static int solve2(int p, int q) {

		int l = 0, r = 0, ret = 0;

		if (C[p - 1] == C[q + 1]) {
			int c = C[p - 1];
			while (C[p - 1] == c) {
				p--;
				l++;
			}
			while (C[q + 1] == c) {
				q++;
				r++;
			}
			if (l + r >= 4) {
				ret += l + r;
				ret += solve2(p, q);
			}
		}

		return ret;
	}
}
