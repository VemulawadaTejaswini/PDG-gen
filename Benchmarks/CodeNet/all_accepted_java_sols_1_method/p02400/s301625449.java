import java.math.BigDecimal;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double r = scanner.nextDouble();
		
		System.out.println(BigDecimal.valueOf(Math.PI * r * r).toPlainString() + " " + BigDecimal.valueOf(2 * Math.PI * r).toPlainString());

	}

}

