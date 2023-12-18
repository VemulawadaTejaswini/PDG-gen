package problem_a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int counter = 0;
		while (scanner.hasNext()) {

			if (counter == 0) {
				counter = scanner.nextInt();
				if (counter == 0) {
					break;
				}
			}

			int sum = 0;
			int max = -1;
			int min = 1001;
			for (int i = 0; i < counter; i++) {

				int point = scanner.nextInt();

				sum = sum + point;

				if (max < point) {
					max = point;
				}
				if (min > point) {
					min = point;
				}
			}
			System.out.println((sum - max - min) / (counter - 2) );
		}
	}
}

