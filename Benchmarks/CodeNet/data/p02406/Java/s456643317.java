import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int n = input();
		StringBuilder sb = new StringBuilder();

		for (int i = 1 ; i <= n; i++) {

			if (i % 3 == 0) {

				sb.append(" " + i);

			} else {

				int x = i;

				while (x != 0) {

					if (x % 10 == 3) {

						sb.append(" " + i);
						break;

					} else {

						x = x / 10;

					}
				}
			}
		}

		System.out.println(sb);

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