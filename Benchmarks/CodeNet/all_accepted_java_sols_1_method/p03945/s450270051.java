import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		char[] ch = s.toCharArray();
		int ans = 0;
		for (int i = 1; i < s.length(); i++) {
			if (ch[i - 1] != ch[i]) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
