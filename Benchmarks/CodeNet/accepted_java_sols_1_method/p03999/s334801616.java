import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		int n = s.length() - 1;
		long ans = 0;
		int end = 1 << n;
		for (int i = 0; i < end; i++) {
			long sum = 0;
			int pre = 0;
			for (int j = 0; j < n; j++) {
				if ((i >> j & 1) == 1) {
					sum += Long.parseLong(s.substring(pre, j + 1));
					pre = j + 1;
				}
			}
			sum += Long.parseLong(s.substring(pre));
			ans += sum;
		}
		System.out.println(ans);
	}
}
