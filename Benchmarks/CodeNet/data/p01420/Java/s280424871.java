import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();
		double[] P = new double[N];
		int[] T = new int[N];
		int[] V = new int[N];
		for (int i = 0; i < N; ++i) {
			P[i] = sc.nextInt() * 0.01;
			T[i] = sc.nextInt();
			V[i] = sc.nextInt();
		}
		double[][] comb = new double[M + 1][M + 1];
		for (int i = 0; i <= M; ++i) {
			comb[i][0] = comb[i][i] = 1;
		}
		for (int i = 0; i <= M; ++i) {
			for (int j = 1; j < i; ++j) {
				comb[i][j] = comb[i - 1][j] + comb[i - 1][j - 1];
			}
		}
		double[][] time = new double[N][M + 1];
		double[][] prob = new double[N][M + 1];
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j <= M; ++j) {
				time[i][j] = 1. * L / V[i] + j * T[i];
				prob[i][j] = comb[M][j] * Math.pow(P[i], j) * Math.pow(1 - P[i], M - j);
			}
		}
		double EPS = 1e-9;
		for (int i = 0; i < N; ++i) {
			double sum = 0;
			for (int j = 0; j <= M; ++j) {
				double t = time[i][j];
				double p = prob[i][j];
				for (int k = 0; k < N; ++k) {
					if (k == i) continue;
					double win = 1;
					for (int l = 0; l <= M; ++l) {
						if (time[k][l] - EPS > t) break;
						win -= prob[k][l];
					}
					p *= win;
				}
				sum += p;
			}
			System.out.printf("%.8f\n", sum);
		}
	}

}