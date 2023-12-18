/** 与えられた数列を逆順に出力するプログラムを作成して下さい。  */

/*sucannerクラス使うためにインポート*/
import java.util.Scanner;

class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成
		Scanner sc = new Scanner(System.in);
		// 処理を繰り返す
		// 数字を受け取る
		int inti = sc.nextInt();
		//配列の宣言
		int[] array;
		//変数の宣言
		int i = 0;
		//受け取った数字の数配列をつくる
		array = new int[inti];
		//受け取った数だけ動作を繰り返す
		for (i = 0; i < inti; i++) {
			//受け取った数字を配列に入れる
			array[i] = sc.nextInt();
			// test System.out.print(array[i]);
		}
		//配列の数が0番になるまで繰り返す
		for (; i > 0; i--) {
			//結果表示
			System.out.print(array[i - 1]);
			if (i - 1 != 0){
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}