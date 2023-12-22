import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Lesson8A 与えられた文字列の小文字と大文字を入れ替えるプログラム
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

		//1行読み込む
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

			String strLine = insBR.readLine();

			//char型に分解
			char[] chaAryLine = strLine.toCharArray();

			//各charが大文字なら小文字、小文字なら大文字へ
			for(int i = 0; i < chaAryLine.length; i++) {
				if(Character.isUpperCase(chaAryLine[i])) {
					chaAryLine[i] = Character.toLowerCase(chaAryLine[i]);
				}else if(Character.isLowerCase(chaAryLine[i])) {
					chaAryLine[i] = Character.toUpperCase(chaAryLine[i]);
				}

				//出力
				System.out.print(chaAryLine[i]);
			}
			System.out.println("");

		} catch (IOException e) {
			System.out.println(e);
		}

	}
}