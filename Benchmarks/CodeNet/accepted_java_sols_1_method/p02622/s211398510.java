import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		String t = scn.next();
		int ans = 0;
		int n = s.length();
		for (int i = 0; i < n; i++) {
			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);
			if (ch1 != ch2) {
				ans++;
			}
		}
		System.out.println(ans);
	}

}
