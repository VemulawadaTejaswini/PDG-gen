
import java.util.Scanner;

public class Main extends DiceDesign {
	/*
	 * Constraints 0???0??? ??\?????????????????????????????¢?????°??? ???100???100 ??\?????????????????????????????¢?????°?????????????????°??????
	 * 1???q???241???q???24
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// declear
		String[] tmpNum = sc.nextLine().split(" "); // 1 2 3 4 5 6
		int[] castNum = new int[tmpNum.length]; // [6]
		int[][] diceNum = new int[tmpNum.length][2];// [6][2]
		int tmptop = 0, tmpfront = 0;

		// input dice space
		for (int i = 0; i < castNum.length; i++) {
			castNum[i] = Integer.parseInt(tmpNum[i]);
		}

		DiceDesign DD = new DiceDesign();

		DD.CreateDice(castNum, diceNum);

		// Question num input
		int questionNum = sc.nextInt();
		
		while (questionNum-- < 0) {// chk point
			tmptop = Integer.parseInt(sc.next());
			tmpfront = Integer.parseInt(sc.next());

			// [[1, 1], [2, 2], [3, 3], [4, 4], [5, 5], [6, 6]]
			// Dice1??¨??????????????????????????¶??????????????????????????¨
			// logic TOP && FRONT -> RIGHT?
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < castNum.length; j++) {

					// 6
					if (diceNum[j][i] == tmptop) {

						int[] temp = diceNum[TOP];
						diceNum[TOP] = diceNum[FRONT];
						diceNum[FRONT] = diceNum[BOTTOM];
						diceNum[BOTTOM] = diceNum[BACK];
						diceNum[BACK] = temp;
					}
				}
			}
			System.out.println(diceNum[RIGHT]);
		}
	}
}

class DiceDesign {

	// declear
	static int DICEDESIGN = 6;
	static final int TOP = 0;
	static final int FRONT = 1;
	static final int RIGHT = 2;
	static final int LEFT = 3;
	static final int BACK = 4;
	static final int BOTTOM = 5;

	public int[][] CreateDice(int[] castNum, int[][] diceNum) { // clear
		// int[][] tmpDice = new int[castNum.length][2];
		for (int i = 0; i < diceNum.length; i++) {
			// [[1, 1], [2, 2], [3, 3], [4, 4], [5, 5], [6, 6]]
			diceNum[i][0] = i + 1;
			diceNum[i][1] = castNum[i];
		}
		return diceNum;
	}
}