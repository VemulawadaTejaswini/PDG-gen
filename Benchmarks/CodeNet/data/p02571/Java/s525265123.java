import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			String t = sc.next();
			int slen = s.length();
			int tlen = t.length();
			int ans = Integer.MAX_VALUE;
			for (int i = 0; i <= slen - tlen; i++) {
				int tmpans = 0;
				String tmps = s.substring(i, i + tlen);
				for (int j = 0; j < tlen; j++) {
					if (tmps.charAt(j) != t.charAt(j)) {
						tmpans++;
					}
				}
				ans = Math.min(ans, tmpans);
			}
			System.out.println(ans);
		}
	}
}