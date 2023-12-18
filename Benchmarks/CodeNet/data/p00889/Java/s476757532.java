import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int N = sc.nextInt();
			int S = sc.nextInt();
			int W = sc.nextInt();
			int Q = sc.nextInt();
			if (N == 0 && S == 0 && W == 0 && Q == 0)
				break;
			int g = S;
			long[] a = new long[N];
			for (int i = 0; i < N; ++i) {
				a[N - 1 - i] = (g / 7) % 10;
				if (g % 2 == 0) {
					g = (g / 2);
				} else {
					g = (g / 2) ^ W;
				}
			}

			int[] seq = new int[N];
			long pow10 = 1;
			int zeropos = 0;
			int[] count = new int[Q];
			count[0] = 1;
			int ans = 0;
			for (int i = 0; i < N; ++i) {
				if (Q != 2 && Q != 5) {
					seq[i] = (int) (((i > 0 ? seq[i - 1] : 0) + pow10 * a[i]) % Q);
					if (a[i] != 0)
						ans += count[seq[i]];
					++count[seq[i]];
					pow10 = pow10 * 10 % Q;
				} else {
					if (a[i] % Q == 0) {
						++zeropos;
					}
					if (a[i] != 0) {
						ans += zeropos;
					}
				}
			}
			System.out.println(ans);
			System.gc();
		}
	}
}