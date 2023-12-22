import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 * Lesson4C　２つの整数 a, b と１つの演算子 op を読み込んで、a op b を計算するプログラム
 * ただし、演算子 op は、"+"(和)、"-"(差)、"*"(積)、"/"(商)、のみとし、
 * 割り算で割り切れない場合は、小数点以下を切り捨てたものを計算結果とします。
 * @author 前島佑介
 * @version 2014/12/1
 */
class Main {

	// プログラムのエントリポイント
	public static void main(String[] args) {

		//入力値1つ目
		int intNum1 = 0;

		//入力値3つ目
		int intNum3 = 0;

		//答えを初期化
		int intAnswer = 0;

		try{
			//キーボードからの入力準備
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			//入力値を保存する場所
			ArrayList<Integer> strArray = new ArrayList<Integer>();

			//キーボードからの入力をString型で受け取る初期化
			String strLine = "";

			while(true) {
				//キーボードからの入力をString型で受け取る
				strLine = br.readLine();

				//文字列の分割:入力値を" "で分ける
				//分けた文字列はstrLineAry[0]とstrLineAry[1]とstrLineAry[2]に分けられる
				String[] strLineAry = strLine.split(" ");


				//入力値の１つ目の値
				intNum1 = Integer.parseInt(strLineAry[0]);

				//２つ目の値
				intNum3 = Integer.parseInt(strLineAry[2]);

				//足し算
				if(strLineAry[1].equals("+")) {
					intAnswer = intNum1 + intNum3;

				//引き算
				}else if(strLineAry[1].equals("-")) {
					intAnswer = intNum1 - intNum3;

				//掛け算
				}else if(strLineAry[1].equals("*")) {
					intAnswer = intNum1 * intNum3;

				//割り算
				}else if(strLineAry[1].equals("/")) {
					intAnswer = intNum1 / intNum3;

				//終了条件
				}else if(strLineAry[1].equals("?")) {
					break;

				//想定外文字のエラー
				}else {
					System.out.println("err");
				}

				//結果を格納
				strArray.add(intAnswer);
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
}