import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Main {

	/** 車両を出す合図 */
	private static final String OUTPUT = "0";

	/**
	 * 入力値に従って車両を出し入れし、出ていく場合は車両番号を表示する。
	 *
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		Stack<String> stack = new Stack<String>();
		String line = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		while ((line = reader.readLine()) != null) {

			if (OUTPUT.equals(line)) {
				// 車両を出す場合はスタック上の一番上にある車両を出力する
				System.out.println(stack.pop());

			} else {
				// スタックに車両を追加する
				stack.push(line);
			}
		}

		if (reader != null) {
			reader.close();
		}
	}

}