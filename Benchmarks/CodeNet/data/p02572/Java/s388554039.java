import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] array = new double[N];
		int total = 0;
		int sum = 0;

		int MOD = 1000000007;

		for (int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {

				sum = (int) (array[i] * array[j] % MOD);

				total += sum;

				if (total > MOD) {
					total = total % MOD;
				}
			}
		}

		System.out.println(total);

	}

}