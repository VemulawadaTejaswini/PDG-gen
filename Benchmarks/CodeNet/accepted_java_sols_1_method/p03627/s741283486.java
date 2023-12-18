

import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sc.next());
		}

		long l = 0;
		long r = 0;

		Arrays.sort(a);

		for (int i = n - 1; i >= 1; i--) {
			if (l == 0) {
				if (a[i] == a[i - 1]) {
					l = a[i];
					i--;
				}
			} else {
				if (a[i] == a[i - 1]) {
					r = a[i];
					break;
				}
			}
		}

		System.out.println(l * r);

	}

}
