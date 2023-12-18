/**
 * ３つの整数を読み込み、それらを値が小さい順に並べて出力するプログラム
 * @author 前島佑介
 *@version 2014/12/1
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// 2-C ３つの整数を読み込み、それらを値が小さい順に並べて出力するプログラム
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

			//入れ替えする為の場所
			int intChange = 0;

			//intNum1よりintNum2のほうが小さいなら
			//intNum1とintNum2を入れ替える
			if(intNum1 > intNum2) {
				intChange = intNum1;
				intNum1 = intNum2;
				intNum2 = intChange;
			}

			//intNum2よりintNum3のほうが小さいなら
			//intNum1とintNum2を入れ替える
			if(intNum2 > intNum3) {
				intChange = intNum2;
				intNum2 = intNum3;
				intNum3 = intChange;
			}

			//intNum1よりintNum2のほうが小さいなら
			//intNum1とintNum2を入れ替える
			if(intNum1 > intNum2) {
				intChange = intNum1;
				intNum1 = intNum2;
				intNum2 = intChange;
			}

			//結果を出力
			System.out.println(intNum1 + " " + intNum2 + " " + intNum3);

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