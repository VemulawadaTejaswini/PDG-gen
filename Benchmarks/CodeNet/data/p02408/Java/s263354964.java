import java.util.Scanner;

class Main {
	static class Card {
		// 絵柄
		enum MARK {
			S, H, C, D;
		}

		MARK mark;	//絵柄
		int num;	//数字

		//絵柄と数字から生成
		Card(String mark, int num) {
			this.mark = MARK.valueOf(mark);
			this.num = num;
		}

		//配列の番号から生成
		Card(int arrayNum) {
			for (MARK m : MARK.values()) {
				if (m.ordinal() == arrayNum / 13) {
					this.mark = m;
					this.num = arrayNum % 13 + 1;
				}
			}
		}

		//配列番号を返す
		public int getArrayNum() {
			for (MARK m : MARK.values()) {

				if (m == mark) {

					return num + (m.ordinal() * 13) - 1;
				}
			}
			return 0;
		}

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// カード総数
		final int TOTAL_CARDS = 52;

		// どのカードを所持しているかのフラグ
		boolean[] flagArray = new boolean[TOTAL_CARDS];

		// 所持カード枚数(入力レコード数)を記録
		int cardCount = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < cardCount; i++) {
			// 所持カード(絵柄 + " " + 数字)の入力
			Card card = new Card(sc.next(), sc.nextInt());
			// 所持フラグの変更
			flagArray[card.getArrayNum()] = true;

		}

		print(flagArray);

	}

	// 表示処理
	static void print(boolean[] flagArray) {
		// 所持していなかったカードを表示させる
		for (int i = 0; i < flagArray.length; i++) {

			if (flagArray[i] == false) {
				Card card = new Card(i);
				// 出力
				System.out.println(card.mark + " " + card.num);
			}
		}
	}
}

