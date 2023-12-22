import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int[] f = new int[26];

		for (int i = 0; i < s.length(); i++) {
			f[s.charAt(i) - 'a'] = 1 - f[s.charAt(i) - 'a'];
		}

		for (int x : f) {
			if (x == 1) {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
	}

}
