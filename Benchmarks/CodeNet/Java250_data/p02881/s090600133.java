import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long answer = 0;

		for (int i = 1; i <= Math.sqrt(N) + 1; i++) {
			if (N % i == 0) answer = N / i + i - 2;
		}

		System.out.println(answer);
	}
}
