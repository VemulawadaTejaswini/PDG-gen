import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n;
		while ((n = in.nextInt()) != 0) {
			char[][] h = new char[n][2];
			for (char[] c : h) {
				c[0] = in.next().charAt(0);
				c[1] = in.next().charAt(0);
			}
			sb.setLength(0);
			int m = in.nextInt();
			for (int i = 0; i < m; i++) {
				sb.append(in.next());
			}
			String s = sb.toString();
			for (char[] c : h) {
				s = s.intern().replace(c[0], c[1]);
			}
			System.out.println(s);
		}
	}
}