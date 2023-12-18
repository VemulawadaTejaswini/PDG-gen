import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * シーザー暗号を復号化する。
	 *
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		// 入力がある限り処理を行う
		String line = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		while ((line = reader.readLine()) != null) {

			// 復号化する
			String result = decode(line);

			// 出力する
			System.out.println(result);
		}

		if (reader != null) {
			reader.close();
		}
	}

	/**
	 * 1行分の文字列を復号化する。
	 *
	 * @param line
	 *            暗号化された文字列
	 * @return 復号化された文字列
	 */
	protected static String decode(String line) {

		// アルファベットを1文字ずつずらす
		for (int i = 1; i <= 26; i++){

			String decodedLine = tryDecode(line, i);

			// デバッグ
			// System.out.println(decodedLine);

			if (isDecoded(decodedLine)) {
				// デコードできていたら終了
				return decodedLine;
			}
		}

		return line;
	}

	/**
	 * 引数で渡された文字列のアルファベットを指定された数だけずらす。
	 *
	 * @param line 復号化対象の文字列
	 * @param move アルファベットをどれだけずらすか
	 * @return 復号化した結果
	 */
	protected static String tryDecode(String line, int move) {
		StringBuilder buffer = new StringBuilder();

		// 1文字ずつすべて処理する
		for (char ch : line.toCharArray()){
			if (Character.isLetter(ch)){
				buffer.append(tryDecodeCharacter(ch, move));

			} else {
				// アルファベット以外はそのまま
				buffer.append(ch);
			}
		}

		return buffer.toString();
	}

	/**
	 * 引数で渡された文字を指定された数だけずらす。
	 *
	 * @param ch ずらす対象の文字
	 * @param move アルファベットをどれだけずらすか
	 * @return ずらした結果のアルファベット
	 */
	protected static char tryDecodeCharacter(char ch, int move) {

		// a からの差分を取得する
		int fromA = ch - 'a';

		// さらにずらしたい分だけ加算し、z を超えないように 26 の剰余を取る
		int next = (fromA + move) % 26;

		// 文字に戻す
		return (char)('a' + next);
	}

	/**
	 * 引数で渡された文字列が正しく復号化されているか判定する。
	 *
	 * @param line 復号化された文字列
	 * @return 正しく復号化されていれば true、そうでなければ false
	 */
	protected static boolean isDecoded(String line) {
		// the、this、that のいずれかが含まれるならば復号化完了
		return (line.contains("the") || line.contains("this") || line.contains("that"));
	}
}