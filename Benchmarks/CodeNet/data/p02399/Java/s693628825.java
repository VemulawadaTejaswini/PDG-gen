import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		int d = a / b;
		int r = a % b;
		BigDecimal da = new BigDecimal(a);
		BigDecimal db = new BigDecimal(b);
		BigDecimal f = da.divide(db, 5, BigDecimal.ROUND_HALF_UP);
		System.out.println(d + " " + r + " " + f);
	}
}