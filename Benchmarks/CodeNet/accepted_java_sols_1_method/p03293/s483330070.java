
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.nextLine();
			String t = sc.nextLine();

			for (int i = 0; i < s.length(); i++) {
				String tmp = s.substring(i, s.length()) + (0 < i ? s.substring(0, i) : "");

				if (tmp.equals(t)) {
					System.out.println("Yes");
					return;
				}
			}
			System.out.println("No");
		}
	}
}
