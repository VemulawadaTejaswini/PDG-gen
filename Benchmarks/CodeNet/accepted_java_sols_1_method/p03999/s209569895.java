import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
		String[] a  = new String[2 * s.length - 1];
		for (int i = 0; i < a.length; i += 2)
			a[i] = s[i / 2];
		int d = s.length - 1;
		long ans = 0;
		for (int i = 0; i < (1<<d); i++) {
			for (int j = d - 1, k = 0; j >= 0; j--, k++) {
				if (((i>>j) & 1) == 1)
					a[2 * k + 1] = "+";
				else
					a[2 * k + 1] = " ";
			}
			long c = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j].equals(" ")) continue;
				if (a[j].equals("+")) {
					ans += c;
					c = 0;
				}
				else {
					c = c * 10 + Integer.parseInt(a[j]);
				}
			}
			ans += c;
		}
		System.out.println(ans);
	}
}