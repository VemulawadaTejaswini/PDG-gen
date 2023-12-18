import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static String decode(String s, int r) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0 ; i < s.length() ; i++) {
			char c = s.charAt(i);
			if (c < 'a' || c > 'z') {
				sb.append(c);
			} else {
				sb.append((char) (((c-97-r)%26)+97));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String line = sc.nextLine();
			String[] decodees = new String[27];
			for (int r = 0 ; r < 27 ; r++) {
				String decoded = decode(line, r);
				if (decoded.contains("the") ||decoded.contains("this") || decoded.contains("that")) {
					System.out.println(decoded);
					break;
				}
			}









		}

	}
}