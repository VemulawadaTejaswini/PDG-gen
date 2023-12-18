import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();

			if (n == 0) {
				break;
			}

			int[] score = new int[n];
			double sum = 0.0;

			for (int i = 0; i < score.length; i++) {
				score[i] = sc.nextInt();
				sum = sum + score[i];
			}

			double average = sum / n;
			double a = 0;

			for (int i = 0; i < score.length; i++) {
				a = (score[i] - average) * (score[i] - average) + a;
			}

			double variance = a / n;
			double deviation = Math.sqrt(variance);

			System.out.printf("%.8f\n",deviation);
		}
		sc.close();
	}
}