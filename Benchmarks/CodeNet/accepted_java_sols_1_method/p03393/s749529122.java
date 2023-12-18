import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	static public void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();

		String next = "";
		if (s.length() < 26) {
			for (char c = 'a'; c <= 'z'; c++) {
				if (s.indexOf(c) < 0) {
					next = s + c;
					break;
				}
			}
		} else {
			Set<Character> set = new TreeSet<>();
			set.add(s.charAt(s.length() - 1));
			out: for (int i = s.length() - 2; i >= 0; i--) {
				char check = s.charAt(i);
				for (Character val : set) {
					if (check < val) {
						next = s.substring(0, i) + val;
						break out;
					}
				}
				set.add(check);
			}
			if (next.length() == 0) {
				next = "-1";
			}
		}
		System.out.println(next);
	}
}
