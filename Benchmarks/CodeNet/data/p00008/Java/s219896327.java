import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	/**
	 * 入力された数字を構成する数字の組み合わせ数を計算して出力する。
	 *
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		// 入力値をリストで受け取る
		List<Integer> inputList = readNumberList();

		// 必要な組み合わせ数のマップを作成する
		int maxInput = getMaxNumber(inputList);
		int[] countMap = createCombinationCountMap(maxInput);

		// 結果を出力する
		for (Integer input : inputList) {
			System.out.println(countMap[input]);
		}

	}

	/**
	 * 標準入力から数値を読んでリストとして返却する。
	 *
	 * @return 入力された数値のリスト
	 */
	protected static List<Integer> readNumberList() throws IOException {

		List<Integer> inputList = new ArrayList<Integer>();

		String line = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		while((line = reader.readLine()) != null){
			inputList.add(Integer.parseInt(line));
		}

		if (reader != null) {
			reader.close();
		}

		return inputList;
	}

	/**
	 * 数値リストのうち最大の数値を取得する。
	 *
	 * @param inputList 数値リスト
	 * @return 数値リスト内の最大の数値
	 */
	protected static int getMaxNumber(List<Integer> inputList) {
		int maxInput = 0;
		for (Integer input : inputList) {
			if (maxInput < input) {
				maxInput = input;
			}
		}
		return maxInput;
	}

	/**
	 * 入力された数値を構成する4つの数字の組み合わせの数を求める。
	 *
	 * @param max 入力された数値の最大値
	 * @return 組み合わせの数
	 */
	protected static int[] createCombinationCountMap(int max) {

		// 最大値より要素が1大きい配列を用意する
		int[] countMap = new int[max + 1];

		// 全パターンを試し、マップに登録する
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					for (int l = 0; l < 10; l++) {
						countMap[i + j + k + l]++;
					}
				}
			}
		}

		return countMap;
	}
}