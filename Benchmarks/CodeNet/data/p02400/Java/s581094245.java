import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextInt();
		double sum = Math.PI * Math.pow(r, 2);
		double length = 2 * Math.PI * r;
		System.out.println(sum + " " + length);
	}

}