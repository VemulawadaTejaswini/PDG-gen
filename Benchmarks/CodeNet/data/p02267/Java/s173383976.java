import java.util.Arrays;
import java.util.Scanner;

/**
 * ZAKIREN第5章 4-6.データ構造の応用
 * 
 * @author tdi5277
 *
 */
public class Main {
	/** 入力用 */
	private static Scanner scan = new Scanner(System.in);

	/** 出力用 */
	private static StringBuilder stringBuilder = new StringBuilder();

	/**
	 * 文字列から配列を生成します。
	 * @param size 配列のサイズ
	 * @param arrayStr 配列にしたい数字を空白繋ぎにした文字列
	 * @return 配列
	 */
	private static int[] generateArray(int size, String arrayStr) {
		int[] array = new int[size];
		Arrays.fill(array, 0);
		String[] temp = arrayStr.split(" ");
		for (int i = 0; i < size; i++) {
			array[i] = Integer.parseInt(temp[i]);
		}
		Arrays.sort(array);
		return array;
	}
	
	/**
	 * メイン。
	 * 
	 * @param args 未使用
	 */
	public static void main(String[] args) {
		// 読み込み
		int n       = Integer.parseInt(scan.nextLine());
		String strS = scan.nextLine();
		int q       = Integer.parseInt(scan.nextLine());
		String strT = scan.nextLine();
		
		// 読み込み終了
		scan.close();
		scan = null;

		// 配列を生成
		int[] arrayS = generateArray(n, strS);
		int[] arrayT = generateArray(q, strT);
		
		// 同じものを含む個数を計算
		int count = 0;
		for (int i = 0; i < arrayS.length; i++) {
			if (i > 0 && arrayS[i] == arrayS[i - 1]) {
				continue;
			}
			for (int j = 0; j < arrayT.length; j++) {
				if (j > 0 && arrayT[j] == arrayS[j - 1] ||
						arrayS[i] < arrayT[j]) {
					continue;
				}
				if (arrayS[i] == arrayT[j]) {
					count++;
				}
			}
		}

		// 結果出力 合計
		stringBuilder.append(count);

		System.out.println(stringBuilder.toString());

	}

}

