/**
 * ２つの整数 a, b を読み込んで、a と b の大小関係を出力するプログラム
 * @author 前島佑介
 *@version 2014/12/1
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// 2-A ２つの整数 a, b を読み込んで、a と b の大小関係を出力するプログラム
class Main {

	// プログラムのエントリポイント
	public static void main(String[] args) {

		//入力値1つ目
		int intNum1 = 0;

		//入力値2つ目
		int intNum2 = 0;

		try{
			//キーボードからの入力準備
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			//キーボードからの入力をString型で受け取る
			String strLine = br.readLine();

			//文字列の分割:入力値を" "で分ける
			//分けた文字列はstrLineAry[0]とstrLineAry[1]に分けられる
			String[] strLineAry = strLine.split(" ");

			//入力値の１つ目は縦
			intNum1 = Integer.parseInt(strLineAry[0]);

			//２つ目は横
			intNum2 = Integer.parseInt(strLineAry[1]);

			//intNum1よりintNum2のほうが大きいなら
			if(intNum1 < intNum2) {

				//結果を出力
				System.out.println("a < b");

			//intNum1よりintNum2のほうが小さいなら
			}else if(intNum1 > intNum2) {

				//結果を出力
				System.out.println("a > b");

			//それ以外のintNum1とintNum2が同じなら
			}else {

				//結果を出力
				System.out.println("a == b");
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