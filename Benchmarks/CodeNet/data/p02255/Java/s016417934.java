import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Num = scan.nextInt();
		int[] temoti = new int[Num]; // 手持ちのトランプ
		for (int i = 0; i < Num; i++) {
			temoti[i] = scan.nextInt();
		}
		insertionSort(temoti, Num);
	}

	/**
	 * 挿入ソート
	 * 
	 * @param cardArray
	 *            ソート対象のカードリスト
	 * @param Num
	 *            ソート対象のカードの枚数
	 */
	public static void insertionSort(int[] cardArray, int Num) {
		for (int i = 0; i < Num; i++) {
			int selectedCard = cardArray[i]; // 1枚トランプを取り出す
			int j = i - 1;
			// 取り出した一枚より前の方に持っていたトランプと比較
			while (j >= 0 && cardArray[j] > selectedCard) {
				cardArray[j + 1] = cardArray[j];
				j--;
			}
			// 取り出した一枚が比較しているトランプより大きければ、取り出した一枚のj+1番目に挿入する。
			cardArray[j + 1] = selectedCard;
			for (int k = 0; k < Num; k++) {
				if (k == Num - 1) {
					System.out.print(cardArray[k]);// 最後の一枚の場合には空白をつけない
				} else {
					System.out.print(cardArray[k] + " ");
				}
			}
			System.out.println("");
		}

	}
}

