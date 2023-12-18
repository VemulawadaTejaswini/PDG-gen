// 半径 r の円の面積と円周の長さを求めるプログラムを作成して下さい。
import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		double r = Double.parseDouble(str);
		double area = r * r * Math.PI;
		double circle = 2 * r * Math.PI;
		System.out.println(BigDecimal.valueOf(area).toPlainString() + " " + BigDecimal.valueOf(circle).toPlainString());
	}
}
