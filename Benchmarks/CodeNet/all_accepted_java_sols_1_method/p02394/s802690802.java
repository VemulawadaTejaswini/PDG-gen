/**
 * 長方形の中に円が含まれるかを判定するプログラムを作成してください。
 * 次のように、長方形は左下の頂点を原点とし、右上の頂点の座標 (W,H)  が与えられます。
 * また、円はその中心の座標 (x,y)  と半径 r  で与えられます
 * −100?x,y?100
 * 0<W,H,r?100

 * @author 前島佑介
 *@version 2014/12/1
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// 2-D 長方形の中に円が含まれるかを判定するプログラムを作成してください。
class Main {

	// プログラムのエントリポイント
	public static void main(String[] args) {


		//右上の頂点の座標(W,H)のW
		int intW = 0;

		//右上の頂点の座標(W,H)のH
		int intH = 0;

		//円の中心の座標(x,y)のx
		int intX = 0;

		//円の中心の座標(x,y)のx
		int intY = 0;

		//半径ｒ
		int intR =0;

		try{
			//キーボードからの入力準備
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			//キーボードからの入力をString型で受け取る
			String strLine = br.readLine();

			//文字列の分割:入力値を" "で分ける
			//分けた文字列はstrLineAry[0]とstrLineAry[1]と?に分けられる
			String[] strLineAry = strLine.split(" ");

			//入力値の１つ目の値
			intW = Integer.parseInt(strLineAry[0]);

			//２つ目の値
			intH = Integer.parseInt(strLineAry[1]);

			//３つ目の値
			intX = Integer.parseInt(strLineAry[2]);

			//４つ目の値
			intY = Integer.parseInt(strLineAry[3]);

			//５つ目の値
			intR = Integer.parseInt(strLineAry[4]);

			//前提条件−100?x,y?100,0<W,r?100
			if(-100 <= intX || intY < 100 || 0 < intW || intR <= 100) {
				//問題なし
			} else {
				//上記でない場合はエラー出力
				System.out.println("−100?x,y?100,0<W,r?100です");
			}

			//x+r?W 円が右へはみ出さない条件
			if((intX + intR) <= intW &&

			//0?x-r 円が左へはみ出さない条件
			0 <= (intX -intR) &&

			//y+r?H 円が上へはみ出さない条件
			(intY + intR) <= intH &&

			//0?y-r 円が下へはみ出さない条件
			0 <= (intY - intR) ) {

				//上記は問題なし
				System.out.println("Yes");
			} else 	{

				//上記以外なら
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