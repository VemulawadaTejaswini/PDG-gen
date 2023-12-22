import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = str.length();
		String s1 = str.substring(0, (n - 1) / 2);
		String s2 = str.substring((n + 3) / 2 - 1, n);
		//System.out.println(s1);
		//System.out.println(s2);
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		int a1 = 0;
		int b1 = 0;//回文になっていなければ①増やす→0ならば回文
		for (int i = 0; i < (n - 1) / 4; i++) {
			if (a[i] != a[(n - 1) / 2 - 1 - i]) {
				a1++;
			}
		}
		for (int i = 0; i < (n - 1) / 4; i++) {
			if (b[i] != b[(n - 1) / 2 - 1 - i]) {
				b1++;
			}
		}
		char[] c = str.toCharArray();
		int c1 = 0;
		for (int i = 0; i < (n - 1) / 2; i++) {

			if (c[i] != c[n - 1 - i]) {
				c1++;
			}
		}
		if (a1 == 0 && b1 == 0 && c1 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
