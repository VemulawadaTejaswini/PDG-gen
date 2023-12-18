import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N, M;
	static double[][] P;
	static double[][] memo;

	public static void main(String[] arg) {
		M = sc.nextInt();
		N = sc.nextInt();
		P = new double[M][N];
		memo = new double[N + 1][1 << M];
		for (double[] a : memo) {
			Arrays.fill(a, -1);
		}
		for (int i = 0; i < M; ++i) {
			for (int j = 0; j < N; ++j) {
				P[i][j] = sc.nextDouble();
			}
		}
		System.out.println(rec(0, 0));
	}

	static double rec(int pos, int st) {
		if (pos == N) return 1;
		if (memo[pos][st] != -1) return memo[pos][st];
		double ret = 0;
		for (int i = 0; i < M; ++i) {
			if ((st & (1 << i)) != 0) continue;
			double prob = 0;
			int nst = st + (1 << i);
			double np = 1;
			for (int j = pos; j < N; ++j) {
				prob += np * (1 - P[i][j]) * rec(j, nst);
				np *= P[i][j];
			}
			prob += np * rec(N, nst);
			ret = Math.max(ret, prob);
		}
		memo[pos][st] = ret;
		return ret;
	}
}