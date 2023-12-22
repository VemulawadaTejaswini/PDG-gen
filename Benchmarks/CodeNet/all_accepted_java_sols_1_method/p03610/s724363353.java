
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		for (int i = 1; i <= s.length(); i++) {
			if (i % 2 != 0) {
				System.out.print(s.charAt(i - 1));
			}
		}
		in.close();
	}
}