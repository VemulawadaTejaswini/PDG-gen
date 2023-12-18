import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();

		String ans = "No";
		for (int i = 0; i < s.length(); i++) {
			s = s.substring(s.length() - 1) + s.substring(0, s.length() - 1);
			if (s.equals(t)) {
				ans = "Yes";
				break;
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
