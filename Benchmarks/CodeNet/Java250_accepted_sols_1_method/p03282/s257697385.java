import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long k = sc.nextLong();
		char[] c = s.toCharArray();
		if (s.length() >= k) {
			for (int i = 0; i < k; i++) {
				if (c[i] != '1') {
					break;
				} else if (i == k - 1) {
					System.out.println(1);
					return;
				}
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if (c[i] != '1') {
				System.out.println(c[i]);
				break;
			}
		}
	}
}