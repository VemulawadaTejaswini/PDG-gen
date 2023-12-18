import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			//渡される定数
			String[] number = (input.readLine()).split("\\s");//入力数値をスペース前後で分割
			int n = Integer.parseInt(number[0]);//1からn番目(前)
			int x = Integer.parseInt(number[1]);//合計値x(後)

			if (n == 0 && x == 0) {//両方0の時抜ける
				break;
			}

			int count = 0;//組み合わせのが何種類かあるかの初期化
			int s = x / 3;//合計の1/3未満の数(超えると計算できないため)
			for (int i = 1; i < s; i++) {//要素数1 一番小さい数

				int m = (x - i) / 2;//合計から最小を引いた半分の数(超えると計算できないため)
				for (int j = i + 1; j <= m; j++) {//要素数2 jは確定でiより大きい

					int k = x - i - j;//最大値k　sとmは上限なので実数値はiとj

					if (j < k && k <= n) {//kはjより大きくなければならない

						count++;//上記が達成時に種類が増えるので追加

						//for (int k = 0; k <= n; k++) {//要素数3　一番大きい数
					}
				}
			}
			System.out.println(count);

		}
	}
}

