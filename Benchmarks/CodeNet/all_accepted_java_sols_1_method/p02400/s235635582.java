import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();
		double p = 3.14159265359;

		System.out.println(String.format("%.6f", r * r * p) + " " + String.format("%.6f", 2 * r * p));

	}

}

