import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int radius = scanner.nextInt();

		double circle = radius * 2 * 3.14;
		//double circle = radius * 2 * Math.PI;

		System.out.println(circle);

		scanner.close();
	}

}
