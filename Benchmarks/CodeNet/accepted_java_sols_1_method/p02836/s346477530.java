
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			char[] c = s.toCharArray();

			int result = 0;
			for (int i = 0; i < c.length / 2; i++) {
				if (c[i] != c[c.length - 1 - i]) {
					result++;
				}
			}
			System.out.println(result);
		}
	}
}
