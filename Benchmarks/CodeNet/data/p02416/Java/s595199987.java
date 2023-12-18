import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



/**
 * Lesson8B 与えられた数の各桁の和を計算するプログラム
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

		//答えの格納場所
		ArrayList<Integer> intAry = new ArrayList<Integer>();

		//答えでカウント式
		int intAnswer = 0;

		//各行読み込む
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

			while(true) {
				String strLine = insBR.readLine();

				//終了条件
				if(strLine.equals("0")) {
					break;
				}

				//char型に分解
				char[] chaAryLine = strLine.toCharArray();


				//int型にキャスト
				for(int i = 0; i < chaAryLine.length; i++) {
					int intNum = Integer.parseInt("" + chaAryLine[i]);

					//答えをカウント
					intAnswer += intNum;
				}
				intAry.add(intAnswer);

				//答え初期化
				intAnswer = 0;

			}
			int intSize = intAry.size();

		    //出力
			for(int i = 0; i < intSize; i++) {
				System.out.println(intAry.get(i));
			}

		} catch (IOException e) {
			System.out.println(e);
		}

	}
}