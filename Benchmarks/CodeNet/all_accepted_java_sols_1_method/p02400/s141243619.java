import java.math.BigDecimal;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		scan.close();
		double ans1 = r * r * Math.PI;
		double ans2 = 2 * r * Math.PI;
		System.out.println(BigDecimal.valueOf(ans1).toPlainString()
				+ " " + BigDecimal.valueOf(ans2).toPlainString());
	}
}
