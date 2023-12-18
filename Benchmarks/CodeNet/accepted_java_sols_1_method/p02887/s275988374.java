import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		sc.close();

		int ans = 1;
		char now = s[0];
		for (int i = 1; i < n; i++) {
			if (s[i] != now) {
				ans++;
			}
			now = s[i];
		}
		System.out.println(ans);
	}
}
