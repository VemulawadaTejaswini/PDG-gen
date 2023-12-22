import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double pi = 3.141592653589;
		double r;
		Scanner scan = new Scanner(System.in);
		r = scan.nextDouble();

		System.out.printf("%6f %6f",(pi*r*r),(2*pi*r));

	}

}