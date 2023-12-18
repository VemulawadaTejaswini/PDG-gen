import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;

		try(Scanner scan = new Scanner(System.in)) {
			int div = a / b;
			int rem = a % b;
			float flo = a / b;

			System.out.println(div + " " + rem + " " + flo);
		}
	}
}