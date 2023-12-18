import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int scanner1 = scanner.nextInt();
		int scanner2 = scanner.nextInt();
		int area = scanner1 * scanner2;
		int Surroundings = 2 * scanner1 + 2 * scanner2;
		System.out.println(area + " " + Surroundings);
	}
}