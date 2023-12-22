import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.nextLine().toCharArray();
		int k = sc.nextInt();

		for (int i = 0; i < s.length - 1; i++) {
			int id = s[i] - 'a';
			if (id == 0 || 26 - id > k) continue;
			k -= (26 - id);
			s[i] = 'a';
			if (k == 0) break;
		}
		if (k > 0) {
			s[s.length - 1] = (char) ((s[s.length - 1] - 'a' + k) % 26 + 'a');
		}

		System.out.println(s);
	}
}
