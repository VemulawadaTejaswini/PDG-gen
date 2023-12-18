import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = sc.nextLong();

		long answer = 1;
		for (long i = 1; i * i <= m && i <= m / n; i++) {
			if (m % i == 0) {
				answer = Math.max(answer, i);
				if (m / i <= m / n) answer = Math.max(answer, m / i);
			}
		}

		System.out.println(answer);
	}
}
