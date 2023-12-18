import java.util.Scanner;

/**
 * ZAKIREN第5章
 * @author K.Yamauchi
 *
 */
public class Main {

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // 入力
		int n = Integer.parseInt(scan.next()); // 要素数

		// ソート対象配列の読み込み
		String[] targetArrayStr = scan.nextLine().split(" ");
		int[] targetArray = {0};
		for (int i = 0; i < targetArrayStr.length; i++) {
			targetArray[i] = Integer.parseInt(targetArrayStr[i]);
		}

		// 読み込み終了
		scan.close();

		// ソート呼び出し
		int sortCount = insertionSort(targetArray, n);

		// 結果出力
		for (int i = 0; i < targetArray.length; i++) {
			if (i < targetArray.length - 1) {
				System.out.print(targetArray[i] + " ");
			} else {
				System.out.println(targetArray[i]);
			}
		}
		System.out.println(sortCount);

	}

	/**
	 * 指定された整数型配列を挿入ソートします。
	 * @param targetArray ソートしたい配列
	 * @param n 要素数
	 * @return 入れ替え回数
	 */
	private static int insertionSort(int[] targetArray, int n) {

		int sortCount = 0;
		for (int i = 1; i < n; i++) {
			int num = targetArray[i];
			int j = i -1;

			// 自分より大きい数が来たら入れ替える
			while (j >= i -1 && targetArray[j] > num) {
				targetArray[j+1] = targetArray[j];
				j--;
				sortCount++;
			}
			targetArray[j+1] = num;
		}

		return sortCount;

	}

}
