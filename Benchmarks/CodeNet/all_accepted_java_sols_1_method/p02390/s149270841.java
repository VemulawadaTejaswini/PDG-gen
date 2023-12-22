import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1-D 標準出力にHelloWorldと出力する
class Main {

	// プログラムのエントリポイント
	public static void main(String[] args) {

		//1時間＝60分の60
		final int intMinute  = 60;

		//１分＝60秒の60
		final int intSecond = 60;

		//解答の時間を初期化
		int intAnswerHour = 0;

		//解答の分を初期化
		int intAnswerMinute = 0;

		//解答の秒を初期化
		int intAnswerSecond = 0;


		try{
			//キーボードからの入力準備
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			//キーボードからの入力値をString型で受け取る
			String strLine = br.readLine();

			//入力値を数字に直す
			int intLine = Integer.parseInt(strLine);

			//時間を計算
			//3600で割った整数
			intAnswerHour = intLine / (intMinute * intSecond);

			//分を計算
			//3600の剰余を60で割った整数
			intAnswerMinute = (intLine % (intMinute * intSecond)) / intSecond ;

			//秒を計算
			//60の剰余
			intAnswerSecond = intLine % intSecond;

			//結果を出力
			System.out.println(intAnswerHour + ":" + intAnswerMinute + ":" + intAnswerSecond);

		//例外処理
		}catch(IOException e) {

			//例外時の出力
			System.out.println(e);

		//数字以外の例外
		}catch(NumberFormatException e) {

			//数値以外の入力値で出力
			System.out.println("数値で入力して下さい");
		}
	}
}