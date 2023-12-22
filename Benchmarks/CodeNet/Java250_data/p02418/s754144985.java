import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Lesson8D 図のようなリング状の文字列 s の任意の位置から、 時計回りに連続した文字をいくつか選んで、 文字列 p が作れるかを判定するプログラム
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

		// 1行読み込む
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(
					System.in));

			String strLine = insBR.readLine();

			// char型に分解 文字列s
			char[] chaAryLineS = strLine.toCharArray();

			char[] chaAryLineSAfter = new char[chaAryLineS.length * 2];

			strLine = insBR.readLine();

			// char型に分解 文字列p
			char[] chaAryLineP = strLine.toCharArray();

			System.arraycopy(chaAryLineS, 0, chaAryLineSAfter, 0,
					chaAryLineS.length);
			System.arraycopy(chaAryLineS, 0, chaAryLineSAfter,
					chaAryLineS.length, chaAryLineS.length);

			// 終了条件
			int intlength = chaAryLineSAfter.length - chaAryLineP.length + 1;

			int intCount = 0;

			boolean booYes = false;

			for (int i = 0; i < intlength; i++) {

				for (int j = 0; j < chaAryLineP.length; j++) {
					if (chaAryLineSAfter[i + j] == chaAryLineP[j]) {
						intCount++;

						if (intCount == chaAryLineP.length) {
							booYes = true;
						}
					}
				}
				intCount = 0;
			}

			if (booYes) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}