

import java.util.Scanner;

public class Main {

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
		for (int i = 0; i < a.length; i++) {
			long count = 0;
			time = time + a[i];

			long time2 = time;
			for (int j = 0; j < b.length; j++) {

				if (max < time2 + b[j]) {
					break;
				} else {
					time2 = time2 + b[j];
					count = i + j;

				}
			}
			if (ans < count) {
				ans = count;
			}

		}

		System.out.println(ans);

	}

}
