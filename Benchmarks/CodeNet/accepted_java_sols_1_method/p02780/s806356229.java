import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int K = scanner.nextInt();

		int[] cumulant = new int[N+1];

		for (int i = 0; i < N; i++) {
			cumulant[i+1] = cumulant[i] + scanner.nextInt();
		}

		scanner.close();

		int max = 0;

		for (int i = 0; i + K <= N; i++) {
			if (cumulant[i + K] - cumulant[i] > max)
				max = cumulant[i + K] - cumulant[i];
		}

		System.out.println((double) (max + K) / 2);
	}

}
