import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();

		char[] chars = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			char c = (char)('A' + ((chars[i] - 'A' + n) % 26));
			sb.append(String.valueOf(c));
		}
		System.out.println(sb.toString());
	}
}
