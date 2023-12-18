import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long k = sc.nextLong();
		Integer a[] = new Integer[n];
		Integer f[] = new Integer[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			f[i] = sc.nextInt();
		}

		Arrays.sort(a);
		Arrays.sort(f, Collections.reverseOrder());

		long l = -1;
		long r = (long) Math.pow(10, 12);

		while (l + 1 < r) {
			long c = (l + r) / 2;

			Predicate<Long> checker = (x) -> {
				long s = 0;
				for (int i = 0; i < n; i++) {
					s += Math.max(0, a[i] - x / f[i]);
				}
				return s <= k;
			};

			if (checker.test(c)) {
				r = c;
			} else {
				l = c;
			}
		}
		System.out.println(r);

	}

}
