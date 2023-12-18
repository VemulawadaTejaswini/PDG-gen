import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		Integer[] a = new Integer[n];
		Integer[] f = new Integer[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			f[i] = sc.nextInt();
		}

		Arrays.sort(a);
		Arrays.sort(f, Comparator.reverseOrder());

		long l = -1;
		long r = Math.max(a[n - 1], f[0]);
		r *= r;
		while (r - l > 1) {
			long m = (l + r) / 2;
			long remain = k;

			for (int i = 0; i < n; i++) {
				remain -= Math.max(a[i] - m / f[i], 0);
				if (remain < 0) break;
			}

			if (remain >= 0) {
				r = m;
			} else {
				l = m;
			}
		}

		System.out.println(r);
	}

}
