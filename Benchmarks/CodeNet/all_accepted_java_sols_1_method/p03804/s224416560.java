import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		String[] a = new String[n];
		String[] b = new String[m];
		for (int i = 0; i < n; i++) {
			a[i] = scan.next();
		}
		for (int i = 0; i < m; i++) {
			b[i] = scan.next();
		}
		for (int i = 0; i <= n - m; i++) {
			for (int k = 0; k <= n - m; k++) {
				boolean flag = true;
				for (int j = 0; j < m; j++) {
					String temp = a[j + i].substring(k, k + m);
					if (!temp.equals(b[j])) {
						flag = false;
						break;
					}
				}
				if (flag) {
					System.out.println("Yes");
					return;
				}
				flag = true;
			}
		}
		System.out.println("No");
	}
}