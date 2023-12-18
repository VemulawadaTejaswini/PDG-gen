import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * 入力された数字を構成する数字の組み合わせ数を計算して出力する。
	 *
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		// 入力がある限り処理を行う
        String line = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                System.in));
        while ((line = reader.readLine()) != null) {

        	int input = Integer.parseInt(line);
        	System.out.println(calculateNumberOfCombination(input));

        }

        if (reader != null) {
            reader.close();
        }
	}

	/**
	 * 入力された数値を構成する4つの数字の組み合わせの数を求める。
	 *
	 * @param input 入力された数値
	 * @return 組み合わせの数
	 */
	protected static int calculateNumberOfCombination(int input) {

		// 全パターンを試す
		int count = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					for (int l = 0; l < 10; l++) {
						if (i + j + k + l == input) {
							count++;
						}
					}
				}
			}
		}

		return count;
	}
}