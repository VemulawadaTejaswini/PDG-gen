import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();
		int sl = s.length();
		int tl = t.length();
		String msg = "No";

		for (int i = 0; i < sl; i++) {
			if (s.equals(t)) {
				msg = "Yes";
				break;
			} else {
				t = t.substring(1, tl) + t.substring(0, 1);
			}
//			System.out.println(t);
		}

		System.out.println(msg);

	}
}