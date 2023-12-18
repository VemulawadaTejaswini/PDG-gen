import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int K, R, L;
	static double P, E, T;

	public static void main(String[] args) {
		K = sc.nextInt();
		R = sc.nextInt();
		L = sc.nextInt();
		P = sc.nextDouble();
		E = sc.nextDouble();
		T = sc.nextDouble();
		System.out.printf("%.6f\n", rec(R, L, 0, 1));
	}

	static double rec(double r, double l, int k, double p) {
		if (l < T - E) return 0;
		if (T + E < r) return 0;
		if (T - E <= r && l <= T + E) return p;
		double h = (r + l) / 2;
		if (k == K) {
			return h < T - E || T + E < h ? 0 : p;
		}
		double ret = 0;
		ret += rec(r, h, k + 1, p * (h < T ? P : 1 - P));
		ret += rec(h, l, k + 1, p * (h < T ? 1 - P : P));
		return ret;
	}

}