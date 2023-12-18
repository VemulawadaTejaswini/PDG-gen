import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		scanner.hasNext();

		double r = scanner.nextDouble();

		double circle = r * r * Math.PI;

		double ans2 = 2 * Math.PI * r;

		String circleAreaAns = String.format("%.6f", circle);

		String lengthCircumference = String.format("%.6f", ans2);

		System.out.print(circleAreaAns + " ");

		System.out.println(lengthCircumference);

	}
}