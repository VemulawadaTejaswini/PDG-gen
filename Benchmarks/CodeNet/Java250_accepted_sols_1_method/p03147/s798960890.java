import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
		String line = br.readLine();

		long N = Long.parseLong(line.split(" ")[0]);

		line = br.readLine();
		String[] str = line.split(" ");
		long[] hana = new long[str.length];

		for (int i = 0; i < str.length; i++) {
			hana[i] = Long.parseLong(str[i]);
		}
		long answer = 0;
		while (true) {

			boolean b = false;
			int start = 0;
			int end = 0;
			for (int i = 0; i < hana.length; i++) {

				if (hana[i] > 0 && !b) {
					b = true;
					start = i;
				}

				if (b && (hana[i] == 0 && end == 0) || i == hana.length - 1) {

					if (i == hana.length - 1 && hana[i] != 0) {
						end = i;
					} else {
						end = i - 1;
					}

					long min = 0;
					for (int j = start; j <= end; j++) {
						if (min == 0 || min > hana[j]) {
							min = hana[j];
						}

					}
					for (int j = start; j <= end; j++) {
						hana[j] = hana[j] - min;
					}
					b = false;
					start = 0;
					end = 0;
					answer += min;
				}
			}

			boolean has = false;
			for (int i = 0; i < hana.length; i++) {
				if (hana[i] > 0) {
					has = true;
					break;
				}
			}

			if (!has) {
				System.out.println(answer);
				return;
			}
		}

	}
}