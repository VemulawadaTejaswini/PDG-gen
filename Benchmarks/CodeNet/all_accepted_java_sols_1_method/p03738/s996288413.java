import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String A = sc.next();
		String B = sc.next();
		String ans = "";

		if (A.length() < B.length()) {
			ans = "LESS";
		} else if (A.length() > B.length()) {
			ans = "GREATER";
		} else {
			for (int i = 0; i < A.length(); i++) {
				if (A.charAt(i) > B.charAt(i)) {
					ans = "GREATER";
					break;
				} else if (A.charAt(i) < B.charAt(i)) {
					ans = "LESS";
					break;
				} else {
					ans = "EQUAL";
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
