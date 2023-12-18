

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[] a = new long[n];
		boolean flg = false;
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sc.next());
			if (a[i] == 0)
				flg = true;
		}
		if (flg) {
			System.out.println(0);
			return;
		}

		long b = a[0];
		for (int i = 1; i < n; i++) {
			if (a[i] > Long.MAX_VALUE / b) {
				System.out.println(-1);
				return;
			}
			b = b * a[i];
			if (b > 1000000000000000000l) {
				System.out.println(-1);
				return;
			}

		}

		System.out.println(b);

	}

}
