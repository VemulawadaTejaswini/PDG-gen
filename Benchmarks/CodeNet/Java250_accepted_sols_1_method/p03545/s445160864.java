
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.next();
			int a = Integer.parseInt(str.substring(0, 1));
			int b = Integer.parseInt(str.substring(1, 2));
			int c = Integer.parseInt(str.substring(2, 3));
			int d = Integer.parseInt(str.substring(3, 4));
			String ans = null;
			for (int i = 0; i < 8; i++) {
				int tmp = a;
				StringBuilder sb = new StringBuilder(String.valueOf(a));
				if ((i & (1 << 0)) == 0) {
					tmp += b;
					sb.append("+");
					sb.append(String.valueOf(b));
				} else {
					tmp -= b;
					sb.append("-");
					sb.append(String.valueOf(b));
				}
				if ((i & (1 << 1)) == 0) {
					tmp += c;
					sb.append("+");
					sb.append(String.valueOf(c));
				} else {
					tmp -= c;
					sb.append("-");
					sb.append(String.valueOf(c));
				}
				if ((i & (1 << 2)) == 0) {
					tmp += d;
					sb.append("+");
					sb.append(String.valueOf(d));
				} else {
					tmp -= d;
					sb.append("-");
					sb.append(String.valueOf(d));
				}
				if (tmp == 7) {
					sb.append("=7");
					ans = sb.toString();
					break;
				}
			}
			System.out.println(ans);
		}
	}
}