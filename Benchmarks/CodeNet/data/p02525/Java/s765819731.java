

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			int sum;
			int i;
			int n = sc.nextInt();
			sum = 0;

			if (n == 0) {
				break;
			}

			int[] scores = new int[n];

			for (i = 0; i < scores.length; i++) {
				scores[i] = sc.nextInt();
				sum += scores[i];
			}

			double average = 0, variance = 0;
			average = sum / n;

			for (int j = 0; j < i; j++) {
				double V;

				V = ((scores[j] - average) * (scores[j] - average)) / n;
				variance += V;
			}
			System.out.println(Math.sqrt(variance));
		}
	}
}