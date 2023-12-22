import java.util.*;
class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int sol = t.length();
		for (int i = 0; i <= s.length() - t.length(); i++) {
			int count = 0;
			int k = i;
			for (int j = 0; j < t.length(); j++) {
				if (s.charAt(k) != t.charAt(j)) {
					count++;
				}
				k++;
			}
			sol = Math.min(count, sol);
		}
		System.out.println(sol);
	}

}