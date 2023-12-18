import java.util.Arrays;
import java.util.Scanner;

/**
 * ZAKIREN第5章
 *
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
		int n = Integer.parseInt(scan.nextLine()); // 要素数

		// ソート対象配列の読み込み
		String[] targetArrayOrg = scan.nextLine().split(" ");

		// 読み込み終了
		scan.close();

		// ソート結果表示用に配列をディープコピー
		String[] targetArrayForBubbleSort = Arrays.copyOf(targetArrayOrg, targetArrayOrg.length);
		String[] targetArrayForSelectionSort = Arrays.copyOf(targetArrayOrg, targetArrayOrg.length);

		// バブルソートを実行
		bubbleSort(n, targetArrayForBubbleSort);

		// 結果出力
		for (int i = 0; i < targetArrayForBubbleSort.length; i++) {
			if (i < targetArrayForBubbleSort.length - 1) {
				System.out.print(targetArrayForBubbleSort[i] + " ");
			} else {
				System.out.println(targetArrayForBubbleSort[i]);
			}
		}
		System.out.println(isStableSort(targetArrayOrg, targetArrayForBubbleSort) ? "Stable" : "Not Stable");

		// 選択ソートを実行
		selectionSort(n, targetArrayForSelectionSort);

		// 結果出力
		for (int i = 0; i < targetArrayForSelectionSort.length; i++) {
			if (i < targetArrayForSelectionSort.length - 1) {
				System.out.print(targetArrayForSelectionSort[i] + " ");
			} else {
				System.out.println(targetArrayForSelectionSort[i]);
			}
		}
		System.out.println(isStableSort(targetArrayOrg, targetArrayForSelectionSort) ? "Stable" : "Not Stable");

	}

	/**
	 * 配列に数字の重複があるかを判別する。
	 * @param sortedArray ソート済みの配列
	 * @return 重複があればtrue、なければfalse
	 */
	private static boolean isDuplicate(String[] sortedArray) {

		for (int i = 1; i < sortedArray.length; i++) {
			if (sortedArray[i-1].substring(1, 2).equals(sortedArray[i].substring(1, 2))) {
				// ソート済みの配列に置いて、隣り合う数字に同じ数字があれば重複している
				return true;
			}
		}

		return false;
	}

	/**
	 * 安定ソートかを判別する。
	 *
	 * @param originalArray ソート前のの配列
	 * @param sortedArray ソート後の配列
	 * @return 安定ソートであればtrue、なければfalse
	 */
	private static boolean isStableSort(String[] originalArray, String[] sortedArray) {

		// 数字の重複があるとき
		if (isDuplicate(sortedArray)) {
			for (int i = 0; i < originalArray.length; i++) {
				for (int j = 0; j < sortedArray.length; j++) {
					if (j != 0 && originalArray[i].equals(sortedArray[j]) && originalArray[i].substring(1, 2).equals(sortedArray[j-1].substring(1, 2))) {
						return false;
					}
				}
			}
		}

		return true;
	}

	/**
	 * 指定された整数配列をバブルソートする。
	 *
	 * @param n
	 *            配列の要素数
	 * @param targetArray
	 *            バブルソートしたい整数配列
	 */
	private static void bubbleSort(int n, String[] targetArray) {

		boolean isNotSorted = true; // ソート未完了フラグ
		// ソートが完了するまで
		while (isNotSorted) {
			isNotSorted = false;

			// 天秤を右端から移動していく
			for (int i = n - 1; i > 0; i--) {

				int nowNumber = Integer.parseInt(targetArray[i].substring(1, 2));
				int leftNumber = Integer.parseInt(targetArray[i - 1].substring(1, 2));

				// 自分より小さい値が左側に居たら
				if (nowNumber < leftNumber) {
					// 2つの要素を入れ替える
					exchangeArrayValue(targetArray, i, i - 1);
					isNotSorted = true;
				}
			}
		}

	}

	/**
	 * 指定された整数配列を選択ソートする。
	 *
	 * @param n
	 *            要素数
	 * @param targetArray
	 *            選択ソートしたい整数配列
	 * @return 入れ替え回数
	 */
	private static void selectionSort(int n, String[] targetArray) {

		for (int i = 0; i < n; i++) {
			int minIndex = i; // 最小値の要素番号
			for (int j = i; j < n; j++) {

				int nowNumber = Integer.parseInt(targetArray[j].substring(1, 2));
				int minNumber = Integer.parseInt(targetArray[minIndex].substring(1, 2));

				if (nowNumber < minNumber) {
					// 最小値より低い値があったら最小値の要素番号を更新
					minIndex = j;
				}
			}
			// 最小値の値と左端を入れ替える
			if (i != minIndex) {
				exchangeArrayValue(targetArray, minIndex, i);
			}
		}

	}

	/**
	 * 配列内の2つの要素を入れ替える。
	 *
	 * @param array
	 *            入れ替えたい要素を含む配列
	 * @param a
	 *            入れ替えたい要素のindex
	 * @param b
	 *            入れ替えたい要素のindex
	 */
	private static void exchangeArrayValue(Object[] array, int a, int b) {
		Object temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

}
