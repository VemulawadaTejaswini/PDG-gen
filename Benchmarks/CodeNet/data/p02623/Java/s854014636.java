
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();

			int[] a = new int[n];
			long[] asum = new long[n];
			int amax = -1;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				if (i == 0) {
					asum[i] = a[i];
				} else {
					asum[i] = a[i] + asum[i - 1];
				}
				if (asum[i] <= k) {
					amax = i;
				}
			}

			int[] b = new int[m];
			long[] bsum = new long[m];
			int bmax = -1;
			for (int i = 0; i < m; i++) {
				b[i] = sc.nextInt();
				if (i == 0) {
					bsum[i] = b[i];
				} else {
					bsum[i] = b[i] + bsum[i - 1];
				}
				if (bsum[i] <= k) {
					bmax = i;
				}
			}

			if (amax + 1 == n && bmax + 1 == m) {
				System.out.println(n + m);
				return;
			} else if (amax == -1 && bmax == -1) {
				System.out.println(0);
				return;
			} else if (amax == -1) {
				System.out.println(bmax + 1);
				return;
			} else if (bmax == -1) {
				System.out.println(amax + 1);
				return;
			}

			int result = 0;
			for (int i = 0; i <= amax; i++) {
				for (int j = 0; j <= bmax; j++) {
					if (asum[i] + bsum[j] <= k && result < i + j + 2) {
						result = i + j + 2;
					}
					if (k < asum[i] + bsum[j]) {
						break;
					}
				}
				if (k < asum[i]) {
					break;
				}
			}
			System.out.println(result);
		}
	}
}
