

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 初期処理
		Scanner sc = null;

		// テキスト入力クラス
		sc = new Scanner(System.in);

		// 入力値をfloatで取る
		Double first = sc.nextDouble();
		Double second = sc.nextDouble();
		DecimalFormat df2 = new DecimalFormat("##########.##########");

		// 求める値
		Double quotient = first / second;
		Double product = first % second;
		
		// 元データをBigDecimal型にする
		BigDecimal quo = new BigDecimal(quotient);
		BigDecimal pro = new BigDecimal(product);
		
		quotient = (Double)first / second;

		// 出力
		System.out.println(quo.setScale(0,BigDecimal.ROUND_DOWN) + " " + pro.setScale(0,BigDecimal.ROUND_DOWN)
				+ " " + df2.format(quo.setScale(8,BigDecimal.ROUND_DOWN)));

	}
}