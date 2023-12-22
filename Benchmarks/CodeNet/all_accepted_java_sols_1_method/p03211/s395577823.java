
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans = 1001001001;
		for (int i = 0; i < s.length() - 2; i++) {
			int tmp = Integer.parseInt(s.substring(i, i + 3));
			ans = Math.min(ans, Math.abs(753 - tmp));
		}
		System.out.println(ans);
	}
}
