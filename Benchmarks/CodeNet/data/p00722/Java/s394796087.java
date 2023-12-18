import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int N = 100000;

		int ptr = 0;
		int[] prime = new int[N];

		prime[ptr++] = 2;
		prime[ptr++] = 3;

		for (int t = 5; t <= N; t += 2) {
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

		while (true) {
			int a = s.nextInt();
			int d = s.nextInt();
			int n = s.nextInt();

			if (a == 0 && d == 0 && n == 0)
				break;

			int index = 0;
			int[] ans = new int[N];

			for (int i = 0; i < N; i++) {
				if (prime[i] >= a && (prime[i] - a) % d == 0)
					ans[index++] = prime[i];
			}

			System.out.println(ans[n - 1]);

		}
		s.close();
	}
}