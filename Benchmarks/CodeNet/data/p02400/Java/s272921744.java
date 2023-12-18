import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double radius = 0.0;

		try(Scanner scan = new Scanner(System.in)) {
			radius = scan.nextInt();
			double area = radius * radius * 3.141592653589;
			double len = (radius * 2) * 3.141592653589;
			String a = String.format("%.6f", area);
			String l = String.format("%.6f", len);

			System.out.println(a + " " + l);
		}
	}
}