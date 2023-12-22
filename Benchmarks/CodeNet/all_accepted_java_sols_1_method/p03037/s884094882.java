import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l, r, tmpl, tmpr;
		l = sc.nextInt();
		r = sc.nextInt();
		boolean b = true;
		for (int i = 1; i < m; i++) {
			tmpl = sc.nextInt();
			tmpr = sc.nextInt();
			if (l <= tmpl) {
				l = tmpl;
			}
			if (r >= tmpr) {
				r = tmpr;
			}
		}
		if (r - l >= 0) {
			System.out.println(r - l + 1);
		} else {
			System.out.println(0);
		}
	}
}
