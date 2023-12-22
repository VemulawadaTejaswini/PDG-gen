/** ２たてH cm よこ W cm の長方形を描くプログラムを作成して下さい。
*1 cm × 1cm の長方形を '#'で表します。
*/

/*sucannerクラス使うためにインポート*/
import java.util.Scanner;

class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成
		Scanner sc = new Scanner(System.in);
		//処理を繰り返す
		while (true){
			//２つの数字を受け取る
			 int intH = sc.nextInt();
			 int intW = sc.nextInt();
			 //受け取った数字が二つとも０の場合処理を終了する
			if(intH == 0 && intW == 0){
				break;
			}

			//受け取った縦の数字の回数改行する
			for (int i = 0; i < intH ; i++){
				//受けとった横の数字の個数分＃を表示する
				for ( int j = 0; j < intW ; j++){
					System.out.print("#");
				}
				System.out.println("");
			}
			//表示完了後改行する。
			System.out.println("");
		}
	}
}