import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		for (int i = 0; i < s.length; i++) {
			if (s[i] == '1') {
				sb.append("9");
			} else if (s[i] == '9') {
				sb.append("1");
			} else {
				sb.append(s[i]);
			}
		}
		System.out.println(sb);
	}
}