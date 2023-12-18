import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s1, s2, checkStr;
		boolean ans = false;
		int s1Length, s2Length;
		s1 = in.readLine();
		s2 = in.readLine();
		s1Length = s1.length();
		s2Length = s2.length();
		/*
		 * System.out .println("s1Length:" + s1Length +
		 * System.getProperty("line.separator") + "s2Length:" + s2Length);
		 */
		for (int i = 0; i < s1Length; i++) {
			if (s1.charAt(i) == s2.charAt(0)) {
				if ((i + 1) + s2Length > s1Length) {
					/*
					 * System.out.println("文字番" + (i + 1));
					 * System.out.println("範囲外文字列" + (s1.substring(i, s1Length)
					 * + s1.substring(0, s2Length - (s1Length - i))));
					 */
					checkStr = s1.substring(i, s1Length)
							+ s1.substring(0, s2Length - (s1Length - i));
				} else {
					/*
					 * System.out.println("文字番" + (i + 1)); System.out
					 * .println("範囲内文字列" + s1.substring(i, i + s2Length));
					 */
					checkStr = s1.substring(i, i + s2Length);
				}
				if (checkStr.matches(s2)) {
					ans = true;
				}
			}
		}
		if (ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}