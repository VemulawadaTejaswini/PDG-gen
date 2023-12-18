import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.nextLine().toCharArray();
		int a = 0;
		int x = s.length / 2;
		if (s.length % 2 == 1) {
			int i = 1;
			while (x + i < s.length && s[x + i] == s[x - i] && s[x + i] == s[x]) {
				i++;
			}
			a += i;
		} else {
			int i = 0;
			while (x + i < s.length && s[x + i] == s[x - 1 - i]) {
				i++;
			}
			a += i;
		}

		System.out.println(x + a);
	}
}
