import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// 返済期間
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int week = Integer.parseInt(br.readLine());
		// 負債額
		int debt = 100000;
		// 利率
		double rate = 1.05;
		// 切り上げ単位
		int roundUp = 1000;

		// 負債額を切り上げ単位で割った値で計算する。（ 1,000 円未満切り上げのため）
		int debt_k = debt / roundUp;

		for (int i = 0; i < week; i++) {
			debt_k = (int) (Math.ceil(debt_k * rate));
		}

		// 出力
		// 切り上げ単位で割っていた値を元に戻す。
		System.out.println(debt_k * roundUp);
	}
}