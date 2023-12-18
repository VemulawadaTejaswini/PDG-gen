import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Lesson5D　goto 文は、C/C++言語などで使うことのできる文で、実行されると無条件に指定されたラベルに処理が飛びます。例えば goto CHECK_NUM; という文が実行されると、プログラムの中で CHECK_NUM: と書かれた行に処理が移ります。この機能を使って、繰り返し処理なども実現することができます。

一方、goto 文は自由度が高すぎ、プログラムの可読性に影響するため、可能な限り使わないことが推奨されています。

次のC++言語のプログラムと同じ動作をするプログラムを作成してください。ただし、goto 文は使わないで実装してみましょう。
void call(int n){
  int i = 1;
 CHECK_NUM:
  int x = i;
  if ( x % 3 == 0 ){
    cout << " " << i;
    goto END_CHECK_NUM;
  }
 INCLUDE3:
  if ( x % 10 == 3 ){
    cout << " " << i;
    goto END_CHECK_NUM;
  }
  x /= 10;
  if ( x ) goto INCLUDE3;
 END_CHECK_NUM:
  if ( ++i <= n ) goto CHECK_NUM;

  cout << endl;
}




 * @author 前島佑介
 * @version 2014/12/1
 */
class Main {

	/**
	 * プログラムのエントリポイント
	 * @param args
	 */
	public static void main(String[] args) {

		int intNum = 0;

		//入力値を１つ受け取る
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

			String strLine = insBR.readLine();

			//入力値　Stringをint型にキャスト
			intNum = Integer.parseInt(strLine);

		}catch(IOException e) {

			System.out.println(e);
		}catch(NumberFormatException e) {

			System.out.println("数値で入力して下さい");
		}


		//答えの格納場所の初期化
		ArrayList<Integer>intArray = new ArrayList<Integer>();

		//3倍数と一桁目が3を表示する
		//問題と同じcallを使う
		call(intNum, intArray);

		//出力用にループさせる
		for(int i = 0; i < intArray.size(); i++) {

			//出力
			System.out.print(intArray.get(i) + " ");
		}


	}

	/**
	 * 3倍数と一桁目が3を表示する
	 * @param intNum
	 */
	public static void call(int intNum,ArrayList<Integer> intArray) {

		//3倍数と一桁目が３を探してintArrayにいれる
		for(int i = 3; i <= intNum; i++) {

			if(i % 3 == 0 || i % 10 == 3) {
				intArray.add(i);
			}
		}
	}
}