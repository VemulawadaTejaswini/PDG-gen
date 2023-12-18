import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		while (scanner.hasNext()) {

			int n = input();
			int count = 0;

			for (int i = 0; i <= 9; i++) {

				for (int j = 0; j <= 9; j++) {

					for (int k = 0; k <= 9; k++) {

						for (int l = 0; l <= 9; l++) {

							if (n == i + j + k + l) {

								count++;

							}
						}
					}
				}
			}

			System.out.println(count);

		}

		close();

	}

	public static int input() {

		return scanner.nextInt();

	}

	public static void close() {

		if (scanner != null) {

			scanner.close();

		}
	}
}