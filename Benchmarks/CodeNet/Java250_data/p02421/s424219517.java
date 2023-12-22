import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Lesson9C 太郎と花子がカードゲームをする。
 * 二人はそれぞれn枚のカードを持っており、nターンの勝負を行う。
 * 各ターンではそれぞれ１枚ずつカードを出す。
 * カードにはアルファベットからなる動物の名前が書かれており、
 * 辞書順で大きいものがそのターンの勝者となる。
 * 勝者には３ポイント、引き分けの場合にはそれぞれ１ポイントが加算される。
 * 太郎と花子の手持ちのカードの情報を読み込み、ゲーム終了後のそれぞれの得点を出力するプログラム
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

		// charを繋げてStringにする
		String StrFromChar = "";

		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));



			//点数を格納する場所
			int[] intAnswer = new int[2];



				// 1行目読み込む
				String strLine = insBR.readLine();

				int intNum = Integer.parseInt(strLine);

				//動物の名前の格納場所

				String[][] strAnimal = new String[2][intNum];

				// 2行目以降を読み込む
				for (int i = 0; i < intNum; i++) {
					strLine = insBR.readLine();

					//文字列の分割:入力値を" "で分ける
					//分けた文字列はstrLineAry[0]とstrLineAry[1]とstrLineAry[2]に分けられる
					String[] strLineAry = strLine.split(" ");

					strAnimal[0][i] = strLineAry[0];

					strAnimal[1][i] = strLineAry[1];

					if (strAnimal[0][i].compareToIgnoreCase(strAnimal[1][i]) == 0) {
						intAnswer[0]++;
						intAnswer[1]++;
					}else if(strAnimal[0][i].compareToIgnoreCase(strAnimal[1][i]) < 0) {
						intAnswer[1] += 3;
					}else if(strAnimal[0][i].compareToIgnoreCase(strAnimal[1][i]) > 0) {
						intAnswer[0] += 3;
					}



				}


			// 出力
			for (int i = 0; i < intAnswer.length; i++) {
				if(i == 0) {
					System.out.print(intAnswer[i]);
				}else {
					System.out.print(" " + intAnswer[i]);
				}
			}

			System.out.println("");

		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字で入力して下さい");
		}
	}
}