import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		int n = s.length();
		int ans[] = new int[n];
		int r = 0;
		int pre = 0;
		for (int i = 0; i < n; ++i) {
			if (s.charAt(i) == 'R')
				r = i;
			if (s.charAt(i) == 'L') {
				if (i == n - 1 || s.charAt(i + 1) == 'R') {
					ans[r] = (r - pre + 2) / 2 + (i - r) / 2;
					ans[r + 1] = (r - pre + 3) / 2 + (i - r - 1) / 2;
					pre = i + 1;
				}
			}
		}
		for (int a : ans)
			System.out.print(a + " ");
		System.out.println();
	}
}
