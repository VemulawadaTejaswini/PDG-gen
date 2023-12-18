
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int x = scanner.nextInt();
		scanner.close();
		if (a > x) {
			System.out.println("NO");
			System.exit(0);
		}
		if (a + b >= x) {
			System.out.println("YES");
			System.exit(0);
		}
		System.out.println("NO");
		
	}
}
