

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// game set
		int gameset = sc.nextInt();

		int[][] cardset = new int[UTRummy.CARDPAGE][UTRummy.ONECARDSET];

		// input info
		for (int i = 0; i < gameset; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 9; k++) {

					if (j == 0) {
						// number info input
						cardset[j][k] = sc.nextInt();
					} else {
						// color info
						String tmpcolor = sc.next();
						int intColor = 0;
						if (tmpcolor.equals("R")) {
							intColor = UTRummy.RED;
						} else if (tmpcolor.equals("G")) {
							intColor = UTRummy.GREEN;
						} else {
							intColor = UTRummy.BLUE;
						}
						// color info input
						cardset[j][k] = intColor;
					}
				}
			}

			UTRummy utr = new UTRummy();
			// getter-setter call
			utr.setCardset(cardset);
			cardset = utr.getCardset();

			//game start
			int intCount = 0;
			intCount = utr.playtheGame(cardset); // ?????????
			//game result
			if (3 <= intCount) {
				System.out.println(1);

			} else {
				System.out.println(0);
			}
		}
	}
}

class UTRummy {

	// declear
	static final int ONECARDSET = 9;
	static final int CARDPAGE = 2;

	// color
	static final int RED = 0;
	static final int GREEN = 1;
	static final int BLUE = 2;

	int[][] Cardset = new int[CARDPAGE][ONECARDSET];

	public UTRummy() {

	}

	public int[][] getCardset() {
		return Cardset;
	}

	public void setCardset(int[][] cardset) {
		this.Cardset = settingcardplay(cardset);
	}

	public int[][] settingcardplay(int[][] card) {

		for (int i = 0; i < 8; i++) {

			for (int j = 0; j < 8 - i; j++) {

				if (card[1][j] > card[1][j + 1]) {
					int temp = card[1][j];
					card[1][j] = card[1][j + 1];
					card[1][j + 1] = temp;

					int temp2 = card[0][j];
					card[0][j] = card[0][j + 1];
					card[0][j + 1] = temp2;
				}
			}
		}

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8 - i; j++) {
				if (card[1][j] == card[1][j + 1] && card[0][j] > card[0][j + 1]) {

					int temp = card[0][j];
					card[0][j] = card[0][j + 1];
					card[0][j + 1] = temp;

				}

			}
		}
		return card;
	}

	public int playtheGame(int[][] cardset) { // ?????????

		int intCount = 0;

		for (int i = 0; i < 7; i++) {

			for (int j = i + 1; j < 8; j++) {

				for (int k = j + 1; k < 9; k++) {
					if (cardset[1][i] == cardset[1][j] && cardset[1][j] == cardset[1][k]) {

						if (cardset[0][i] != 0 && cardset[0][i] == cardset[0][j] - 1
								&& cardset[0][i] == cardset[0][k] - 2) {

							intCount++;
							cardset[0][i] = 0;
							cardset[0][j] = 0;
							cardset[0][k] = 0;
						}
					}
				}
			}
		}

		for (int i = 0; i < 7; i++) {

			for (int j = i + 1; j < 8; j++) {

				for (int k = j + 1; k < 9; k++) {

					if (cardset[1][i] == cardset[1][j] && cardset[1][j] == cardset[1][k]) {
						if (cardset[0][i] != 0 && cardset[0][i] == cardset[0][j] && cardset[0][i] == cardset[0][k]) {

							intCount++;
							cardset[0][i] = 0;
							cardset[0][j] = 0;
							cardset[0][k] = 0;
						}
					}
				}
			}
		}
		return intCount;
	}

}