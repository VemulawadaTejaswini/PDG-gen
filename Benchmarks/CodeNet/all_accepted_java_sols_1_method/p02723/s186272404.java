import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		if (s.length < 6) {
			System.out.println("No");
			return;
		}
		if (s[2] == s[3] && s[4] == s[5]) {
			System.out.println("Yes");
			return;
		}
		System.out.println("No");
	}
}
