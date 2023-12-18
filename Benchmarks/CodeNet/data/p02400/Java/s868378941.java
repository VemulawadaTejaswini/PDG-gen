import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		scanner.hasNext();

		float r = scanner.nextFloat();

		float circle = r * r * (float)3.14;

		float ans2 = 2 * (float)3.14 * r;

		String circleAreaAns = String.format("%.6f", circle);

		String lengthCircumference = String.format("%.6f", ans2);

		System.out.print(circleAreaAns + " ");

		System.out.println(lengthCircumference);

	}
}