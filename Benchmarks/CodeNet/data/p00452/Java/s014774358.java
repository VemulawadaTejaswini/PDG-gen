import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, w;
		long arrow[];
		long kk[];
		boolean flag;
		long max;

		while (true) {
			n = sc.nextInt();
			w = sc.nextInt();
			if ((n | w) == 0) {
				break;
			}
			arrow = new long[n + 1];
			kk = new long[(n + 1) * (n + 1)];
			max = 0;

			arrow[0] = 0;
			for (int i = 1; i <= n; i++) {
				arrow[i] = sc.nextLong();
			}

			for (int i = 0; i <= n; i++) {
				for (int j = 0; j <= n; j++) {
					kk[i * (n + 1) + j] = arrow[i] + arrow[j];
				}
			}

			Arrays.sort(kk);
			int index = 0;
			for (int i = 0; i < kk.length - 1; i++) {
				if (kk[i] != kk[i + 1]) {
					kk[index++] = kk[i];
				}
			}
			kk[index++] = kk[kk.length - 1];

			for (int i = 0; i <= n; i++) {
				for (int j = 0; j <= n; j++) {
					max = search(kk, 0, index - 1, arrow[i] + arrow[j], w);
				}
			}
			System.out.println(max);
		}
	}

	public static long search(long kk[], int low, int high, long k1k2, int w) {
		if (high < low) {
			if (k1k2 <= w) {
				return k1k2;
			} else {
				return 0;
			}
		}

		int mid = (low + high) / 2;
		long max = 0;

		if (w < k1k2 + kk[mid]) {
			return search(kk, low, mid - 1, k1k2, w);
		} else if (w == k1k2 + kk[mid]) {
			return w;
		} else if (k1k2 + kk[mid] < w) {
			max = k1k2 + kk[mid];
			long k = search(kk, mid + 1, high, k1k2, w);
			if (max < k) {
				max = k;
			}
		}

		return max;
	}
}