import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();

		double x = Math.abs(x1 - x2);
		double y = Math.abs(y1 - y2);

		double distance = Math.sqrt(x * x + y * y);

System.out.printf("%.5f", distance);


	}
}
