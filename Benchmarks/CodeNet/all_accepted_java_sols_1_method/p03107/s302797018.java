import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();

		int[] cnt = new int[2];
		for (int i = 0; i < s.length; i++) {
			cnt[s[i] - '0']++;
		}
		System.out.println(Math.min(cnt[0], cnt[1]) * 2);
	}
}
