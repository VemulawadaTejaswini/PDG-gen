import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		int[] cnt = new int[2];
		for (int i = 0; i < s.length(); i++) {
			cnt[s.charAt(i) - '0']++;
		}
		System.out.println(Math.min(cnt[0], cnt[1]) * 2);
	}
}
