import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double r = s.nextDouble();
		s.close();
		String a1 = new BigDecimal(Math.PI*r*r).toPlainString();
		String a2 = new BigDecimal(Math.PI*r*2).toPlainString();
		System.out.println(a1 + " " + a2);
	}

}