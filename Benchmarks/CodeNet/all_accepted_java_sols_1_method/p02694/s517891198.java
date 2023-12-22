import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal X = new BigDecimal(sc.next());
		BigDecimal Y = new BigDecimal("100");
		BigDecimal y = new BigDecimal("1.01");
		int count = 0;
		while (Y.compareTo(X) == -1) {
			Y = Y.multiply(y).setScale(0, RoundingMode.DOWN);
			count++;
		}
		System.out.println(count);
	}

}
