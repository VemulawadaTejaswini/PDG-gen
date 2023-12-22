import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s;
		String tmp = sc.next();
		s = tmp.toCharArray();
		char current = s[0];
		int count = 1;
		for (int i = 1; i < n; i++) {
			if (current != s[i]) {
				count++;
			}
			current = s[i];
		}
		System.out.println(count);
	}
}
