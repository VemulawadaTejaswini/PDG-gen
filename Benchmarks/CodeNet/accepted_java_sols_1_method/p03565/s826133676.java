import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		StringBuilder sb = new StringBuilder(s);
		char[] word = new char[s.length()];
		char[] key = new char[t.length()];
		word = s.toCharArray();
		key = t.toCharArray();
		boolean flg = false;

		tansa: for (int i = s.length() - 1; i >= t.length() - 1; i--) {
			for (int j = 0; j < t.length(); j++) {
				if (word[i - j] != key[key.length - 1 - j] && word[i - j] != '?') {
					break;
				}
				if (j == t.length() - 1) {
					sb.replace(i - t.length()+1, i+1, t);
					flg = true;
					break tansa;
				}
			}
		}
		if (flg == false) {
			System.out.println("UNRESTORABLE");
		} else {
			String ans = sb.toString().replace('?', 'a');
			System.out.println(ans);
		}
	}

}
