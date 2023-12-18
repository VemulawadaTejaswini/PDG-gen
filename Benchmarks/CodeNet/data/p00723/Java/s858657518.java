import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int N = sc.nextInt();
		for (int i = 0; i < N; ++i) {
			String t = sc.next();
			HashSet<String> set = new HashSet<String>();
			set.add(t);
			for (int j = 1; j < t.length(); ++j) {
				String t1 = t.substring(0, j);
				String t2 = t.substring(j);
				set.add(t2 + t1);
				set.add(reverse(t1) + t2);
				set.add(reverse(t2) + t1);
				set.add(t1 + reverse(t2));
				set.add(t2 + reverse(t1));
				set.add(reverse(t1) + reverse(t2));
				set.add(reverse(t2) + reverse(t1));
			}
			System.out.println(set.size());
		}
	}

	static String reverse(String s) {
		char[] c = new char[s.length()];
		for (int i = 0; i < s.length(); ++i) {
			c[s.length() - 1 - i] = s.charAt(i);
		}
		return String.valueOf(c);
	}

}