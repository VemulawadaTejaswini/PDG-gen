import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * メインクラス
 *
 */
public class Main {

	/**
	 * メインメソッド
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		// ============================================================
		// 標準入力を変数に設定
		// ============================================================

		// 標準入力を取得
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");

		List<Integer> in = new ArrayList<Integer>();

		for (int i = 0; i < line.length; i++) {
			in.add(Integer.parseInt(line[i]));
		}

		int max = 0;
		for (int i : in) {

			if (max < i) {
				max = i;
			}
		}

		int a = 0;
		int b = 0;

		for (int i : in) {

			if (max != i && a == 0) {
				a = i;
			} else if (max != i && a != 0 && b == 0) {
				b = i;
			}

		}

		System.out.println(a * b / 2);

	}
}