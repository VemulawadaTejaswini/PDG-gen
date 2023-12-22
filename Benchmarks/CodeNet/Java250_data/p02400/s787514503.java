import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;


/**
 * Lesson4A　半径 r の円の面積と円周の長さを求めるプログラム
 * @author 前島佑介
 * @version 2014/12/1
 */
class Main {

	// プログラムのエントリポイント
	public static void main(String[] args) {

		//入力値
		double dbNum = 0;

		//面積
		double dbArea = 0.0;

		//円周
		double dbCircumference = 0.0;

		try{
			//キーボードからの入力準備
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			//キーボードからの入力をString型で受け取る
			String strLine = br.readLine();

			//入力値
			dbNum = Double.parseDouble(strLine);

			//面積は半径ｘ半径ｘPI
			dbArea = dbNum * dbNum * Math.PI;

			//円周は２ｘ半径ｘPI
			dbCircumference = 2.0 * dbNum * Math.PI;

			 //小数5桁まで
		    DecimalFormat insdf = new DecimalFormat("0.000000");

			//結果を出力 小数5桁まで表示
			System.out.println(insdf.format(dbArea) +  " " + insdf.format(dbCircumference));

			//例外処理
			}catch(IOException e) {

				//例外時の出力
				System.out.println(e);

			}catch(NumberFormatException e) {

				//数値以外の入力値で出力
				System.out.println("数値で入力して下さい");
			}
	}
}