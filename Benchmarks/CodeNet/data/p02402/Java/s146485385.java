import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;


/**
 * Lesson4D　n  個の整数 a i (i=1,2,...n) を入力し、それらの最小値、最大値、合計値を求めるプログラム
 * @author 前島佑介
 * @version 2014/12/1
 */
class Main {

	// プログラムのエントリポイント
	public static void main(String[] args) {

		//入力値 １つ目 2列目の扱う数
		int intNum = 0;

		//最小値
		int intMin = 0;

		//最大値
		int intMax = 0;

		//合計
		double dbSum = 0;


		try{
			//キーボードからの入力準備
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			//キーボードからの入力をString型で受け取る初期化
			String strLine = br.readLine();

			//入力値 １つ目　2列目の扱う数
			intNum = Integer.parseInt(strLine);

			//キーボードからの入力をString型で受け取る
			strLine = br.readLine();

			//文字列の分割:入力値を" "で分ける
			//分けた文字列はstrLineAry[0]とstrLineAry[1]とstrLineAry[2]に分けられる
			String[] strLineAry = strLine.split(" ");

			//1つ目の値を最小値に入れておく
			intMin = Integer.parseInt(strLineAry[0]);

			//最大値にも最小値の値を入れておく
			intMax = intMin;

			//総数をカウントしていく
			dbSum += (double)intMin;

			//2つ目以降
			for(int i = 1; i < intNum; i++) {

				int intNum2 = Integer.parseInt(strLineAry[i]);

				//最小値より小さいなら
				if(intNum2 < intMin) {

					//これを最小値にする
					intMin = intNum2;
				}

				//最大値より大きいなら
				if(intMax < intNum2) {

					//これを最大値にする
					intMax = intNum2;
				}

				//総数をカウントしていく
				dbSum += (double)intNum2;
			}

			//小数5桁まで
		    DecimalFormat insDF = new DecimalFormat("0");

			//出力
			System.out.println(intMin + " " + intMax + " " + insDF.format(dbSum));

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