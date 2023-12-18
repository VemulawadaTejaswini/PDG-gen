import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double pi = 3.141592653;
		double r;
		Scanner scan = new Scanner(System.in);
		r = scan.nextInt();

		System.out.printf("%6f %6f",(2*pi*r),(pi*r*r));

	}
}