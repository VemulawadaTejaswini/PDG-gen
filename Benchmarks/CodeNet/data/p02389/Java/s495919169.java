import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(), b = scanner.nextInt();
		scanner.close();
		System.out.printf("%d %d", a*b, 2*(a+b));
		System.out.println();
	}

}
