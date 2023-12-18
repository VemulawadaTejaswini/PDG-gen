
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String c1 = sc.next();
			StringBuilder c2 = new StringBuilder(sc.next());

			if (c1.equals(c2.reverse().toString())) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
	}
}
