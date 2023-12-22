import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int r = sc.nextInt();
		int s = sc.nextInt();
		int p = sc.nextInt();
		char[] t = sc.next().toCharArray();
		sc.close();

		boolean[] win = new boolean[n];
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (i >= k && t[i - k] == t[i] && win[i - k]) {
				continue;
			}
			if (t[i] == 'r') {
				ans += p;
			}
			if (t[i] == 's') {
				ans += r;
			}
			if (t[i] == 'p') {
				ans += s;
			}
			win[i] = true;
		}
		System.out.println(ans);
	}
}
