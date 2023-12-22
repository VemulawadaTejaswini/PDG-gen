import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		double l=sc.nextDouble();
		BigDecimal side1 = new BigDecimal(l/3);
		BigDecimal side2 = new BigDecimal(l/3);
		BigDecimal side3 = new BigDecimal(l/3);
		System.out.println(side1.multiply(side2).multiply(side3));
	}
}