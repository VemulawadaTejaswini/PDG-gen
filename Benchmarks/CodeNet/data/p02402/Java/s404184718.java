/** ２つの整数 a, b と１つの演算子 op を読み込んで、a op b を計算するプログラムを作成して下さい。
 * ただし、演算子 op は、"+"(和)、"-"(差)、"*"(積)、"/"(商)、のみとし、
 * 割り算で割り切れない場合は、小数点以下を切り捨てたものを計算結果とします。
 */

/*sucannerクラス使うためにインポート*/
import java.util.Scanner;

class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成
		Scanner sc = new Scanner(System.in);
		int intmax = 0;
		int intmin = 0;
		int intsum = 0;
		int inthakosuu = sc.nextInt();
		int[] hako;
		hako = new int[inthakosuu];

		if(hako[0] > 0){
            intmin = hako[0];
            intmax = hako[0];

		for (int i = 0; i < inthakosuu; i++) {
			hako[i] = sc.nextInt();

			if (intmin > hako[i]) {
				intmin = hako[i];
			} else if (intmax < hako[i]) {
				intmax = hako[i];
			}
			intsum += hako[i];
		}
		System.out.println(intmin + " " + intmax + " " + intsum);
		}
	}
}