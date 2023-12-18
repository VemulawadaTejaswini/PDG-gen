import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		while (true) {
			int n = s.nextInt();
			if (n == 0)
				break;

			int ptr = 0; // 得られた素数の数
			int[] prime = new int[2 * n];

			prime[ptr++] = 2;
			prime[ptr++] = 3;

			for (int t = 5; t <= 2 * n; t += 2) {
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

			int count = 0;

			for (int i = 0; i < ptr; i++)
				if (prime[i] > n) {
					count++;
				}

			if (n == 1)
				count = 1;

			System.out.println(count);
		}
		s.close();
	}
}