import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if ((a + b + c) == 17) {
			if ((a == 7) && (b == 5) && (c == 5)) {
				System.out.println("YES");
			}	else if ((a == 5) && (b == 7) && (c == 5)) {
				System.out.println("YES");
			}	else if ((a == 5) && (b == 5) && (c == 7)) {
				System.out.println("YES");
			}	else {
				System.out.println("NO");
			}
		}	else {
			System.out.println("NO");
		}
	}
}