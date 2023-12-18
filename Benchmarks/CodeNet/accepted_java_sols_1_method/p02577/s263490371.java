
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();

			long tmp = 0;
			for (char c : s.toCharArray()) {
				tmp += (c - '0');
			}

			if (tmp % 9 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
