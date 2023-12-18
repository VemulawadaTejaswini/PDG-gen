package atCorder;

import java.util.Scanner;

public class Tsundoku {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		long max = scan.nextInt();
		long a[] = new long[n + 1];
		long b[] = new long[m + 1];
		a[0] = 0;
		b[0] = 0;
		for (int i = 1; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		for (int i = 1; i < b.length; i++) {
			b[i] = scan.nextInt();
		}
		long ans = 0;
		long time = 0;
		for (int i = 0; (i < a.length) && (a[i] < max); i++) {
			long count = 0;
			time = time + a[i];

			long time2 = time;
			for (int j = 0; (i < a.length) && (b[j] < max - time2); j++) {
				time2 = time2 + b[j];
				count = i + j;
			}
			if (ans < count) {
				ans = count;
			}

		}

		System.out.println(ans);

	}

}
