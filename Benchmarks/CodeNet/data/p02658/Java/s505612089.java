import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		long MAX = (long) Math.pow(10, 18);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Long[] s = new Long[n];
		long ans = 1;
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextLong();
			if (s[i] == 0) {
				System.out.println(0);
				System.exit(0);
			}
		}

		for (int i = 0; i < n; i++) {
			if (ans <= MAX)
				ans *= s[i];
			else
				break;
		}
		if (ans > MAX)
			ans = -1;
		System.out.println(ans);
	}
}