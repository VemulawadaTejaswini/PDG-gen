import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/** X 座標の上限 */
	private static final int X_LIMIT = 600;

	/**
	 * 入力値の幅の長方形で二次関数の面積の近似値を求める。
	 *
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		// 入力がある限り処理を行う
		String line = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		while ((line = reader.readLine()) != null) {
			int area = calculateArea(Integer.parseInt(line));
			System.out.println(area);
		}

		if (reader != null) {
			reader.close();
		}
	}

	/**
	 *  指定された幅の長方形で二次関数の面積の近似値を求める。
	 *
	 * @param width 長方形の幅
	 * @return 二次関数の面積の近似値
	 */
	protected static int calculateArea(final int width) {

		int area = 0;
		int parameter = width;

		// 限界値未満の間、面積の計算を繰り返す
		while(parameter < X_LIMIT) {
			area += width * f(parameter);
			parameter += width;
		}

		return area;
	}

	/**
	 * 二次関数 y = x^2
	 *
	 * @param parameter x
	 * @return x^2
	 */
	protected static int f(final int parameter) {
		return parameter * parameter;
	}

}