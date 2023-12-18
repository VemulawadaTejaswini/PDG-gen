import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		sc.close();

		int ans = 0;
		for (int i = 0; i < t.length; i++) {
			if (s[i] != t[i]) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
