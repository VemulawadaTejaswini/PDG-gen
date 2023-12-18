import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();

		for (int i = 0; i < m; i++) {
			String str = sc.next();
			HashSet<String> hs = new HashSet<String>();

			for (int t = 1; t < str.length(); t++) {
				String a = str.substring(0, t);
				String b = str.substring(t, str.length());
				String ra = Reverse(a);
				String rb = Reverse(b);

				hs.add(a + b);
				hs.add(a + rb);
				hs.add(ra + b);
				hs.add(ra + rb);
				hs.add(b + a);
				hs.add(b + ra);
				hs.add(rb + a);
				hs.add(rb + ra);

			}
			System.out.println(hs.size());
		}

		sc.close();
	}

	public static String Reverse(String s) {
		StringBuffer sb = new StringBuffer(s);
		s = sb.reverse().toString();
		return s;
	}
}