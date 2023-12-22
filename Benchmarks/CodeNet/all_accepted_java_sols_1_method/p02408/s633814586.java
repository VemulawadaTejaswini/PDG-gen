import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		boolean[][] card_52;
		card_52 = new boolean[4][13];

		for (int i = 0; i < n; i++) {
			String SHCD = scan.next();
			int num1_13 = scan.nextInt();

			if (SHCD.equals("S")) {
				card_52[0][num1_13 - 1] = true;

			} else if (SHCD.equals("H")) {
				card_52[1][num1_13 - 1] = true;

			} else if (SHCD.equals("C")) {
				card_52[2][num1_13 - 1] = true;

			} else if (SHCD.equals("D")) {
				card_52[3][num1_13 - 1] = true;

			}

		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				if (i == 0) {
					if (card_52[0][j] == false) {
						System.out.println("S" + " " + (j + 1));
					}

				}
				if (i == 1) {
					if (card_52[1][j] == false) {
						System.out.println("H" + " " + (j + 1));
					}

				}
				if (i == 2) {
					if (card_52[2][j] == false) {
						System.out.println("C" + " " + (j + 1));
					}

				}
				if (i == 3) {
					if (card_52[3][j] == false) {
						System.out.println("D" + " " + (j + 1));
					}

				}

			}

		}

	}

}