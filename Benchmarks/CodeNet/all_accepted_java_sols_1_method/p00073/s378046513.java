import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			double x = sc.nextDouble();
			double h = sc.nextDouble();
			if (x == 0 && h == 0)
				break;
			double a = Math.sqrt(h * h + (x / 2) * (x / 2));
			System.out.println((x * x + 2 * a * x));
		}
	}
}