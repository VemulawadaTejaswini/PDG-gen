import java.util.Scanner;

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
		 */

		while(true){
			int H = scan.nextInt();
			int W = scan.nextInt();

		//Constraintsの条件も追加しました。
			if(H == 0 && W == 0 || H >= 300 || W >= 300)break;
			for(j = 0; j < H; j++){
				for(i = 0; i < W; i++){
					/*2つのfor文を組み合わせることで座標を指定するように出力が出来ている？（イメージ）
					 * 動かすことはできたがイメージレベルなので理解しなければならない
					 */
					if(i == W-1 || i == 0 || j == H-1 || j == 0){
						System.out.print("#");

					} else {
						System.out.print(".");
					}
				}
					System.out.println();
			}
				System.out.println();
		}
	}
}