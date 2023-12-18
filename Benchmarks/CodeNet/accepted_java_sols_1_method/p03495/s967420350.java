import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] balls = new int[N + 1];

		for (int i = 0; i < N; i++) {
			balls[sc.nextInt()]++;
		}

		int rewrite = balls.length - K;
		if (rewrite <= 0) {
			System.out.println(0);
			return;
		}
		Arrays.parallelSort(balls);
		int sum = 0;
		for (int i = 0; i < rewrite; i++) {
			sum += balls[i];
		}

		System.out.println(sum);

	}
}
