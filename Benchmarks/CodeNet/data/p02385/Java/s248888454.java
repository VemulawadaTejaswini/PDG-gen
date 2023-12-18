import java.util.Scanner;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//提示されるダイス目の入力 その１
		String dice1 = sc.nextLine();

		//入力されたダイス目の配列
		String[] dicenum1 = dice1.split(" ");
		int[] dicenumber1 = new int[6];

		for (int i = 0; i < dicenum1.length; i++) {
			dicenumber1[i] = Integer.parseInt(dicenum1[i]);
		}

		//提示されるダイス目の入力 その２
		String dice2 = sc.nextLine();

		//入力されたダイス目の配列
		String[] dicenum2 = dice2.split(" ");
		int[] dicenumber2 = new int[6];

		for (int i = 0; i < dicenum2.length; i++) {
			dicenumber2[i] = Integer.parseInt(dicenum2[i]);
		}

		//Diceクラスの呼び出し
		Dice diceClass1 = new Dice(dicenumber1);
		Dice diceClass2 = new Dice(dicenumber2);

		//Rollクラスの呼び出し
		Roll diceRoll = new Roll();

		//Diceクラスの受け渡し
		diceRoll.setDice(diceClass2);

		//Rollクラスに上面と前面を渡して結果を受け取り型に格納
				Object diceAnswer =diceRoll.roll(dicenumber1,dicenumber2);

				System.out.println(diceAnswer);

		sc.close();

	}

}


class Roll {

	Dice dice;

	public void setDice(Dice getDice) {
		this.dice = getDice;
	}

	//呼び出し元からint型のdicetopとdicefrontを受け取る
	public Object roll(int[] d1, int[] d2) {

		//1-6を配列番号0-5に割り当てて並べ替えをする
		//縦に4回、水平に4回回して一致する配列があるかどうかを判定する

		int empty = 0;
		Object YorN = "";

		//方向ごとに場合分け

		if (d1 != d2) {

			for (int i = 0; i < 4; i++) {

				// if文で面の番地に指定の数字が入るまで繰り返し

				//縦回転(前後)
				if (Arrays.equals(d1,d2)) {
					break;
				}

				empty = d2[0];
				d2[0] = d2[1];
				d2[1] = d2[5];
				d2[5] = d2[4];
				d2[4] = empty;

				for (int k = 0; k < 4; k++) {
					if (Arrays.equals(d1,d2)) {
						break;
					}

					//水平回転
					empty = d2[1];
					d2[1] = d2[2];
					d2[2] = d2[4];
					d2[4] = d2[3];
					d2[3] = empty;

				}

			}
			for (int j = 0; j < 4; j++) {
				if (Arrays.equals(d1,d2)) {
					break;
				}

				//縦回転(左右)
				empty = d2[0];
				d2[0] = d2[2];
				d2[2] = d2[5];
				d2[5] = d2[3];
				d2[3] = empty;

				for (int k = 0; k < 4; k++) {
					if (Arrays.equals(d1,d2)) {
						break;
					}
					//水平回転
					empty = d2[1];
					d2[1] = d2[2];
					d2[2] = d2[4];
					d2[4] = d2[3];
					d2[3] = empty;

				}
			}
			if (Arrays.equals(d1,d2)) {
				YorN = "Yes";
			} else {
				YorN = "No";
			}

		}

		return YorN;
	}
}


class Dice {

	int[] d = new int[6];

	public Dice(int[] setd) {

		this.d[0] = setd[0];
		this.d[1] = setd[1];
		this.d[2] = setd[2];
		this.d[3] = setd[3];
		this.d[4] = setd[4];
		this.d[5] = setd[5];

	}

}

