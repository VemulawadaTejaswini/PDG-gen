import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			int n = sc.nextInt();

			if (n == 0) {
				break;
			}

			int[] scores = new int[n];
			for (int i = 0; i < scores.length; i++) {
				scores[i] = sc.nextInt();

			}

			int max = scores[0];
			int min = scores[0];

			for (int i = 1; i < scores.length; i++) {

				if (scores[i] > max) {

					max = scores[i];
				}

				if (scores[i] < min) {

					min = scores[i];
				}

			}

			int average = 0;
			int sum = 0;

			for (int i = 0; i < scores.length; i++) {

				sum += scores[i];

			}

			sum -= max;
			sum -= min;

			average = sum / (n - 2);

			System.out.println(average);

		}

	}

}