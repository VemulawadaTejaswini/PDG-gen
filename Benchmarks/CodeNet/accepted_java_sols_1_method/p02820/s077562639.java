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

		int ans = 0;
		boolean[] win = new boolean[n];
		for (int i = 0; i < n; i++) {
			if (i < k || t[i - k] != t[i] || !win[i - k]) {
				if (t[i] == 'r') {
					ans += p;
				} else if (t[i] == 's') {
					ans += r;
				} else {
					ans += s;
				}
				win[i] = true;
			}
		}
		System.out.println(ans);
	}
}
