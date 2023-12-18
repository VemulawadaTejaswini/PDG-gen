import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int ptr = 0;
		int[] prime = new int[1000000];

		prime[ptr++] = 2;
		prime[ptr++] = 3;

		for (int t = 5; t <= 1000000; t += 2) {
			boolean wflag = false;
			for (int i = 1; prime[i] * prime[i] <= t; i++) {
				if (0 == t % prime[i]) {
					wflag = true;
					break;
				}
			}
			if (!wflag) {
				prime[ptr++] = t;
			}
		}

		// for (int i = 0; i < 1000; i++) {
		// System.out.println(prime[i]);
		// }

		while (true) {
			int a = s.nextInt();
			int d = s.nextInt();
			int n = s.nextInt();

			if (a == 0 && d == 0 && n == 0)
				break;

			int index = 0;
			int[] ans = new int[1000000];
			// int[] seq = new int[1000000];
			//
			// for (int i = 0; i < 1000000; i++) {
			// seq[i] = a + d * i;
			// }

			for (int i = 0; i < 1000000; i++) {
				if (prime[i] >= a && (prime[i] - a) % d == 0)
					ans[index++] = prime[i];
			}

			System.out.println(ans[n - 1]);

		}
		s.close();
	}
}