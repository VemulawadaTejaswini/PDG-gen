
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();

			StringBuilder sb = new StringBuilder();
			sb.append(s.charAt(0));
			sb.append(s.length() - 2);
			sb.append(s.charAt(s.length() - 1));
			System.out.println(sb);
		}
	}
}
