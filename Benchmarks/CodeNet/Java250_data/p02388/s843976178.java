import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1-A 標準出力にHelloWorldと出力する
class Main {

	// プログラムのエントリポイント
	public static void main(String[] args) {

		//階乗を宣言
		final int intFactorial = 3;

		//答えの格納場所
		int intAnswer = 1;

		try{
			//キーボードからの入力準備
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			//キーボードからの入力をString型で受け取る
			String strLine = br.readLine();

			//入力値をint型にする
			int intLine = Integer.parseInt(strLine);

			//階乗の回数だけ回す
			for(int i = 0; i < intFactorial; i++) {

				//入力値を掛ける
				intAnswer = intAnswer * intLine;
			}

			//結果を出力
			System.out.println(intAnswer);

		//例外処理
		}catch(IOException e) {

			//例外内容の表示
			System.out.println(e);
		}

	}

}