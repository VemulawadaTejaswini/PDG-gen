import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//キーボード入力メソッド
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int d = 0;
		int r = 0;
		double f = 0;
		double double_a = a;
		double double_b = b;

		//処理
		d = a / b;
		r = a % b;
		f = double_a / double_b;

		//fの小数点以下の桁数を指定(5桁)
		BigDecimal x = new BigDecimal(f);
		x = x.setScale(5, BigDecimal.ROUND_HALF_UP);

		//出力
		System.out.println( d + " " + r + " " + x );
		//System.out.print(d + " " + r + " ");
		//System.out.printf("%f\n",f);

	}

}

