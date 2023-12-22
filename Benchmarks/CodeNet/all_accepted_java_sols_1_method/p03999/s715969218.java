import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		long sum = 0;
		char[] c = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
		}

		for (int bit = 0; bit < (1 << s.length()-1); bit++) {
			StringBuilder t = new StringBuilder();
			for (int i = 0; i < s.length(); i++) {
				t.append(c[i]);
				if ((bit & (1 << i)) != 0) {
					sum += Long.parseLong(t.toString());
					t.setLength(0);
					continue;
				}
				if (i==s.length()-1) sum += Long.parseLong(t.toString());
			}
		}
		System.out.println(sum);
	}
}
