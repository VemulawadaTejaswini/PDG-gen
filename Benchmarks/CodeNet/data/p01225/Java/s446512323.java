

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// ?????????????????°?????\???
		int gameCount = in.nextInt();
		// ??????????????????????????°????????\???
		int[] cardNum = new int[9];
		// ????????????????????????????????\???
		String[] cardColor = new String[9];
		// ??????????????????????´????????????????
		ArrayList<Integer> resultList = new ArrayList<>();

		for(int setCount = 0; setCount < gameCount; setCount++) {

			for(int cardCount = 0; cardCount < 9; cardCount++) {

				cardNum[cardCount] = in.nextInt();

			}

			for(int cardCount = 0; cardCount < 9; cardCount++) {

				cardColor[cardCount] = in.next();

			}


			Rummy rummy = new Rummy(cardNum, cardColor);

			int[][] hadCard = rummy.hasCardSet(cardNum, cardColor);

			int point = 0;

			point += rummy.sameNumberCheck(hadCard);

			point += rummy.continuousNumberCheck(hadCard);

			if(point == 3) {

				resultList.add(1);

			} else {

				resultList.add(0);

			}
		}

		for(int result: resultList) {

			System.out.println(result);

		}

	}
}

class Rummy{

	// ?????£?????????
	int[] cardNum;
	String[] cardColor;

	// ?????????????????????
	Rummy(int[] cardNum, String[] cardColor){

		this.cardNum = cardNum;
		this.cardColor = cardColor;

	}

	// ???????????????????????????????????£??????????????´?????????????????????
	int[][] hasCardSet(int[] cardNum, String[] cardColor) {

		int[][] hasCard = new int[3][9];

		for(int i = 0; i < 9; i++) {

			for(int j = 1; j <= 9; j++) {

				if(cardNum[i] == j) {

					switch(cardColor[i]) {

					case "R":

						hasCard[0][j-1] += 1;

						break;

					case "G":

						hasCard[1][j-1] += 1;

						break;

					case "B":

						hasCard[2][j-1] += 1;

						break;

					}
				}
			}
		}

		return hasCard;

	}

	int sameNumberCheck(int[][] hasCard) {

		int point = 0;

		hasCardSet(cardNum, cardColor);

		for(int i = 0; i < 3; i++) {

			for(int j = 0; j < 9; j++) {

				if(hasCard[i][j] >= 3) {

					point++;
					hasCard[i][j] -= 3;

				}
			}
		}

		return point;

	}

	int continuousNumberCheck(int[][] hasCard) {

		int point = 0;
		int continuousCount = 0;

		hasCardSet(cardNum, cardColor);

		for(int i = 0; i < 3; i++) {

			for(int j = 0; j < 9; j++) {

				if(hasCard[i][j] != 0) {

					continuousCount++;

					if(continuousCount == 3) {

						point++;
						hasCard[i][j] -= 1;
						hasCard[i][j-1] -= 1;
						hasCard[i][j-2] -= 1;
						j = 0;
						continuousCount = 0;

					}

				} else {

					continuousCount = 0;

				}
			}
		}

		return point;

	}
}