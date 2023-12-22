/*
 * ２つの整数 x, y を読み込み、それらを値が小さい順に出力するプログラム
 * @author 前島佑介
 * @version 2014/12/2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 3-C ２つの整数 x, y を読み込み、それらを値が小さい順に出力するプログラム
class Main {

	// プログラムのエントリポイント
	public static void main(String[] args) {

		try{
			//キーボードからの入力準備
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

			//入力値を格納する場所を初期化
			String strLine = "";

			//入力値をint型に置き換える場所を0以外で初期化
			int intNum = 1;

			//入力値をint型で保存する場所
			ArrayList<String> strArray = new ArrayList<String>();

			//入力値の取得にループさせる
			while(true) {

				//1行読み込む
				strLine = insBR.readLine();

				//「数字、スペース、数字」となっているStringデータで、２つの数字を昇順にする
				//もし数字が両方０ならnullが返ってくるメソッド
				strLine = NumSort(strLine);

				//入力値が0だったら
				if(strLine == null) {

					//ループから抜ける
					break;
				}

				//入力値を保存
				strArray.add(strLine);
			}

			//ループさせる
			for(int i = 0; i < strArray.size(); i++) {

				//出力
				System.out.println(strArray.get(i));
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

	/**
	 * 「数字、スペース、数字」となっているStringデータで、２つの数字を昇順にする
	 * もし数字が両方０ならnullが返ってくるメソッド
	 * @param strLine
	 * @return strReplacement
	 */
	public static String NumSort(String strLine) {

		//文字列の分割:入力値を" "で分ける
		//分けた文字列はstrLineAry[0]とstrLineAry[1]に分けられる
		String[] strLineAry = strLine.split(" ");


		//returnで返す値を引数で初期化
		String strReplacement = strLine;


		try{
			//大小の比較をするために、int型にキャスト
			int intNum1 = Integer.parseInt(strLineAry[0]);
			int intNum2 = Integer.parseInt(strLineAry[1]);

			//大小の比較で昇順にしたいので、降順なら
			if(intNum2 < intNum1) {

				//入れ替えした数字で文字列を作成
				strReplacement = strLineAry[1] + " " + strLineAry[0];
			}

			if(intNum1 == 0 && intNum2 == 0) {

				strReplacement = null;
			}
		//例外処理
		} catch(NumberFormatException e) {

			//例外時の出力
			System.out.println("数字で入力して下さいNumSort");


		}

		//問題なければ、引数がそのまま入っている。
		//降順だったら、昇順に並び替えられている
		//値が両方０ならnull
		return strReplacement;

	}
}