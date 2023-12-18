import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();
		
		BigDecimal result = BigDecimal.valueOf(a).multiply(BigDecimal.valueOf(b));
		System.out.println(result.longValue());
	}

}
