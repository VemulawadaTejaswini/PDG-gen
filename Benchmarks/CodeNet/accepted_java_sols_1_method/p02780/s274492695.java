import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		double[] E = new double[N];
		double sum = 0;

		for (int i = 0; i < N; i++) {
			double dice = sc.nextDouble();
			E[i] = (1 + dice) / 2;
			if (i < K) {
				sum += E[i];
			}
		}

		double max = sum;

		for (int i = K; i < N; i++) {
			sum = sum - E[i - K] + E[i];
			if (sum > max) {
				max =sum;
			}
		}

		System.out.println(max);
	}
}