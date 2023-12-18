

import java.util.Scanner;

class Diceclass {

	// declear
	static final int DICEDESIGN = 6;
    static final int TOP = 0; //?????¢ ex:1
    static final int FRONT = 1;//??£??¢ ex:2
    static final int RIGHT = 2;// ex:3 order:East
    static final int LEFT = 3;// ex:4???order:West
    static final int BACK = 4;//?£???¢ ex:5 order:North
    static final int BOTTOM = 5;// ex:6 order:South

    int[][] dice = new int[DICEDESIGN][2];

    public Diceclass(){
    	for (int i = 0; i < DICEDESIGN; i++) {
    		// [[1, 1], [2, 2], [3, 3], [4, 4], [5, 5], [6, 6]]
    		/*for (int j = 0; j < 3; j++) {
    			dice[i][j] = dice[i+1][j+1]; // error
			}*/
			 dice [i][0] = i+1;
			 dice[i][1] = dice [i][0];
		}
    }

	/*
	 * Sample Input
	 * 1 1 2 4 8 16 32
	 * SE
	 * Sample Output
	 * 1 8
	 */

	public Diceclass(int[] diceNum) {
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

}
class main{
	public static void main(String[] args) {

		// Operation Dice1 simulation
		Scanner sc = new Scanner(System.in);

		// dice space save
		String[] tmp = sc.nextLine().split(" ");
		int[] diceNum = new int[Diceclass.DICEDESIGN];
		for (int i = 0; i < Diceclass.DICEDESIGN; i++) {
			diceNum[i] = Integer.parseInt(tmp[i]);
		}
		Diceclass diceSpace = new Diceclass(diceNum);

		// order save
		String[] order = sc.nextLine().split("");

		// order run
		for (int i = 0; i < order.length; i++) {
			switch (order[i]) {
			case "N":
				diceSpace.orderN();
				break;
			case "S":
				diceSpace.orderS();
				break;
			case "E":
				diceSpace.orderE();
				break;
			case "W":
				diceSpace.orderW();
				break;
			}
		}
		System.out.println(diceSpace.outputTOP(diceSpace.TOP));
	}
}