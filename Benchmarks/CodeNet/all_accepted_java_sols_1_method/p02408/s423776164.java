import java.io.IOException;
import java.util.Scanner;

//

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();

		boolean[] [] cards = new boolean[4] [13];

		for (int i = 0; i < num; i++) {
			String design = scan.next();
			int cardNumber = scan.nextInt();

			int designNumber = 0;

			if (design.equals("S")) {
				designNumber = 0;
			} else if (design.equals("H")) {
				designNumber = 1;
			} else if (design.equals("C")) {
				designNumber = 2;
			} else if (design.equals("D")) {
				designNumber = 3;
			}
			cards[designNumber][cardNumber - 1] = true;
		}
		for (int i = 0; i < 4; i++ ) {
			for (int j = 0; j < 13; j++) {
				if (cards[i][j] == false) {
					if (i == 0) {
						System.out.print("S");
					} else if (i == 1) {
						System.out.print("H");
					} else if (i == 2) {
						System.out.print("C");
					} else if (i == 3) {
						System.out.print("D");
					}
					System.out.println(" " + (j + 1));
				}
			}
		}
	}
}