import java.util.Scanner;

/**
 * ZAKIREN第5章
 *
 * @author K.Yamauchi
 *
 */
public class Main {

	/** 入力用 */
	private static Scanner scan = new Scanner(System.in);

	/** 出力用 */
	private static StringBuilder stringBuilder = new StringBuilder();

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		int n = Integer.parseInt(scan.nextLine()); // 要素数

		// ソート対象配列の読み込み
		int[] targetArray = new int[n];

//		String target = scan.nextLine();
//		for (int i = 0; i < n; i++) {
//			targetArray[i] = Integer.parseInt(target);
//			if (i < n - 1) {
//				target = scan.nextLine();
//			} else {
//				target = null;
//			}
//		}

		for (int i = 0; i < n; i++) {
			targetArray[i] = Integer.parseInt(scan.nextLine());
		}

		// 読み込み終了
		scan.close();
		scan = null;

		// シェルソートを実行
		shellSort(targetArray, n);

		// 結果出力
		printSortResult(targetArray);
		System.out.print(stringBuilder.toString());

	}

	/**
	 *
	 * @param array
	 * @param number
	 * @param g
	 * @param cnt
	 * @return
	 */
	private static int insertionSort(int[] array, int number, int g, int cnt) {

		// gからn-1まで
		int temp = 0;
		for (int i = g, j = 0; i < number; i++) {
			temp = array[i];
			j = i - g;

			// 自分より大きいやつが見つかるまで
			while (j >= 0 && array[j] > temp) {
				array[j + g] = array[j];
				j = j - g;
				cnt++;
			}
			array[j + g] = temp;
		}
		return cnt;
	}

	/**
	 *
	 * @param array
	 * @param number
	 */
	private static void shellSort (int[] array, int number) {

		// Gの準備
		int[] G = new int[20];

		int gSize = 0;
		for (int i = 1; i <= number; i = i * 3 + 1) {
			// 3g + 1
			G[gSize++] = i;
		}

		// ソートしながら結果出力
		int cnt = 0;
		stringBuilder.append(gSize);
		stringBuilder.append('\n');
		for (int i = gSize - 1; i >= 0 ; i--) {
			stringBuilder.append(G[i]);
			if (i != 0)
				stringBuilder.append(' ');
			cnt = insertionSort(array, number, G[i], cnt);
		}
		G = null;

		// 結果出力
		stringBuilder.append('\n');
		stringBuilder.append(cnt);
		stringBuilder.append('\n');
	}

	/**
	 * ソート結果の出力をする。
	 * @param sortedArray ソートされた配列
	 */
	private static void printSortResult(int[] sortedArray) {
		for (int i = 0; i < sortedArray.length; i++) {
			stringBuilder.append(sortedArray[i]);
			stringBuilder.append('\n');
		}
	}

}

