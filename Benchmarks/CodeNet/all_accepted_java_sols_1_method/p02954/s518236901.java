import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		int[] ans = new int[n];
		int up = 0;
		while (s.contains("RL")) {
			int rl = s.indexOf("RL");
			for (int i = 0; i <= rl; i++) {
				if ((rl - i) % 2 == 0) {
					ans[up + rl]++;
				} else {
					ans[up + rl + 1]++;
				}
			}
			int now = rl + 1;
			while (now < s.length() && s.charAt(now) == 'L') {
				if ((now - rl) % 2 == 0) {
					ans[up + rl]++;
				} else {
					ans[up + rl + 1]++;
				}
				now++;
			}
			up += now;
			s = s.substring(now);
		}
		for (int i = 0; i < n - 1; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println(ans[n - 1]);
	}
}