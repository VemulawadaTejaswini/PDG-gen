import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int M = 2019;
		long l = sc.nextLong();
		long r = sc.nextLong();
		long lm = l % M;
		long rm = r % M;

		if (lm >= rm || r - l >= M - 1) {
			System.out.println(0);
			return;
		}

		long answer = 2018;
		for (long i = lm; i < rm; i++) {
			for (long j = i + 1; j <= rm; j++) {
				answer = Math.min(answer, (i * j) % M);
			}
		}
		System.out.println(answer);
	}
}
