import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	/** 入力される数値の数 */
	private static final int NUMBER_OF_INPUT = 2;

	/** 入力される数値のインデックス（小） */
	private static final int INDEX_LITTLE = 0;

	/** 入力される数値のインデックス（大） */
	private static final int INDEX_GREAT = 1;

	/**
	 * 空白区切りの2つの数字を受け取り、その2つの数字の合計値の桁数を出力する。
	 *
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		// 入力がある限り処理を行う
		String line = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		while ((line = reader.readLine()) != null) {

			// 入力文字列を数値配列に変換する
			int[] input = convertStringToIntArray(line);

			// 合計値の桁数を取得する
			Arrays.sort(input);
			int greatestCommonDivisor = calculateGreatestCommonDivisor(input);
			int leastCommonMultiplyer = calculateLeastCommonMultiplyer(input, greatestCommonDivisor);

			// 結果を出力する
			System.out.print(greatestCommonDivisor);
			System.out.print(" ");
			System.out.println(leastCommonMultiplyer);
		}

		if (reader != null) {
			reader.close();
		}
	}

	/**
	 * 空白区切りの数値を取得し、整数の配列として返却する。
	 *
	 * @param line
	 *            空白区切りの数値文字列
	 * @return 整数の配列
	 */
	protected static int[] convertStringToIntArray(String line) {
		int[] result = new int[NUMBER_OF_INPUT];

		String[] splittedLine = line.split(" ");
		for (int i = 0; i < splittedLine.length; i++) {
			result[i] = Integer.parseInt(splittedLine[i]);
		}

		return result;
	}

	/**
	 * 引数で渡された整数配列の最大公約数を返す。
	 *
	 * @param input
	 *            整数の配列
	 * @return 最大公約数
	 */
	protected static int calculateGreatestCommonDivisor(int[] input) {

		// ユークリッドの互除法
		int greater = input[INDEX_GREAT];
		int less = input[INDEX_LITTLE];
		int divisor = greater - less;

		while (divisor != 0) {

			// 大きい方の値を greater に、小さい方の値を less に設定する
			if (less >= divisor) {
				greater = less;
				less = divisor;
			} else {
				greater = divisor;
			}
			divisor = greater - less;
		}

		// 最後のひとつ前の値が最大公約数
		return less;
	}

	/**
	 * 引数で渡された整数配列と最大公約数から最小公倍数を返す。
	 *
	 * @param input
	 *            整数の配列
	 * @param greatestCommonDivisor
	 * 			  最大公約数
	 *
	 * @return 最小公倍数
	 */
	protected static int calculateLeastCommonMultiplyer(int[] input, int greatestCommonDivisor) {

		// 最小公倍数 = 入力値A × 入力値B / 最大公約数
		// 最終結果は int の範囲に収まるが、先に割り算しておかないと int の範囲を超える可能性がある
		int leastCommonMultiplyer = input[INDEX_LITTLE] * (input[INDEX_GREAT]
				/ greatestCommonDivisor);
		return leastCommonMultiplyer;

	}

}