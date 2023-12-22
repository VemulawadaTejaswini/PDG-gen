import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		sc.close();

		BigDecimal bd1 = new BigDecimal(a);
		BigDecimal bd2 = new BigDecimal(b);
		BigDecimal result = bd2.multiply(bd1);
		String ans = result.toString();
		int index = ans.indexOf(".");
		System.out.println(ans.substring(0,index));
	}
}
