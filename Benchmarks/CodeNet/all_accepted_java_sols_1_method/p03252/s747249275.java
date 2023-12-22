import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String S = scn.nextLine();
		String T = scn.nextLine();
		char[] s = S.toCharArray();
		char[] t = T.toCharArray();
		boolean ans = true;
		for (int i = 0; i < s.length; i++) {
			char as = s[i];
			char at = t[i];
			if (as != at) {
				for (int j = 0; j < s.length; j++) {
					if (j < i) {
						if (s[j] == as || s[j] == at) {
							ans = false;
							break;
						}
					} else {
						if (s[j] == as) {
							s[j] = at;
						} else if (s[j] == at) {
							s[j] = as;
						}
					}
				}
			}
		}
		for (int i = 0; i < s.length; i++) {
			if (s[i] != t[i]) {
				ans = false;
				break;
			}
		}
		System.out.println(ans ? "Yes" : "No");
		scn.close();
	}
}
