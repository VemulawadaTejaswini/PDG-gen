import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			int a = scan.nextInt();
			int b = scan.nextInt();

			int div = a / b;
			int rem = a % b;
			double flo = a / b;

			System.out.println(div + " " + rem + " " + flo);
		}
	}
}