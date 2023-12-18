import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * One-Dimensional Cellular Automaton - Accepted
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			StringTokenizer st = new StringTokenizer(line);

			int N, M, A, B, C, T;
			N = parseInt(st.nextToken());
			M = parseInt(st.nextToken());
			A = parseInt(st.nextToken());
			B = parseInt(st.nextToken());
			C = parseInt(st.nextToken());
			T = parseInt(st.nextToken());
			if ((N | M | A | B | C | T) == 0) break;

			//
			int[][] mat = new int[N][N];

			for (int i = 0; i < N; i++) {
				if (i - 1 >= 0) mat[i][i - 1] = A;
				mat[i][i] = B;
				if (i + 1 < N) mat[i][i + 1] = C;
			}

			int[][] aa = pow(mat, T, M);

			//
			st = new StringTokenizer(br.readLine());

			int[][] S = new int[N][1];

			for (int i = 0; i < N; i++) {
				S[i][0] = parseInt(st.nextToken());
			}

			S = mul(aa, S, M);

			String[] SS = new String[N];

			for (int i = 0; i < N; i++) {
				SS[i] = String.valueOf(S[i][0]);
			}

			System.out.println(String.join(" ", SS));
		}
	}

	static int[][] mul(int[][] a, int[][] b, int mod) {

		int[][] t = new int[a.length][b[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < b.length; k++) {
				for (int j = 0; j < b[0].length; j++) {
					t[i][j] = (t[i][j] + a[i][k] * b[k][j]) % mod;
				}
			}
		}

		return t;
	}

	static int[][] pow(int[][] a, int e, int mod) {

		if (e == 0) {
			int[][] t = new int[a.length][a[0].length];
			for (int i = 0; i < a.length; i++) {
				t[i][i] = 1;
			}
			return t;
		}

		if (e == 1) return a;

		int[][] t = {};

		t = pow(mul(a, a, mod), e / 2, mod);
		if (e % 2 == 1) t = mul(t, a, mod);

		return t;
	}
}