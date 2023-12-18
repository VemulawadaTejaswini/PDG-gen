import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		int array[] = new int [6];

		for (int i = 0; i < 6; i++) {
			array[i] = scanner.nextInt();
		}

		Diceroll dice = new Diceroll();

		// Dicerollクラスに配列arrayの要素を引き渡し
		dice.setNum(array[0], array[1], array[2], array[3], array[4], array[5]);

		// 回転方向読み取り
		String commando = scanner.next();

		for (int i = 0; i < commando.length(); i++) {

			// commandoの文字をDicerollクラスのrollメソッドに引き渡し
			dice.roll(commando.charAt(i));
		}

		// DicerollクラスからgetTopメソッドを出力
		System.out.println(dice.getTop());

	}
}

class Diceroll {

	private int num[];
	private int work[];

	Diceroll() {

		num = new int [6];
		work = new int [6];

	}

	public void roll(char order) {

		for (int i = 0; i < 6; i++) {
			work[i] = num[i];
		}

		switch (order) {

		case 'N' :
			setNum(work[1], work[5], work[2], work[3], work[0], work[4]);
			break;

		case 'S' :
			setNum(work[4], work[0], work[2], work[3], work[5], work[1]);
			break;

		case 'W' :
			setNum(work[2], work[1], work[5], work[0], work[4], work[3]);
			break;

		case 'E' :
			setNum(work[3], work[1], work[0], work[5], work[4], work[2]);
			break;
		}
	}

	public int getTop() {
		return num[0];
	}

	public void setNum(int num0, int num1, int num2, int num3, int num4, int num5) {

		num[0] = num0;
		num[1] = num1;
		num[2] = num2;
		num[3] = num3;
		num[4] = num4;
		num[5] = num5;

	}

}



