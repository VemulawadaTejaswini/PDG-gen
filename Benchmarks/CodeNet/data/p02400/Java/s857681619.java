import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();

		System.out.println(BigDecimal.valueOf(r*r*Math.PI).toPlainString() + " "
		+ BigDecimal.valueOf(2*Math.PI*r).toPlainString());

	}

}

