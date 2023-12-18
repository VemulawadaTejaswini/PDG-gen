import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		for (int i = 0; i < n; i++) {
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();

			if (a < b) {
				System.out.println(a);
			} else if (a % b == 0) {
				System.out.println(b);
			} else {
				System.out.println(a % b);
			}
		}
	}
}