import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.close();

		int[] cnt = new int[26];
		int b = a.length();
		for (int i = 0; i < b; i++) {
			cnt[a.charAt(i) - 'a']++;
		}

		long ans = (long) b * (b - 1) / 2 + 1;
		for (int i = 0; i < 26; i++) {
			long c = (long) cnt[i] * (cnt[i] - 1) / 2;
			ans -= c;
		}
		System.out.println(ans);
	}
}
