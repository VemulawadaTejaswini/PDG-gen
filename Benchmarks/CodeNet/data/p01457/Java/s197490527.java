import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int all = scan.nextInt();
		int left = 0;
		int right = 0;
		for (int i = 0; i < all; i++) {
			int a = scan.nextInt();
			String p = scan.next();
			int num = scan.nextInt();
			if (p.equals("(")) {
				left += num;
			} else {
				right += num;
			}

			if (left == right) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}
		scan.close();

	}
}