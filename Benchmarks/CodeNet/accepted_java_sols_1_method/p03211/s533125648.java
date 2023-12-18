import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		int ans = 753;
		for (int i = 0; i < c.length - 2; i++) {
			int x = (c[i] - '0') * 100 + (c[i + 1] - '0') * 10 + (c[i + 2] - '0');
			ans = Math.min(ans, Math.abs(753 - x));
		}
		System.out.println(ans);
		sc.close();
	}
}