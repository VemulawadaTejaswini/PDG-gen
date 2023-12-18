import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int L = scan.nextInt();

		BigDecimal a = new BigDecimal(String.valueOf(L));
		BigDecimal div = new BigDecimal("3.0");
		a = a.divide(div, 7, RoundingMode.DOWN);
		
		BigDecimal length = new BigDecimal(String.valueOf(a));
		BigDecimal ans = length.multiply(length);
		ans = ans.multiply(length);
		
		System.out.print(ans);
	}

}
