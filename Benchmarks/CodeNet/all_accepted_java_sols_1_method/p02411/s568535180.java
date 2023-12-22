import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Lesson7A あなたの課題は、あるクラスの数学の成績を付けるプログラムを作成することです。
 *
 * プログラムは複数の学生のテストの点数を読み込みます。
 *
 * テストの点数は、中間試験の点数 m、期末試験の点数 f、再試験の点数 r で構成されています。
 *
 * 中間試験と期末試験は 50 点満点（m, f ? 50）、再試験は 100 点満点 （r ? 100）です。
 *
 * 試験を受けていない場合は点数を -1 とします。
 *
 * 以下の手順で成績が付けられます： ?中間試験、期末試験のいずれかを欠席した場合成績は F。 ?中間試験と期末試験の合計点数が 80 以上ならば成績は A
 * 。 ?中間試験と期末試験の合計点数が 65 以上 80 未満ならば成績は B。 ?中間試験と期末試験の合計点数が 50 以上 65 未満ならば成績は C。
 * ?中間試験と期末試験の合計点数が 30 以上 50 未満ならば成績は D。 ただし、再試験の点数が 50 以上ならば成績は C。
 * ?中間試験と期末試験の合計点数が 30 未満ならば成績は F。
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
		ArrayList<Character> chaAnswer = new ArrayList<Character>();

		//答えがいくつあるかカウント
		int intAnwer = 0;

		// 1列づつ読み込む
		try {
			BufferedReader insBR = new BufferedReader(
					new InputStreamReader(System.in));


			while (true) {
				String strLine = insBR.readLine();

				//終了条件
				if(strLine.equals("-1 -1 -1")) {
					break;
				}

				// ばらけさせる
				String[] strAryLine = strLine.split(" ");

				// int型にキャスト
				// 中間テスト
				int IntermediateTest = Integer.parseInt(strAryLine[0]);

				// 期末テスト
				int intYearEndTest = Integer.parseInt(strAryLine[1]);

				// 追試
				int intAdditionalTest = Integer.parseInt(strAryLine[2]);

				// 答えのストック　A?F以外で初期化
				char chaAnswerStock = 'G';

				//-1は受けてないので中間テストと期末テストは0点とする
				if(IntermediateTest == -1) {
					intYearEndTest = 0;
				}

				if(intYearEndTest == -1) {
					IntermediateTest = 0;
				}

				// 成績の判断
				if (80 <= (IntermediateTest + intYearEndTest)) {
					chaAnswerStock = 'A';
				} else if (65 <= (IntermediateTest + intYearEndTest)) {
					chaAnswerStock = 'B';
				} else if (50 <= (IntermediateTest + intYearEndTest)) {
					chaAnswerStock = 'C';
				} else if (30 <= (IntermediateTest + intYearEndTest)) {
					chaAnswerStock = 'D';

					if (50 <= intAdditionalTest) {
						chaAnswerStock = 'C';
					}
				} else {
					chaAnswerStock = 'F';
				}
				chaAnswer.add(chaAnswerStock);
				intAnwer++;
			}

			// 出力
			for(int i = 0; i < intAnwer; i++) {
				System.out.println(chaAnswer.get(i));
			}

		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字で入力して下さい");
		}
	}
}