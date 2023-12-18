import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		//スキャナークラスを宣言
		Scanner scan = new Scanner(System.in);

		//フォーマットの指定
		DecimalFormat df = new DecimalFormat("#.#");

		//桁数を指定
		df.setMinimumFractionDigits(6);
		df.setMaximumFractionDigits(6);

		//int型の変数を宣言、入力した内容を代入
		int intNum1 = scan.nextInt();
		int intNum2 = scan.nextInt();
		//商
		int intQuotient = intNum1 / intNum2;
		double dbQuotient = (double)intNum1 / intNum2;
		//余り
		int intDiv = intNum1 % intNum2;

		BigDecimal number = new BigDecimal(dbQuotient);

		//商(整数)・余り・浮動点小数を出力
		System.out.println(intQuotient + " " +
							intDiv + " " + df.format(number));
		scan.close();
	}
}
