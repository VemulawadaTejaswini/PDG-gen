import java.util.Scanner;

public class CubeCalculation {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		// Read Integer from standard input
		int number = stdin.nextInt();

		if (number >= 1 && number <= 100) {
			// calculate cube
			int result = number * number * number;
			// Write value to standard output
			System.out.println("Cube result: " + result);
		} else {
			System.out.println("Only can calculate between 1 and 100");
		}
	}
}