
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.nextLine();
			long k = sc.nextLong();

			for (char c : s.toCharArray()) {
				if (c == '1') {
					k--;
				} else {
					System.out.println(c);
					return;
				}
				if (k <= 0) {
					System.out.println(c);
					return;
				}
			}
		}
	}
}
