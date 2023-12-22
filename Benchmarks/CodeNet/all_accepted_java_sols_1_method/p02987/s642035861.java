import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean flag = true;
		char a = s.charAt(0);
		char b = s.charAt(0);
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (a == s.charAt(i)) {
				++count;
			}
			if (a == b && s.charAt(i) != b) {
				b = s.charAt(i);
			}
		}
		if (count != 2) {
			flag = false;
		}
		count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == b) {
				++count;
			}
		}
		if (count != 2) {
			flag = false;
		}
		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
