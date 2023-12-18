import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		String s = sc.next();
		int ans = 0, x = 0;

		for (int i = 0; i <= n; i++) {
			if (s.substring(i).startsWith("I")) {
				x++;
			} else {
				x--;
			}
			if (ans < x) {
				ans = x;
			}
		}

		System.out.println(ans);
		sc.close();
	}
}
