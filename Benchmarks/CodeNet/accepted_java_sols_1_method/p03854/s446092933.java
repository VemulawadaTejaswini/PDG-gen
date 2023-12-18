import java.util.*;

public class Main {
	
	static final String[] TYPE = new String[]{"dream", "dreamer", "erase", "eraser"};
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.next());
		while (sb.length() > 0) {
			boolean flag = false;
			for (int i = 0; i < TYPE.length; i++) {
				int idx = sb.indexOf(TYPE[i], sb.length() - TYPE[i].length());
				if (idx != -1) {
					sb.delete(idx, sb.length());
					flag = true;
					break;
				}
			}
			if (flag) {
				continue;
			} else {
				System.out.println("NO");
				return;
			}
		}
		System.out.print("YES");
	}
}
