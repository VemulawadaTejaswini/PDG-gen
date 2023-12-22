import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		int n = s.length() - 1;
		long ans = 0;
		for (int i = 0; i < (1 << n); i++) {
			long tmp = c[0] - '0';
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) != 0) {
					ans += tmp;
					tmp = c[j + 1] - '0';
				} else {
					tmp *= 10;
					tmp += c[j + 1] - '0';
				}
			}
			ans += tmp;
		}
		System.out.println(ans);
		sc.close();
	}
}