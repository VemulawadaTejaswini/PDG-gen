import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int ans = t.length();
		for (int i = 0; i < s.length() - t.length()+ 1; i++) {
			int cnt = 0;
			for (int j = 0; j < t.length(); j++) {
				if (s.charAt(i + j) != t.charAt(j)) {
					cnt++;
				}
			}
			ans = Math.min(ans, cnt);
		}
		System.out.println(ans);
	}
}
