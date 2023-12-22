import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// 1-A 標準出力にHelloWorldと出力する
class Main {

	// プログラムのエントリポイント
	public static void main(String[] args) {

		//縦
		int intVertical = 0;

		//横
		int intHorizontal = 0;

		try{
			//キーボードからの入力準備
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			//キーボードからの入力をString型で受け取る
			String strLine = br.readLine();

			//文字列の分割:入力値を" "で分ける
			//分けた文字列はstrLineAry[0]とstrLineAry[1]に分けられる
			String[] strLineAry = strLine.split(" ");

			//入力値の１つ目は縦
			intVertical = Integer.parseInt(strLineAry[0]);

			//２つ目は横
			intHorizontal = Integer.parseInt(strLineAry[1]);

			//面積
			int intArea = intVertical * intHorizontal;

			//周
			int intZhou = (intVertical + intHorizontal) * 2;

			//結果を出力
			System.out.println(intArea + " " + intZhou);

		//例外処理
		}catch(IOException e) {

			//例外内容の表示
			System.out.println(e);
		}
	}
}