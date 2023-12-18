import java.util.Scanner;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double a = scan.nextInt();
		double b = scan.nextInt();
		double rad = scan.nextInt();
		double c2;
		double cos_c = Math.cos(Math.toRadians(rad));
		c2 = a * a + b * b - 2 * a * b * cos_c;
		double c = Math.sqrt(c2);
		double sin_c = Math.sin(Math.toRadians(rad));
		double S = c / (2 * sin_c);
		double L = a + b + c;
		double h = 2 * S / a;
		System.out.println(S+" "+L+" "+h);
	}
}


		

	