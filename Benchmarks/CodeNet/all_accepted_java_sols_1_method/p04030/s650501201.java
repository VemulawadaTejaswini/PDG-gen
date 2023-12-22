import java.util.Scanner;

public class Main {
	static boolean[][] nodes;
	static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			switch (c) {
			case '0':
				sb.append('0');
				break;
			case '1':
				sb.append('1');
				break;
			case 'B':
				if (sb.length() != 0) {
					sb.deleteCharAt(sb.length() - 1);
				}
				break;
			default:
				break;
			}
		}
		System.out.println(sb);
		sc.close();
	}

}
