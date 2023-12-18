
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			int result = 0;
			int count = 0;

			for (char c : s.toCharArray()) {
				if (c == 'R') {
					count++;
				} else {
					count = 0;
				}
				if (result < count) {
					result = count;
				}
			}
			System.out.println(result);
		}
	}
}
