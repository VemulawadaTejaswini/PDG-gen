

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		BigDecimal a = BigDecimal.valueOf(scanner.nextLong());
		BigDecimal b = BigDecimal.valueOf(scanner.nextDouble());
		System.out.println(a.multiply(b).longValue());



		scanner.close();

	}

}
