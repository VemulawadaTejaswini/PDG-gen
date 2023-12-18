
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while (n-- > 0) {
			StringTokenizer tokenizer = new StringTokenizer(scanner.next(), ":");
			double h = Double.parseDouble(tokenizer.nextToken());
			double m = Double.parseDouble(tokenizer.nextToken());
			double a = (h * 5 + m / 12) * 6;
			double b = Math.abs(a - (m * 6)) % 180;
			if (b < 30)
				System.out.println("alert");
			else if (b < 90)
				System.out.println("warning");
			else
				System.out.println("safe");

		}
	}
}