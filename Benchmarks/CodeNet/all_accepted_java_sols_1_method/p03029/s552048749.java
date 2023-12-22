import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int P = scanner.nextInt();
		int x = 0;
		int y = 0;
		x = A * 3 + P;
		y = x / 2;
		System.out.println(y);
	}
}
