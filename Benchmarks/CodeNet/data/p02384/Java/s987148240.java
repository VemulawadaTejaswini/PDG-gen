

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// declear
		String[] tmpNum = sc.nextLine().split(" "); // 1 2 3 4 5 6
		int[] castNum = new int[tmpNum.length]; // [6]
		int[][] diceNum = new int[tmpNum.length][2];// [6][2]
		int tmptop = 0, tmpfront = 0;
		// input dice
		for (int i = 0; i < castNum.length; i++) {
			castNum[i] = Integer.parseInt(tmpNum[i]);
		}

		CreateDice(castNum, diceNum);
		Diceclass2 DC = new Diceclass2();

		int orderNum = sc.nextInt();
		// order num input
		while(true){
			if(orderNum < 0)break;
			tmptop = Integer.parseInt(sc.next());
			tmpfront = Integer.parseInt(sc.next());
			System.out.println(DC.CheckRight(tmptop, tmpfront, diceNum));
			orderNum--;
		} // chk point

	}

	public static int[][] CreateDice(int[] castNum, int[][] diceNum) {
		for (int i = 0; i < diceNum.length; i++) {
			// [[1, 1], [2, 2], [3, 3], [4, 4], [5, 5], [6, 6]]
			diceNum[i][0] = i + 1;
			diceNum[i][1] = castNum[i];
		}
		return diceNum;
	}
}

class Diceclass2 {

	// declear
	static final int DICEDESIGN = 6;
	static final int TOP = 0; // ?????¢ ex:1
	static final int FRONT = 1;// ??£??¢ ex:2
	static final int RIGHT = 2;// ex:3 order:East
	static final int LEFT = 3;// ex:4 order:West
	static final int BACK = 4;// ?£???¢ ex:5 order:North
	static final int BOTTOM = 5;// ex:6 order:South

	int[][] dice = new int[DICEDESIGN][2];

	public Diceclass2() {
		for (int i = 0; i < DICEDESIGN; i++) {
			// [[1, 1], [2, 2], [3, 3], [4, 4], [5, 5], [6, 6]]
			/*
			 * for (int j = 0; j < 3; j++) { dice[i][j] = dice[i+1][j+1]; //
			 * error }
			 */
			dice[i][0] = i + 1;
			dice[i][1] = dice[i][0];
		}
	}

	public Diceclass2(int[] diceNum) {
		this();

		for (int i = 0; i < DICEDESIGN; i++) {
			// [[1, 1], [2, 2], [3, 4], [4, 8], [5, 16], [6, 32]]
			dice[i][1] = diceNum[i];
		}
	}

	public void orderN() {// clear

		// logic T - T ->F, B ->F, BA ->BT, T ->BA
		int[] temp = dice[TOP];
		dice[TOP] = dice[FRONT];
		dice[FRONT] = dice[BOTTOM];
		dice[BOTTOM] = dice[BACK];
		dice[BACK] = temp;
	}

	public void orderS() {// clear

		// logic BT - F -> BT, T ->F, BA -> T, BT ->BA
		int[] temp = dice[BOTTOM];
		dice[BOTTOM] = dice[FRONT];
		dice[FRONT] = dice[TOP];
		dice[TOP] = dice[BACK];
		dice[BACK] = temp;
	}

	public void orderE() {
		// logic L - R->BT, T->R, L->T, B->L
		int[] temp = dice[BOTTOM];
		dice[BOTTOM] = dice[RIGHT];
		dice[RIGHT] = dice[TOP];
		dice[TOP] = dice[LEFT];
		dice[LEFT] = temp;

	}

	public void orderW() {
		// logic R - BT -> R, L -> BT, L -> T, T->R
		int[] temp = dice[RIGHT];
		dice[RIGHT] = dice[BOTTOM];
		dice[BOTTOM] = dice[LEFT];
		dice[LEFT] = dice[TOP];
		dice[TOP] = temp;

	}

	public int outputTOP(int top) {
		// TOP?
		return dice[top][1];
	}

	public int CheckRight(int tmptop, int tmpfront, int[][] diceNum) {
		//
		if (tmptop == diceNum[0][1]) {// TOP
			// FRONT
			if (tmpfront == diceNum[1][1])
				return diceNum[2][1];
			// RIGHT
			if (tmpfront == diceNum[2][1])
				return diceNum[4][1];
			// LEFT
			if (tmpfront == diceNum[3][1])
				return diceNum[1][1];
			// BACK
			if (tmpfront == diceNum[4][1])
				return diceNum[3][1];
		} else if (tmptop == diceNum[1][1]) {// FRONT
			// T
			if (tmpfront == diceNum[0][1])
				return diceNum[3][1];
			// R
			if (tmpfront == diceNum[2][1])
				return diceNum[0][1];
			// L
			if (tmpfront == diceNum[3][1])
				return diceNum[5][1];
			// BT
			if (tmpfront == diceNum[5][1])
				return diceNum[2][1];
		} else if (tmptop == diceNum[2][1]) {// RIGHT
			// T
			if (tmpfront == diceNum[0][1])
				return diceNum[1][1];
			// F
			if (tmpfront == diceNum[1][1])
				return diceNum[5][1];
			// R
			if (tmpfront == diceNum[4][1])
				return diceNum[0][1];
			// BT
			if (tmpfront == diceNum[5][1])
				return diceNum[4][1];
		} else if (tmptop == diceNum[3][1]) {// LEFT
			// T
			if (tmpfront == diceNum[0][1])
				return diceNum[4][1];
			// F
			if (tmpfront == diceNum[1][1])
				return diceNum[0][1];
			// R
			if (tmpfront == diceNum[4][1])
				return diceNum[5][1];
			// BT
			if (tmpfront == diceNum[5][1])
				return diceNum[1][1];
		} else if (tmptop == diceNum[4][1]) {// BACK
			// T
			if (tmpfront == diceNum[0][1])
				return diceNum[2][1];
			// R
			if (tmpfront == diceNum[2][1])
				return diceNum[5][1];
			// L
			if (tmpfront == diceNum[3][1])
				return diceNum[0][1];
			// BT
			if (tmpfront == diceNum[5][1])
				return diceNum[3][1];
		} else if (tmptop == diceNum[5][1]) {// BOTTOM
			// F
			if (tmpfront == diceNum[1][1])
				return diceNum[3][1];
			// R
			if (tmpfront == diceNum[2][1])
				return diceNum[1][1];
			// L
			if (tmpfront == diceNum[3][1])
				return diceNum[4][1];
			// BA
			if (tmpfront == diceNum[4][1])
				return diceNum[2][1];
		}
		return 0;
	}

}