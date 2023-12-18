import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();

		for (int i = 0; i < s.length; i++) {
			if (s[i] == (i % 2 == 0 ? 'L' : 'R')) {
				System.out.println("No");
				return;
			}
		} System.out.println("Yes");
	}
}