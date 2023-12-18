import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Lesson9B １つのアルファベットが描かれた n 枚のカードの山をシャッフルします。 1回のシャッフルでは、下から h 枚のカードをまとめて取り出し、
 * それを残ったカードの山の上に積み上げます。 カードの山は以下のように１つの文字列で与えられます。 abcdeefab
 * 最初の文字が一番下にあるカード、最後の文字が一番上にあるカードを示しています。 例えば、これを h が 4 でシャッフルすると、最初の4文字 abcd
 * が、 残りの文字 eefab の末尾へ連結されるので以下のようになります： eefababcd このシャッフルを何回か繰り返します。
 * カードの山の最初の並び（文字列）と h の列をを読み込み、最後の並び（文字列）を出力するプログラム
 *
 * @author Internship
 *
 */
public class Main{

	/**
	 * プログラムのエントリポイント
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		// 答えの格納場所
		ArrayList<String> StringAry = new ArrayList<String>();

		// charを繋げてStrinにする
		String StrFromChar = "";

		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

			while (true) {

				// 1行目読み込む
				String strLine = insBR.readLine();

				if (strLine.equals("-")) {
					break;
				}

				// char型に分解
				char[] chaAryLine1 = strLine.toCharArray();

				// 入れ替え後の配列
				char[] charAfter = new char[chaAryLine1.length];

				// 2行目の読み込み
				strLine = insBR.readLine();

				// 2つ目の引数を取得
				int intNum2 = Integer.parseInt(strLine);

				// 3行目以降を読み込む
				for (int i = 0; i < intNum2; i++) {
					strLine = insBR.readLine();

					// シャフルの切れ目を取得
					int intShuffle = Integer.parseInt(strLine);

					// 入れ替え
					System.arraycopy(chaAryLine1, 0, charAfter,
							chaAryLine1.length - intShuffle, intShuffle);

					System.arraycopy(chaAryLine1, intShuffle, charAfter, 0,
							chaAryLine1.length - intShuffle);

					// 入れ替え後のcharAfterの値をchaAryLine1へコピー
					System.arraycopy(charAfter, 0, chaAryLine1, 0,
							charAfter.length);
				}

				StrFromChar = String.valueOf(charAfter);

				StringAry.add(StrFromChar);

			}

			int intSize = StringAry.size();

			// 出力
			for (int i = 0; i < intSize; i++) {
				System.out.println(StringAry.get(i));
			}

		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字で入力して下さい");
		}
	}
}