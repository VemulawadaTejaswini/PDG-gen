import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line1 = sc.nextLine();
		String[] array1 = line1.split(" ");
		int r = Integer.parseInt(array1[0]);
		int c = Integer.parseInt(array1[1]);

		String[][] h = new String[r][c];
		int[][] hyou = new int[r + 1][c + 1];
		for (int i = 0; i < r; i++) {
			String line2 = sc.nextLine();
			for (int j = 0; j < c; j++) {
				String[] string = line2.split(" ");
				h[i][j] = string[j];
				hyou[i][j] = Integer.parseInt(h[i][j]);
			}

		}

		for (int i = 0; i <= r; i++) {
			if (i == r) {
				for (int k = 0; k <= c; k++) {
					for (int p = 0; p <= r; p++) {
						if (p < r) {
							hyou[r][k] += hyou[p][k];
						}

					}
					if (k == c) {
						System.out.print(hyou[r][k]);

					} else {
						System.out.print(hyou[r][k] + " ");

					}

				}
				System.out.println();

			} else {
				for (int j = 0; j <= c; j++) {
					if (j < c) {
						hyou[i][c] += hyou[i][j];
					}
					if (j == c) {
						System.out.print(hyou[i][j]);

					} else {
						System.out.print(hyou[i][j] + " ");

					}

				}
				System.out.println();
			}
		}

	}

}