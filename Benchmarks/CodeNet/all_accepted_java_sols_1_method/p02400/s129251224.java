import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		System.out.printf("%.10f ", x * x * Math.PI);
		System.out.println(2 * x * Math.PI);
	}
}
