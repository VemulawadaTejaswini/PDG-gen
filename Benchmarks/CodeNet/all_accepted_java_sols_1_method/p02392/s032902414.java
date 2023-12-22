/**
 * ３つの整数a, b, cを読み込み、それらが a < b < cの条件を満たすならば"Yes"を、
 * 満たさないならば"No"を出力するプログラム
 * @author 前島佑介
 *@version 2014/12/1
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// 2-A ３つの整数a, b, cを読み込み、それらが a < b < cの条件を満たすならば"Yes"を、
//満たさないならば"No"を出力するプログラム
class Main {

	// プログラムのエントリポイント
	public static void main(String[] args) {

		//入力値1つ目
		int intNum1 = 0;

		//入力値2つ目
		int intNum2 = 0;

		//入力値2つ目
		int intNum3 = 0;

		try{
			//キーボードからの入力準備
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			//キーボードからの入力をString型で受け取る
			String strLine = br.readLine();

			//文字列の分割:入力値を" "で分ける
			//分けた文字列はstrLineAry[0]とstrLineAry[1]に分けられる
			String[] strLineAry = strLine.split(" ");

			//入力値の１つ目の値
			intNum1 = Integer.parseInt(strLineAry[0]);

			//２つ目の値
			intNum2 = Integer.parseInt(strLineAry[1]);

			//３つ目の値
			intNum3 = Integer.parseInt(strLineAry[2]);

			if(intNum1 < intNum2 && intNum2 < intNum3) {
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}



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