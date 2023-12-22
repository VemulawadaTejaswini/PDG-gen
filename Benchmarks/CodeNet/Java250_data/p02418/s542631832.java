import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] s = sc.nextLine().toCharArray();
		char[] p = sc.nextLine().toCharArray();

		boolean flag = false;

		for (int i = 0; i < s.length; i++) {
			if (seretch(s, p)) {
				flag = true;
				break;
			} else {
				s = MoveCharRing(s);
			}
		}

		Print(flag);

	}

	static boolean seretch(char[] s, char[] p) {
		for (int si = 0; si + p.length <= s.length; si++) {
			int i = 0;
			if (s[si] == p[0]) {
				for (i = 1; i < p.length; i++) {
					if (s[si + i] != p[i]) {
						break;
					}
				}
				// System.out.println(i);
				if (i == p.length) {
					return true;
				}
			}
		}
		return false;

	}

	static char[] MoveCharRing(char[] c) {
		char work = c[0];
		for (int i = 1; i < c.length; i++) {
			c[i - 1] = c[i];
		}
		c[c.length - 1] = work;
		return c;
	}

	static void Print(boolean f) {
		if (f) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}

