import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt(), a = scanner.nextInt(), b = scanner.nextInt();
		int y = (x - a) / b;
		int result = x - ((a * 1) + (b * y));
		System.out.println(result);
	}

}
