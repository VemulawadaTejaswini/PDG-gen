import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int radius = 0;
		double pi = 3.141592653589;

		try(Scanner scan = new Scanner(System.in)) {
			radius = scan.nextInt();
			double area = (double)radius * (double)radius * pi;
			double len = ((double)radius * 2) * pi;
			String a = String.format("%.6f", area);
			String l = String.format("%.6f", len);

			System.out.println(a + " " + l);
		}
	}
}