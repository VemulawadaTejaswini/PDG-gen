import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		char[] az1 = new char[26];
		char[] az2 = new char[26];
		boolean b = true;
		for (int i = 0; i < 26; i++) {
			az1[i] = 'A';
			az2[i] = 'A';
		}
		for (int i = 0; i < s.length; i++) {
			if (az1[t[i] - 'a'] != 'A') {
				if (az1[t[i] - 'a'] != s[i]) {
					b = false;
					break;
				}
			} else {
				az1[t[i] - 'a'] = s[i];
			}

			if (az2[s[i] - 'a'] != 'A') {
				if (az2[s[i] - 'a'] != t[i]) {
					b = false;
					break;
				}
			} else {
				az2[s[i] - 'a'] = t[i];
			}
		}
		if (b) {
			sb.append("Yes");
		} else {
			sb.append("No");
		}
		System.out.println(sb);
	}
}
