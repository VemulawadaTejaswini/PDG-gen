import java.text.MessageFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double S;
		double L;
		double h;
		S =( a * b *Math.sin(Math.toRadians(c)))/2;
		L = a + b + Math.sqrt(a * a + b * b - (2 * a * b * Math.cos(Math.toRadians(c))));
		h = b * Math.sin(Math.toRadians(c));
		System.out.println(MessageFormat.format("{0,number,0.00000000}",S));
		System.out.println(MessageFormat.format("{0,number,0.00000000}",L));
		System.out.println(MessageFormat.format("{0,number,0.00000000}",h));

	}
}
