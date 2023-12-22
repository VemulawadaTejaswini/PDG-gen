

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n + 2];
		a[0] = 0;
		a[n + 1] = 0;
		long sum = 0;
		int[] b = new int[n + 1];
		int[] c = new int[n];

		for (int i = 1; i <= n + 1; i++) {
			if (i != n + 1)
				a[i] = Integer.parseInt(sc.next());

			b[i - 1] = Math.abs(a[i] - a[i - 1]);
			sum += Math.abs(a[i] - a[i - 1]);

			if (i != 1)
				c[i - 2] = Math.abs(a[i] - a[i - 2]);

		}

		for (int i = 0; i < n; i++) {
			System.out.println(sum - b[i] - b[i + 1] + c[i] + " ");
		}
	}

}
