import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt(), b = scanner.nextInt();
			int h = scanner.nextInt(), m = scanner.nextInt();
			double x1 = a * Math.sin((h * 60.0d + m) / 12.0d / 30.0d * Math.PI);
			double y1 = a * Math.cos((h * 60.0d + m) / 12.0d / 30.0d * Math.PI);
			double x2 = b * Math.sin(m / 30.d * Math.PI);
			double y2 = b * Math.cos(m / 30.d * Math.PI);
			System.out.println(Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)));
		}
	}
}
