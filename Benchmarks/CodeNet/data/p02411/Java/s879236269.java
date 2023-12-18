import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {

			int m = input();
			int f = input();
			int r = input();

			if (m == -1 && f == -1 && r == -1) {

				break;

			}

			if (m == -1 || f == -1) {

				System.out.println("F");

			} else if (80 <= m + f) {

				System.out.println("A");

			} else if (65 <= m + f && m + f < 80) {

				System.out.println("B");

			} else if (50 <= m + f && m + f < 65) {

				System.out.println("C");

			} else if (30 <= m + f && m + f < 50) {

				if (50 <= r ) {

					System.out.println("C");

				} else {

					System.out.println("D");

				}
			} else if (m + f < 30) {

				System.out.println("F");

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