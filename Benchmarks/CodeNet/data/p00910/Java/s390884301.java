import java.util.BitSet;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N, M, R;
	static int[][] S, T;
	static int[] E = new int[3];

	public static void main(String[] args) throws Exception {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			M = sc.nextInt();
			R = sc.nextInt();
			S = new int[N][4];
			T = new int[M][4];
			for (int i = 0; i < N; ++i) {
				S[i][0] = sc.nextInt();
				S[i][1] = sc.nextInt();
				S[i][2] = sc.nextInt();
				S[i][3] = sc.nextInt();
			}
			for (int i = 0; i < M; ++i) {
				T[i][0] = sc.nextInt();
				T[i][1] = sc.nextInt();
				T[i][2] = sc.nextInt();
				T[i][3] = sc.nextInt();
			}
			E[0] = sc.nextInt();
			E[1] = sc.nextInt();
			E[2] = sc.nextInt();

			BitSet[] bs = new BitSet[M];
			for (int i = 0; i < M; ++i) {
				bs[i] = new BitSet(N);
				for (int j = 0; j < N; ++j) {
					bs[i].set(j, cross(j, i));
				}
			}
			double[] v = new double[M];
			for (int i = 0; i < M; ++i) {
				v[i] = 1. * T[i][3] / (sq(T[i][0] - E[0]) + sq(T[i][1] - E[1]) + sq(T[i][2] - E[2]));
			}
			double ans = 0;
			for (int i = 1; i < (1 << M); ++i) {
				BitSet set = new BitSet(N);
				double sum = 0;
				for (int j = 0; j < M; ++j) {
					if ((i & (1 << j)) != 0) {
						set.or(bs[j]);
						sum += v[j];
					}
				}
				if (sum > ans && set.cardinality() <= R) ans = sum;
			}

			System.out.printf("%.6f\n", ans);
		}
	}

	static boolean cross(int bi, int li) {
		boolean in1 = inside(bi, T[li][0], T[li][1], T[li][2]);
		boolean in2 = inside(bi, E[0], E[1], E[2]);
		if (in1 != in2) return true;
		if (in1 && in2) return false;
		double den = sq(E[0] - T[li][0]) + sq(E[1] - T[li][1]) + sq(E[2] - T[li][2]);
		double num = (S[bi][0] - T[li][0]) * (E[0] - T[li][0]) + (S[bi][1] - T[li][1]) * (E[1] - T[li][1])
				+ (S[bi][2] - T[li][2]) * (E[2] - T[li][2]);
		double t = num / den;
		if (t < 0 || t > 1) return false;
		double xt = T[li][0] + t * (E[0] - T[li][0]);
		double yt = T[li][1] + t * (E[1] - T[li][1]);
		double zt = T[li][2] + t * (E[2] - T[li][2]);
		double dist = sq(xt - S[bi][0]) + sq(yt - S[bi][1]) + sq(zt - S[bi][2]);
		return dist <= sq(S[bi][3]) + 1e-9;
	}

	static boolean inside(int bi, int x, int y, int z) {
		return sq(x - S[bi][0]) + sq(y - S[bi][1]) + sq(z - S[bi][2]) < sq(S[bi][3]);
	}

	static int sq(int v) {
		return v * v;
	}

	static double sq(double v) {
		return v * v;
	}
}