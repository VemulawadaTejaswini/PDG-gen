
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		int ans = 0;
		StringBuilder sb = new StringBuilder();
		int n = input.length();
		int i = 0;
		while (i < n) {
			char x = 'x';
			if (sb.length() != 0)
				x = sb.charAt(sb.length() - 1);
			char y = input.charAt(i);
			if (sb.length() != 0) {
				if (x != y) {
					ans += 2;
					sb.deleteCharAt(sb.length() - 1);
				} else
					sb.append(y);
			} else {
				sb.append(y);
			}
			// if (sb.length() != 0)
			// x = 'x';
			i++;
		}
		System.out.println(ans);
	}

}
