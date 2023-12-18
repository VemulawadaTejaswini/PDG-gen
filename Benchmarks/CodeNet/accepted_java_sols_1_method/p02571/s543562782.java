import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		sc.close();

		int max = 0;
		for (int i = 0; i <= s.length - t.length; i++) {
			int cnt = 0;
			for (int j = 0; j < t.length; j++) {
				if (s[i + j] == t[j]) {
					cnt++;
				}
			}
			max = Math.max(max, cnt);
		}
		System.out.println(t.length - max);
	}
}
