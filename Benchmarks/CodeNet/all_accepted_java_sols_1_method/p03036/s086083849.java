import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		int d = scanner.nextInt();
		int x2000 = scanner.nextInt();
		
		int x = x2000;
		for (int i = 1; i <= 10; i++) {
			x = ( r * x ) - d;
			System.out.println(x);
		}
	}
}
