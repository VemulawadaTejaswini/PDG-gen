import java.util.Scanner;

public class Main {
	public static void main(String[] arg){

		/*Scanner = テキスト入力を扱うためのクラス
		 *キーボードからの入力を受けつける場合は
		 *System.inを使って下記のように記述
		 */
		Scanner scan = new Scanner(System.in);

		//Caseナンバーを指定するための前準備
		int i = 1;

		/*while(true)で無限ループをセット
		 *int x = scan.nextInt(); xに値を入れてる
		 *そして一回ずつ表示させ0の時にbreakさせてる。
		 */
		while(true){
		int x = scan.nextInt();
		if ( x == 0 ) break;

		//最後は表示させる。あとCaseナンバーの加算をしてます。
		System.out.println("Case" + " " + i + ":" + " " + x);
		i = i+1;
		}



	}
}