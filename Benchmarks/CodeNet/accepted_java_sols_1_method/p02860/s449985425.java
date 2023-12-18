
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			String s = sc.next();

			if (n % 2 != 0) {
				System.out.println("No");
				return;
			}

			String tmp1 = s.substring(0, n / 2);
			String tmp2 = s.substring(n / 2);
			if (tmp1.equals(tmp2)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
