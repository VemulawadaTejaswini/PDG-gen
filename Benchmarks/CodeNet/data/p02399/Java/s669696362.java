import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		// 初期処理
		Scanner sc = null;

		// テキスト入力クラス
		sc = new Scanner(System.in);

		//
		int first = sc.nextInt();
		int second = sc.nextInt();

		// 求める値
		int quotient = first / second;
		int product = first % second;

		// 浮動小数点
		// 浮動小数点
		float double_first = (float) first;
		float double_second = (float) second;
		float double_quotient = double_first / double_second;

		// 出力
		System.out.println(quotient+ " " + product + " " + double_quotient);

	}

}