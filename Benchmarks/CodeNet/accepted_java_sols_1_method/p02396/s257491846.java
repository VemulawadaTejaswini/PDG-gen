/*
 * Lesson3B１つの整数 x を読み込み、それをそのまま出力するプログラム
 * x が 0 のとき入力の終わりを示し、このデータセットに対する出力を行ってはいけない
 * @author 前島佑介
 * @version 2014/12/2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 1-B １つの整数 x を読み込んで、x の３乗を計算し結果を出力するプログラム
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
			for(int i = 0; true; i++) {

				//1行読み込む
				strLine = insBR.readLine();

				//入力値を保存
				strArray.add(strLine);

				//読み込んだ文字列をint型へキャスト
				intNum  = Integer.parseInt(strLine);

				//入力値が0だったら
				if(intNum == 0) {

					//ループから抜ける
					break;
				}
			}

			//出力用にループさせる
			for(int i = 0; i < strArray.size() - 1; i++) {

				//出力
				System.out.println("Case " + (i+1) + ": " + strArray.get(i));
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