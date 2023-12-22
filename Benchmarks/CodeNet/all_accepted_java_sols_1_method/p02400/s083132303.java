import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		double sum = Math.PI * Math.pow(r, 2);
		double length = 2 * Math.PI * r;
		System.out.println(BigDecimal.valueOf(sum).toPlainString() + " " + BigDecimal.valueOf(length).toPlainString());
	}

}