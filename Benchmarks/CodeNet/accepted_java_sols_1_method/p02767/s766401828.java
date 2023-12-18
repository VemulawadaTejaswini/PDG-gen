import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		final int N = scanner.nextInt();
		int sum = 0;
		int sum2 = 0;
		int x;
		for (int i = 0; i < N; i++) {

			x = scanner.nextInt();
			sum += x;
			sum2 += x * x;
		}

		int p = (int) Math.round((double) sum / N);

		System.out.println(sum2 + N * p * p - 2 * p * sum);

	}

}
