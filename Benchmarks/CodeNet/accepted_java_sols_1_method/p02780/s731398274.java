import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		double[] P = new double[N];

		for (int i = 0; i < N; i++) {
			P[i] = (0.5 * sc.nextDouble()) + 0.5;
		}

		double FIRST = 0;
		for (int i = 0; i < K; i++) {
			FIRST += P[i];
		}
		double BEFORE = FIRST;
		double MAX = FIRST;

		for (int i = 1; i < N - K + 1; i++) {
			double EXP = BEFORE - P[i - 1] + P[i + K - 1];

			BEFORE = EXP;
			if (EXP > MAX) {
				MAX = EXP;
			}
		}

		System.out.println(String.format("%.10f", MAX));
		sc.close();
	}

}
