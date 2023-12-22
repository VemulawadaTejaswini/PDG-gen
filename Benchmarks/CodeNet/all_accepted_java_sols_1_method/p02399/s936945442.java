import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] array = line.split(" ");
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);

		int d = a / b;
		int r = a % b;

		BigDecimal A = BigDecimal.valueOf(a);
		BigDecimal B = BigDecimal.valueOf(b);
		BigDecimal f = A.divide(B, 8, BigDecimal.ROUND_HALF_UP);

		System.out.println(d + " " + r + " " + f.toPlainString());
	}

}