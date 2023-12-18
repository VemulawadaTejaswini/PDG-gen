import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}

		long[] b = new long[n];
		Arrays.fill(b, Long.MAX_VALUE);
		b[0] = 0;

		for (int i = 0; i < k - 1; i++) {
			b[0] += Math.abs(a[i + 1] - a[i]);
		}
		for (int i = 1; i + k - 1 < a.length; i++) {
			b[i] = b[i - 1] + Math.abs(a[i + k - 1] - a[i + k - 2]) - Math.abs(a[i] - a[i - 1]);
		}

		long answer = Long.MAX_VALUE;
		for (int i = 0; i + k - 1 < a.length; i++) {
			if (a[i + k - 1] < 0) {
				// - -
				answer = Math.min(answer, b[i] + Math.abs(a[i + k - 1]));

			} else if (a[i] < 0) {
				// - +
				answer = Math.min(answer, b[i] + Math.min(Math.abs(a[i + k - 1]), Math.abs(a[i])));
			} else {
				// + +
				answer = Math.min(answer, b[i] + Math.abs(a[i]));
			}
		}

		System.out.println(answer);
	}
}
