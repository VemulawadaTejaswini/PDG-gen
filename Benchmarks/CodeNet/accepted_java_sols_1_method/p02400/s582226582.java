import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		double r = Double.parseDouble(line);

		double a = (double) (r * r * Math.PI);
		double b = (double) (r * 2 * Math.PI);

		System.out.printf("%5f", a);
		System.out.print(" ");
		System.out.printf("%5f", b);

	}

}

