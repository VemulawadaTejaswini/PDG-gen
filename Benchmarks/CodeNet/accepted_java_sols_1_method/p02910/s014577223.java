import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		boolean b = true;
		for (int i = 0; i < s.length; i++) {
			if (i % 2 != 0) {
				if (s[i] == 'R') {
					b = false;
					break;
				}
			} else if (i % 2 == 0) {
				if (s[i] == 'L') {
					b = false;
					break;
				}
			}
		}
		if (b) {
			sb.append("Yes");
		} else {
			sb.append("No");
		}
		System.out.println(sb);
	}
}