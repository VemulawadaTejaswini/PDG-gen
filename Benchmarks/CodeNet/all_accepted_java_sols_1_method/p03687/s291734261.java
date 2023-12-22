import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < s.length(); i++) {
			char target = s.charAt(i);
			int index = s.indexOf(target);
			int max = index;
			while (index != -1) {
				int tmp = s.indexOf(target, index + 1);
				if (tmp == -1) {
					max = Math.max(max, s.length() - index - 1);
				} else {
					max = Math.max(max, tmp - index - 1);
				}
				index = tmp;
			}
			ans = Math.min(ans, max);
		}
		System.out.println(ans);
		in.close();
	}
}