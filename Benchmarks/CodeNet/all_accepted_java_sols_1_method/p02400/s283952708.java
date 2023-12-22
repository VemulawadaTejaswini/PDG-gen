import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double radius = 0.0;
		double pi = 3.141592653589;

		try(Scanner scan = new Scanner(System.in)) {
			radius = scan.nextDouble();
			double area = radius * radius * pi;
			double len = (radius * 2) * pi;
			String a = String.format("%.6f", area);
			String l = String.format("%.6f", len);

			System.out.println(a + " " + l);
		}
	}
}