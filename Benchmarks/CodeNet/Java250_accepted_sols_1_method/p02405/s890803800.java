import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
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
		 */

		while(true){
			int H = scan.nextInt();
			int W = scan.nextInt();

		//Constraintsの条件も追加しました。
			if(H == 0 && W == 0 || H >= 300 || W >= 300)break;
			for(j = 0; j < H; j++){
				for(i = 0; i < W; i++){

					/*奇数偶数の条件分岐をさせている。
					 * 大元を大きいif関数でくくる。
					 */

					if(i%2==0){

						//iを2で割って余りが0(偶数行)の場合の表示
						if(j%2==0) System.out.print("#");
						else System.out.print(".");

					}
					else {

						//iを2で割って余りが0でない(奇数行)の場合の表示
						if(j%2==0) System.out.print(".");
	                    else System.out.print("#");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}