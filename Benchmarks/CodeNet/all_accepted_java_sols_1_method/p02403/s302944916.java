import java.util.Scanner;


//Print a Rectangle
//
//たてH cm よこ W cm の長方形を描くプログラムを作成して下さい。
//
//1 cm × 1cm の長方形を '#'で表します。
//Input
//
//入力は複数のデータセットから構成されています。各データセットの形式は以下のとおりです：
//
//H W
//
//H, W がともに 0 のとき、入力の終わりとします。
//Output
//
//各データセットについて、H × W 個の '#' で描かれた長方形を出力して下さい。
//
//各データセットの後に、１つの空行を入れて下さい。
//Constraints
//
//H, W ? 300
//Sample Input
//
//3 4
//5 6
//2 2
//0 0
//
//Sample Output
//
//####
//####
//####
//
//######
//######
//######
//######
//######
//
//##
//##


public class Main {
    public static void main(String[] args) {

    	/*Scanner = テキスト入力を扱うためのクラス
		 *キーボードからの入力を受けつける場合は
		 *System.inを使って下記のように記述
		 */
		Scanner scan = new Scanner(System.in);

		//forループ文用に変数準備
		int i;
		int j;

		/*while文で無限ループ設定
		 * if文でbreakをかける
		 * 求められている通りになったがコードが無駄に多いように思える
		 * 後程修正を行えるか試す
		 */

		while(true){
			int H = scan.nextInt();
			int W = scan.nextInt();
			if(H == 0 && W == 0 || H > 300 || W > 300)break;
			for(j = 0; j < H; j++){
				for(i = 0; i < W; i++){
					System.out.print("#");
				}
			System.out.println();
			}
			System.out.println();
		}
    }
}