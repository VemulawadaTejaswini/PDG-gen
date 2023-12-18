import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double value = scanner.nextDouble();
		double result = Math.pow(value, 3.0);

		System.out.println((int)result);
	}
}