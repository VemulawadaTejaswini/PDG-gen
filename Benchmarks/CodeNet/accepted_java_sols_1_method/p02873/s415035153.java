import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		char[] c = s.toCharArray();
		int n = c.length + 1;
		int[] a = new int[n];
		Arrays.fill(a, Integer.MIN_VALUE);
		if (c[0] == '<') {
			a[0] = 0;
		}
		if (c[c.length - 1] == '>') {
			a[c.length] = 0;
		}
		for (int i = 0; i < c.length - 1; i++) {
			if (c[i] == '>' && c[i + 1] == '<') {
				a[i + 1] = 0;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				for (int j = i - 1; j >= 0; j--) {
					if (c[j] == '>') {
						a[j] = Math.max(a[j], a[j + 1] + 1);
					} else {
						break;
					}
				}
				for (int j = i; j < c.length; j++) {
					if (c[j] == '<') {
						a[j + 1] = a[j] + 1;
					} else {
						break;
					}
				}
			}
		}
		long ans = 0;
		for (int i = 0; i < a.length; i++) {
			ans += a[i];
		}
		System.out.println(ans);
	}
}
