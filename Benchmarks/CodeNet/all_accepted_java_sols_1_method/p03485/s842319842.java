import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double a = scan.nextInt();
		double b = scan.nextInt();

		double x = (a + b)/2;

		System.out.println(Math.round(x));
	}
}