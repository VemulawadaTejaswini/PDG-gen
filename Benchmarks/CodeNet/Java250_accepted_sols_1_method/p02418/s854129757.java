import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String q = in.next();

		int i;
		int ret = -1;
		for (i = 0; i < s.length(); i++) {
			if (s.indexOf(q) == -1) {
				s = s.substring(1, s.length()) + s.substring(0, 1);
			} else {
				ret = s.indexOf(q);
				break;
			}
		}
		if (ret == -1) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}