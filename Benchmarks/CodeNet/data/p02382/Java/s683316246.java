import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String input_n = ""; // 入力された次元数nを受け取る変数
		String input_X = ""; // 入力されたxの要素を受け取る変数
		String input_Y = ""; // 入力されたyの要素を受け取る変数
		int n = 0; // 次元数nをint型に変換して格納するための半数
		String[] X_String;// xの要素を配列で受け取るための変数
		String[] Y_String;// yの要素を配列で受け取るための変数
		int[] X_int; // X_Stringの要素を整数に変換して格納するための配列
		int[] Y_int;// Y_Stringの要素を整数に変換して格納するための配列
		double[] XY;// xiyiの距離を格納した配列
		double max = 0.0; // チェビシェフ距離における一時的なXY[i]の最大値
		double[] P_out = new double[4];// p=1、2、3、∞ のときの値を格納するための配列

		area: {
			input_n = sc.nextLine();
			n = Integer.parseInt(input_n);
			if (n < 1 || n > 100) {
				break area;

			}

			input_X = sc.nextLine();
			X_String = input_X.split(" ");

			input_Y = sc.nextLine();
			Y_String = input_Y.split(" ");

			if (X_String.length != n || Y_String.length != n) { // 入力されたXの要素とYの要素の数がそれぞれではない場合
				break area;
			}

			X_int = new int[n];
			Y_int = new int[n];
			XY = new double[n];

			for (int i = 0; i < n; i++) {
				X_int[i] = Integer.parseInt(X_String[i]);
				Y_int[i] = Integer.parseInt(Y_String[i]);

				// xiの値のチェック
				if (X_int[i] < 0 || X_int[i] > 1000) {
					break area;
				}

				// yiの値のチェック
				if (Y_int[i] < 0 || Y_int[i] > 1000) {
					break area;
				}

				XY[i] = Math.abs((double) X_int[i] - (double) Y_int[i]);
				P_out[0] += XY[i];
				P_out[1] += XY[i] * XY[i];
				P_out[2] += XY[i] * XY[i] * XY[i];

				if (i == 0) {
					max = XY[i];
				} else {
					if (max < XY[i]) {
						max = XY[i];
					}
				}// elseここまで
			}// for文ここまで

			// 始: p=1、2、3、∞ のときの値を求める

			// p=1は各XYiを足すだけでよいので処理する必要がないのでp=2、3、∞ のみの値を求める

			P_out[1] = Math.sqrt(P_out[1]);
			P_out[2] = Math.cbrt(P_out[2]);
			P_out[3] = max;

			// 終: p=1、2、3、∞ のときの値を求める

			for (int j = 0; j < P_out.length; j++) {
				System.out.printf("%.5f", P_out[j]);
				System.out.println();
			}

		}// area: ここまで

	}
}
