import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String a = sc.next();
		String b = sc.next();
		String msg = null;

		if (a.length() > b.length()) {
			msg = "GREATER";
		} else if (a.length() < b.length()) {
			msg = "LESS";
		} else {
			msg = "EQUAL";
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) > b.charAt(i)) {
					msg = "GREATER";
					break;
				} else if (a.charAt(i) < b.charAt(i)) {
					msg = "LESS";
					break;
				}
			}

		}

		System.out.println(msg);
	}
}