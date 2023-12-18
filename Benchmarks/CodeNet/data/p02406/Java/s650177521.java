import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int n = input();

		for (int i = 1 ; i <= n; i++) {

			if (i % 3 == 0) {

				System.out.print(" " + i);

			} else {

				int x = i;

				while (x != 0) {

					if (x % 10 == 3) {

						System.out.print(" " + x);
						break;

					} else {

						x = x / 10;

					}
				}
			}
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