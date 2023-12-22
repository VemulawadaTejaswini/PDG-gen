

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		long c = a - b;

		long[] h = new long[n];

		for (int i = 0; i < n; i++) {
			h[i] = Long.parseLong(sc.next());
		}

		long right = h[0] / b;
		long left = 0;

		while (left < right) {
			long sum = 0;

			for (int i = 0; i < n; i++) {
				if (h[i] - b * right <= 0)
					continue;

				long t = h[i] - b * right;

				if (t % c == 0)
					sum += t / c;
				else
					sum += t / c + 1;

			}

			if (sum <= right) {
				right = (right + left) / 2;
			} else {
				left = right;
				right = sum;
			}

		}

		if (left == right)
			right++;
		System.out.println(right);

	}

}
