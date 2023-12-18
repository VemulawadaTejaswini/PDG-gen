import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N, K;
	static double T, L, U, V;

	public static void main(String[] args) throws Exception {
		N = sc.nextInt();
		K = sc.nextInt();
		T = sc.nextInt();
		U = sc.nextInt();
		V = sc.nextInt();
		L = sc.nextInt();
		double[] D = new double[N + 1];
		for (int i = 0; i < N; ++i) {
			D[i] = sc.nextInt();
		}
		D[N] = L;
		int carrot = 0;
		double sep = D[0];
		double time = D[0] / U;
		for (int i = 0; i < N; ++i) {
			System.out.println(time);
			++carrot;
			if (sep >= D[i + 1]) {
				time += (D[i + 1] - D[i]) / V;
				if (carrot > K) {
					sep = D[i] + V * T;
					carrot = K;
				}
				continue;
			}
			int need = (int) Math.ceil((D[i + 1] - sep) / (T * V));
			if (need > carrot) {
				time += (sep - D[i]) / V + T * carrot + (D[i + 1] - sep - V * T * carrot) / U;
				sep = D[i + 1];
				carrot = 0;
			} else {
				time += (D[i + 1] - D[i]) / V;
				sep += V * T * need;
				carrot -= need;
			}
		}
		System.out.println(time);
	}
}