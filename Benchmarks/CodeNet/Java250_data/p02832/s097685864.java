
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int N = sc.nextInt();

			int check = 1;
			for (int i = 0; i < N; i++) {
				int next = sc.nextInt();
				if (next == check) {
					check++;
				}
			}

			if (check == 1) {
				System.out.println(-1);
			} else {
				System.out.println(N - check + 1);
			}

		}
	}

	static long lcm(long a, long b) {

		long gcd = gcd(a, b);
		return gcd * (a / gcd) * (b / gcd);
	}

	static long gcd(long a, long b) {

		long max = Math.max(a, b);
		long min = Math.min(a, b);

		if (max - min == 1) {
			return 1;
		}

		if (max % min == 0) {
			return min;
		} else {
			return gcd(min, max % min);
		}
	}

}
