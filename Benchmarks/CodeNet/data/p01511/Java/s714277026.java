import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		run();
	}

	static void run() {
		new Main().solver();
	}

	long MOD = 1_000_000_009;

	void solver() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			long w = sc.nextLong(), h = sc.nextLong();
			int n = sc.nextInt();
			if (w == 0 && h == 0 && n == 0)
				break;
			long[][] obs = new long[n][2];
			for (int i = 0; i < n; i++) {
				obs[i] = new long[] { sc.nextLong() - 1, sc.nextLong() - 1 };
			}
			Arrays.sort(obs, new Comparator<long[]>() {
				@Override
				public int compare(long[] o1, long[] o2) {
					return Long.compare(o1[1], o2[1]);
				}
			});
			long[][] ans = new long[(int) w][1];
			ans[0][0] = 1;
			long[][] A = new long[(int) w][(int) w];
			for (int i = 0; i < w; i++) {
				if (i < w - 1) {
					A[i][i + 1] = 1;
					A[i + 1][i] = 1;
				}
				A[i][i] = 1;
			}
			long cur_y = 0;
			for (int i = 0; i < n; i++) {

				ans = MtPow(obs[i][1] - cur_y, A, ans);
				// tr(ans);
				cur_y = obs[i][1];
				ans[(int) obs[i][0]][0] = 0;
			}
			ans = MtPow((h - 1) - cur_y, A, ans);
			System.out.println("Case " + (count++) + ": " + ans[(int) w - 1][0]);
		}
	}

	int count = 1;

	long[][] MtPow(long n, long[][] A, long[][] v) {
		for (; n > 0; n = n >> 1) {
			if ((n & 1) == 1)
				v = MtPrd(A, v);
			A = MtPrd(A, A);
		}
		return v;
	}

	long[][] MtPrd(long[][] A, long[][] B) {
		long[][] C = new long[A.length][B[0].length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B[0].length; j++) {
				for (int k = 0; k < A[0].length; k++) {
					C[i][j] += A[i][k] * B[k][j] % MOD;
					C[i][j] %= MOD;
				}
			}
		}
		return C;
	}

	void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}