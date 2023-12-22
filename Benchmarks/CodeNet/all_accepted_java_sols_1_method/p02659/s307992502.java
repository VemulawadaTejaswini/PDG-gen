import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigDecimal a = new BigDecimal(sc.next());
		BigDecimal b = new BigDecimal(sc.next());

		BigDecimal result = a.multiply(b);
		result =  result.setScale(0, BigDecimal.ROUND_DOWN);

		System.out.println(result);

	}

}