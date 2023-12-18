import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int[] I = new int[N];
			for (int i = 0; i < N; ++i) {
				I[i] = sc.nextInt();
			}
			double best = Double.MAX_VALUE;
			int bs = 0;
			int ba = 0;
			int bc = 0;
			for (int s = 0; s < 16; ++s) {
				for (int a = 0; a < 16; ++a) {
					for (int c = 0; c < 16; ++c) {
						int[] hist = new int[256];
						int r = s;
						for (int i = 0; i < N; ++i) {
							r = (a * r + c) & 0xFF;
							hist[(I[i] + r) & 0xFF]++;
						}
						double e = 0;
						for (int i = 0; i < 256; ++i) {
							double v = 1.0 * hist[i] / N;
							if (v != 0) e -= v * Math.log(v);
						}
						if (e < best - 1e-10) {
							best = e;
							bs = s;
							ba = a;
							bc = c;
						}
					}
				}
			}
			System.out.println(bs + " " + ba + " " + bc);
		}
	}

}