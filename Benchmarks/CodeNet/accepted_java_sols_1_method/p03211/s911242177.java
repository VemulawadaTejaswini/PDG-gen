import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < s.length() - 2; i++) {
			int x = Integer.parseInt(s.substring(i, i + 3));
			ans = Math.min(ans, Math.abs(x - 753));
		}
		System.out.println(ans);
	}
}
