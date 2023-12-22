import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int o = i; o <= s.length(); o++) {
				if (ans < ok(s.substring(i, o))) {
					ans = ok(s.substring(i, o));
				}
			}
		}
		System.out.println(ans);
	}

	static public int ok(String s) {
		char c[] = s.toCharArray();
		boolean ans = true;
		for (int i = 0; i < c.length; i++) {
			if (!(c[i] == 'A' || c[i] == 'C' || c[i] == 'G' || c[i] == 'T')) {
				ans = false;
			}
		}
		int a = 0;
		if (ans) {
			a = s.length();

		} else {
			a = 0;

		}
		return a;
	}
}