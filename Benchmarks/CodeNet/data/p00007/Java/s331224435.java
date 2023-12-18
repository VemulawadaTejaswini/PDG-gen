import java.util.Scanner;
import java.math.BigDecimal;

class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		double n = (100000 + ((100000 * 0.05) * scan.nextInt())) / 10000;
		System.out.println((BigDecimal.valueOf(n).setScale(0, BigDecimal.ROUND_UP).intValue()) * 10000);
	}
}