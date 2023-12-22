import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a;
		int sum = 0, square = 0;
		for (int i = 0; i < N; i++) {
			a = sc.nextInt();
			sum += a;
			square += a * a;
		}

		int min = Integer.MAX_VALUE;
		for (int i = -100; i <= 100; i++) {
			if (min > square + N * i * i - 2 * sum * i) {
				min = square + N * i * i - 2 * sum * i;
			}
		}

		System.out.println(min);

		sc.close();

	}
}
