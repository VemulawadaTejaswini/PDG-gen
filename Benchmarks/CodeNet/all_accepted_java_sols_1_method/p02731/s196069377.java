import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double l=sc.nextDouble();

		BigDecimal volume = new BigDecimal(Math.pow(l/3, 3));

		System.out.println(volume);
	}
}