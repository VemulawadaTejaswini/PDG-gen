import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();

		for (int i = 1; i < s.length; i++) {
			if (s[i - 1] == s[i]) {
				System.out.println(i + " " + (i + 1));
				return;
			}
		}
		for (int i = 2; i < s.length; i++) {
			if (s[i - 2] == s[i]) {
				System.out.println((i - 1) + " " + (i + 1));
				return;
			}
		}
		System.out.println("-1 -1");
	}
}
