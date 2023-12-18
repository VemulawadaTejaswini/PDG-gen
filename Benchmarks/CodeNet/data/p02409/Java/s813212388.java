import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int n = input();
		int[][][] arrays = new int[4][3][10];

		for (int i = 0; i < n; i++) {

			int b = input();
			int f = input();
			int r = input();
			int v = input();

			v =+ v;

			arrays[b - 1][f - 1][r - 1] += v;

		}

		for (int j = 0; j < 4; j++) {

			for (int k = 0; k < 3; k++) {

				for (int l = 0; l < 10; l++) {


					System.out.print(" ");
					System.out.print(arrays[j][k][l]);

				}

				System.out.println("");

			}

			if (j + 1 != 4) {

				for (int m = 0; m < 20; m++) {

					System.out.print("#");

				}

				System.out.println("");

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