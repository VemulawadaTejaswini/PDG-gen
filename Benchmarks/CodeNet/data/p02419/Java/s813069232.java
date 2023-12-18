import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Lesson9A １つの単語 W と文章 T が与えられます。 T の中にある W の数を出力するプログラム 文章 T
 * に含まれるスペースまたは改行で区切られた 文字列を単語 Ti とします。すべての Ti において単語 W
 * と同じになるものを数えて下さい。なお、大文字と小文字は区別しません。
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

		// 答えをカウント
		int intAnwer = 0;

		// 1行目読み込む
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

			String strLine = insBR.readLine();

			// 大文字は小文字にしておく
			strLine = strLine.toLowerCase();

			// char型に分解
			char[] chaAryLine1 = strLine.toCharArray();

			// ２行目以降を読み込む
			while (true) {
				strLine = insBR.readLine();

				// 終了条件
				if (strLine.equals("END_OF_TEXT")) {
					break;
				}

				// 大文字は小文字にしておく
				strLine = strLine.toLowerCase();

				// char型に分解
				char[] chaAryLineAll = strLine.toCharArray();

				// 何文字一緒か
				int intCount = 0;

				// 終了条件
				int intlength = chaAryLineAll.length - chaAryLine1.length + 1;
				
				//ロジック
				for (int i = 0; i < intlength; i++) {

					char a = chaAryLine1[0];
					char b = chaAryLineAll[i];

					if (a == b) {
						for (int j = 1; j < chaAryLine1.length; j++) {
							a = chaAryLine1[j];
							b = chaAryLineAll[i + j];

							if (a == b) {
								intCount++;

		// カウントがMAXならYes
		if (intCount == chaAryLine1.length - 1) {
									
			//前の文字の後の文字がともに' 'なら
			if(chaAryLineAll[i -1] == ' ' && chaAryLineAll[i + j + 1] == ' ') {

intAnwer++;
									}
									
								}
							}
						}
					}
					// 初期化
					intCount = 0;
				}
			}

			// 出力
			System.out.println(intAnwer);

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}