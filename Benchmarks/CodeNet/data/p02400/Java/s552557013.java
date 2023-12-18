import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		double pi = 3.141592653;
		double r;
		Scanner scan = new Scanner(System.in);
		r = scan.nextInt();

		System.out.printf("%6f %6f",(pi*r*r),(2*pi*r));

	}
}