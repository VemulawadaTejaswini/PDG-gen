import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] targets = new String[]{"dream", "dreamer", "erase", "eraser"};
		StringBuilder sb = new StringBuilder(sc.next());
		while (sb.length() > 0) {
			boolean flag = true;
			for (String t : targets) {
				int idx = sb.lastIndexOf(t);
				if (idx != -1 && idx == sb.length() - t.length()) {
					sb.setLength(sb.length() - t.length());
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
