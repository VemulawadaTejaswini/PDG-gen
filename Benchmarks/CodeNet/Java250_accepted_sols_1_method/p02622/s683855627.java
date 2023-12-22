import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] slist = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			slist[i] = s.charAt(i);
		}
		String t = sc.next();
		char[] tlist = new char[t.length()];
		for (int i = 0; i < t.length(); i++) {
			tlist[i] = t.charAt(i);
		}

		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			if (slist[i] != tlist[i]) {
				ans++;
			}
		}

		System.out.println(ans);
		sc.close();
	}

}