import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, s;

		n = sc.nextInt();
		s = sc.nextInt();
		while (n + s != 0) {
			System.out.println(f(n, s, -1, 1));

			n = sc.nextInt();
			s = sc.nextInt();
		}
	}

	public static int f(int n, int s, int pre, int cnt) {
		if (n == cnt) {
			if (pre < s) {
				return 1;
			} else {
				return 0;
			}
		}
		int count = 0;
		for (int i = pre + 1; i <= s / 2; i++) {
			count += f(n, s - i, i, cnt + 1);
		}
		return count;
	}
}