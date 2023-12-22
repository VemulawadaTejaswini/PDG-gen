import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		sc.close();

		int ans = 0;
		for (int i = 1; i < n; i++) {
			if (s[i] == 'E') {
				ans++;
			}
		}

		int val = ans;
		for (int i = 0; i < n - 1; i++) {
			if (s[i] == 'W') {
				val++;
			}
			if (s[i + 1] == 'E') {
				val--;
			}
			ans = Math.min(ans, val);
		}
		System.out.println(ans);
	}
}
