import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		// ダイスの目を格納する配列arrayの宣言
		int array[] = new int [6];

		// ダイスの目の要素を読み取りして格納
		for (int i = 0; i < 6; i++) {

			array[i] = sc.nextInt();

		}

		// 質問の数count
		int count = sc.nextInt();

		for (int i = 0; i < count; i++) {

			// 配列arrayをコンストラクタに引き渡す
			Dice dice = new Dice(array);

			int topnum = sc.nextInt();
			int frontnum = sc.nextInt();

			System.out.println(dice.rightnum(topnum, frontnum));

		}
	}
}

class Dice {

	private int num[];
	String diceroll = "NNNNWNNNWNNNENNNENNNWNNN";

	Dice (int arraynum[]) {

		int index = arraynum.length;

		// 配列numの要素数を取得
		num = new int [index];

		// 配列numに配列arrayの要素を格納
		for (int i = 0; i < index; i++) {

			num[i] = arraynum[i];
		}

	}

	public void roll(char order) {

				int copy;

				// Mainメソッドからの引数から分岐して、入れ替わった要素をsetNumメソッドに引き渡し
				switch (order) {

				case 'N' :
					copy = num[0];
					num[0] = num[1];
					num[1] = num[5];
					num[5] = num[4];
					num[4] = copy;

					setNum(num);
					break;

				case 'S' :
					copy = num[0];
					num[0] = num[4];
					num[4] = num[5];
					num[5] = num[1];
					num[1] = copy;

					setNum(num);
					break;

				case 'W' :
					copy = num[0];
					num[0] = num[2];
					num[2] = num[5];
					num[5] = num[3];
					num[3] = copy;

					setNum(num);
					break;

				case 'E' :
					copy = num[0];
					num[0] = num[3];
					num[3] = num[5];
					num[5] = num[2];
					num[2] = copy;

					setNum(num);
					break;
				}
	}

	// rollメソッドで入れ替わった要素をここで上書き
	public void setNum(int arraynum[]) {

		int indexnum = arraynum.length;

		for (int i = 0; i < indexnum; i++ ) {
			num[i] = arraynum[i];
		}

	}

	public int rightnum(int top, int front) {

		// 全ての面の組み合わせを出すdicerollでダイスを回転させる
		for (int i = 0; i < diceroll.length(); i++) {

			roll(diceroll.charAt(i));

			// 入力値の上面と前面とnumの数値が一致したらbreak
			if (top == num[0] && front == num[1]) {
				break;
			}
		}

		// 右面の数値を返す
		return num[2];

	}
}

