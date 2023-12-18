/**
1 から n までの数の中から、重複無しで３つの数を選びそれらの合計が x となる組み合わせの数を求めるプログラムを作成して下さい。

例えば、1 から 5 までの数から３つを選んでそれらの合計が 9 となる組み合わせは、
?1 + 3 + 5 = 9
?2 + 3 + 4 = 9

の２通りがあります。

 */

/*sucannerクラス使うためにインポート*/
import java.util.Scanner;

class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成
		Scanner sc = new Scanner(System.in);
		// 点数を受け取る変数を宣言
		int intN = 0;
		int intX = 0;
		int intKekka = 0;

		// breakされるまで処理をくりかえす
		while (true) {

			// 数字を二つ受け取る
			intN = sc.nextInt();
			intX = sc.nextInt();
			//結果を表示する変数
			intKekka = 0;
			//二つの数値が０だった場合処理を狩猟する
			if (intN == 0 && intX == 0) {
				break;
			}

			//受け取った数字N*N*N回処理を実行する
			for (int i = 1; i <= intN; i++) {
				for (int j = 1; j <= intN; j++) {
					for (int k = 1; k <= intN; k++) {
						//ijkが同じ数字だったときなにもしない
						if(i == j || j == k || i == k){
						//Nの数字を３つ足していって合計がXだった場合結果に１プラスする。
						}else if ( i + j + k == intX){
							intKekka ++;
							}
						}
					}
				}
			//1*2*3　３つの数字を並びかえて同じ結果を６つ表示できるので なので６で割って結果表示
			System.out.println(intKekka/6);
			}

		}
	}