import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		long value1 = scan.nextLong();
		double value2 = scan.nextDouble();
		double sum = value1 * value2;
		BigDecimal sum_bd = new BigDecimal(String.valueOf(sum));

		BigDecimal result = sum_bd.setScale(0, RoundingMode.DOWN);
		scan.close();
		System.out.println(result);
	}
}