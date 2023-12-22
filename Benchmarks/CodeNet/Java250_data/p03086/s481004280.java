import java.util.Scanner;

public class Main{

	static String s = "";
	static String ans = "";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		solve();
		System.out.println(ans.length());
	}

	public static void solve() {
		String str;
		for (int i = s.length(); i > 0; i--) {
			for (int j = 0; i + j <= s.length(); j++) {
				str = s.substring(j, i + j);
				if (isACGT(str)) {
					ans = str;
					return;
				}
			}
		}
	}

	public static boolean isACGT(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (!(str.charAt(i) == 'A' || str.charAt(i) == 'C' || str.charAt(i) == 'G' || str.charAt(i) == 'T')) {
				return false;
			}
		}
		return true;
	}

}
