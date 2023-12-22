import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String r = "Yes";

		loop: for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (i % 2 == 0) {
				if (c == 'L') {
					r = "No";
					break loop;
				}
			} else {
				if (c == 'R') {
					r = "No";
					break loop;
				}
			}
		}

		System.out.println(r);
		sc.close();
	}
}
