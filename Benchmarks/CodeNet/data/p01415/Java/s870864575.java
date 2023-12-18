import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		int N = sc.nextInt();
		int K = sc.nextInt();
		int T = sc.nextInt();
		int U = sc.nextInt();
		int V = sc.nextInt();
		int L = sc.nextInt();
		int[] D = new int[N];
		for (int i = 0; i < N; ++i) {
			D[i] = sc.nextInt();
		}
		int pos = 0;
		double time = 0;
		double dist = 0;
		double bootEnd = -1;
		int carrot = 0;
		while (true) {
			if (bootEnd < 0) {
				if (carrot > 0) {
					--carrot;
					bootEnd = dist + T * V;
				} else {
					if (pos < N) {
						time += (D[pos] - dist) / U;
						dist = D[pos];
						++pos;
						++carrot;
					} else {
						time += (L - dist) / U;
						break;
					}
				}
			} else {
				if (pos < N) {
					if (bootEnd < D[pos]) {
						time += (bootEnd - dist) / V;
						dist = bootEnd;
						bootEnd = -1;
					} else {
						time += (D[pos] - dist) / V;
						dist = D[pos];
						if (carrot == K) {
							bootEnd = D[pos] + T * V;
						} else {
							++carrot;
						}
						++pos;
					}
				} else {
					if (bootEnd < L) {
						time += (bootEnd - dist) / V;
						dist = bootEnd;
						bootEnd = -1;
					} else {
						time += (L - dist) / V;
						break;
					}
				}
			}
		}
		System.out.println(time);
	}

}