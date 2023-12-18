import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;


/**
 *　２つの整数 a と b を読み込んで、以下の値を計算するプログラム
 * @author 前島佑介
 * @version 2014/12/1
 */
class Main {

	// プログラムのエントリポイント
	public static void main(String[] args) {

		//入力値1つ目
		int intNum1 = 0;

		//入力値2つ目
		int intNum2 = 0;

		//何回約数が存在したかカウンター
		int intAnswer = 0;

		//割った数
		int intDivision = 0;

		//剰余
		int intSurplus = 0;

		//割った数
		double dbDivision = 0.0;

		try{
			//キーボードからの入力準備
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			//キーボードからの入力をString型で受け取る
			String strLine = br.readLine();

			//文字列の分割:入力値を" "で分ける
			//分けた文字列はstrLineAry[0]とstrLineAry[1]とstrLineAry[2]に分けられる
			String[] strLineAry = strLine.split(" ");


			//入力値の１つ目の値
			intNum1 = Integer.parseInt(strLineAry[0]);

			//２つ目の値
			intNum2 = Integer.parseInt(strLineAry[1]);

			//割った数
			intDivision = intNum1 / intNum2;

			//剰余
			intSurplus = intNum1 % intNum2;

			//割った数
			dbDivision = (double)intNum1 / (double)intNum2;

			 //小数5桁まで
		    DecimalFormat insdf = new DecimalFormat("0.00000");

			//結果を出力 double型は少数5桁まで表示
			System.out.println(intDivision + " " + intSurplus +  " " + insdf.format(dbDivision));

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