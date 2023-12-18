import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

    	/*Scanner = テキスト入力を扱うためのクラス
		 *キーボードからの入力を受けつける場合は
		 *System.inを使って下記のように記述
		 */
		Scanner scan = new Scanner(System.in);

		//入れ替えた値を一時保管する箱
		int wx;


		/*while(true)で無限ループをセット
		 *int x = scan.nextInt(); xに値を入れてる(今回2つを入力させるので用意させるのも2つ)
		 *そして一回ずつ表示させ0の時にbreakさせてる。
		 */
		while(true){
		int x = scan.nextInt();
		int y = scan.nextInt();
		if ( x == 0 && y == 0 ) break;
		if(x > y){ wx = y; y = x; x = wx;}

		//最後は表示させる。あとCaseナンバーの加算をしてます。
		System.out.println(x + " " + y);
		}

    }
}