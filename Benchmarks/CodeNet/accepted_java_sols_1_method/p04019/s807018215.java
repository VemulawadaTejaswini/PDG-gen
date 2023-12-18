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

		if ((cnt['N' - 'A'] > 0) != (cnt['S' - 'A'] > 0)) {
			System.out.println("No");
			return;
		}
		if ((cnt['W' - 'A'] > 0) != (cnt['E' - 'A'] > 0)) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
	}
}
