
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.nextLine();

			int result = 0;
			for (char c : s.toCharArray()) {
				if (c == '+') {
					result++;
				} else {
					result--;
				}
			}
			System.out.println(result);
		}
	}
}
