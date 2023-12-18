
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b;
		int c, d;
		double e;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		c = a / b;
		d = a % b;
		e = (double) a / b;

		System.out.printf("%d %d %.5f\n", c, d, e);

	}

}

