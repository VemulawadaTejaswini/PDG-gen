import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int r = input();
		int c = input();

		int[][] table = new int[r + 1][c + 1];

		for (int i = 0; i < r; i++) {

			for (int j = 0; j < c; j++) {

				table[i][j] = input();
				table[i][c] += table[i][j];
				table[r][j] += table[i][j];
				table[r][c] += table[i][j];

			}
		}

		for (int i = 0; i < r + 1; i++) {

			for (int j = 0; j < c + 1; j++) {

				if (i < r && j < c) {

					System.out.print(table[i][j]);

				}else if (i == r && j == c) {

					System.out.print(table[r][c]);

				} else if (i == r) {

					System.out.print(table[r][j]);

				} else if (j == c) {

					System.out.print(table[i][c]);

				}

				if (j != c) {

					System.out.print(" ");

				}
			}

			System.out.println("");

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