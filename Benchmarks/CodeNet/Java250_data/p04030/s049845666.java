import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < s.length; i++) {
			if (s[i] == 'B') {
				if (ans.length() > 0) {
					ans.delete(ans.length() - 1, ans.length());
				}
			} else {
				ans.append(s[i]);
			}
		}
		System.out.println(ans.toString());
		in.close();
	}
}