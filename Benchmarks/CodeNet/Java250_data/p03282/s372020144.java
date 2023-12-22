import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int n = s.length();
		long k = Long.parseLong(sc.next());
		sc.close();

		int idx = -1;
		char ans = '1';

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) != '1') {
				idx = i + 1;
				ans = s.charAt(i);
				break;
			}
		}

		if (k < idx) {
			System.out.println(1);
			return;
		} else {
			System.out.println(ans);
		}
	}
}