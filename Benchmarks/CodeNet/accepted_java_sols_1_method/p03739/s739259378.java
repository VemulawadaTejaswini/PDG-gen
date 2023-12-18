import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[] a = new long[n];
		long[] ac = new long[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}

		long answer = Long.MAX_VALUE;
		for (int i = 0; i < 2; i++) {
			long t = 0;
			ac[0] = a[0];

			for (int j = 0; j < n; j++) {
				if ((i + j) % 2 == 0) {
					if (ac[j] >= 0) {
						t += ac[j] + 1;
						ac[j] = -1;
					}
				} else {
					if (ac[j] <= 0) {
						t += Math.abs(ac[j]) + 1;
						ac[j] = 1;
					}
				}
				if (j < n - 1) ac[j + 1] = ac[j] + a[j + 1];
			}

			answer = Math.min(answer, t);
		}

		System.out.println(answer);
	}
}
