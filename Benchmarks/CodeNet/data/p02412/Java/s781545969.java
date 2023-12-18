import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Lesson7B 1 から n までの数の中から、重複無しで３つの数を
 * 選びそれらの合計が x となる組み合わせ の数を求めるプログラム
 * 例えば、1 から * 5 までの数から３つを選んで
 * それらの合計が 9 となる組み合わせは、
 * ?1 + 3 + 5 = 9
 * ?2 + 3 + 4 = 9
 * の２通りがあります。
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

		// 答え
		ArrayList<Integer> intAryAnswer = new ArrayList<Integer>();

		int intAnswerCount = 0;

		// 1列づつ読み込む
		try {
			BufferedReader insBR = new BufferedReader(
					new InputStreamReader(System.in));

			//２つの値が決まった時、残りの3つ目を初期化
			int intThird = 0;

			int intAnswer = 0;

			while (true) {
				String strLine = insBR.readLine();

				//終了条件
				if(strLine.equals("0 0")) {
					break;
				}
				// ばらけさせる
				String[] strAryLine = strLine.split(" ");

				//nの値
				int intN = Integer.parseInt(strAryLine[0]);

				//xの値
				int intX = Integer.parseInt(strAryLine[1]);

				//3
				//12 13 23
				//4
				//12 13 14 23 34

				for(int i = intN; i > 0 ; i--) {
					for(int j = i - 1; j > 0; j--) {
						intThird = intX - i - j;
						if(intThird <= intN &&
								intThird != i &&
								intThird != j &&
								0 < intThird &&
								intThird < j
								) {
							intAnswer++;
						}
					}
				}

				intAryAnswer.add(intAnswer);
				intAnswer = 0;
				intAnswerCount++;

			}

			//出力
//			int intsize = intAryAnswer.size();
			for(int i = 0; i < intAnswerCount; i++) {
				System.out.println(intAryAnswer.get(i));
			}

		} catch (IOException e) {
			System.out.println(e);
		} catch(NumberFormatException e) {
			System.out.println("数字で入力して下さい");
		}
	}
}