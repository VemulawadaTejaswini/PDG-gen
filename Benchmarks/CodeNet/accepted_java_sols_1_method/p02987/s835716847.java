import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();

		int[] cnt = new int[26];
		for (int i = 0; i < s.length; i++) {
			cnt[s[i] - 'A']++;
		}

		int cnt2 = 0;
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] == 2) {
				cnt2++;
			}
		}
		if (cnt2 == 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
