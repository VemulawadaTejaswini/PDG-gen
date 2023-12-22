import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		char[] s = sc.next().toCharArray();
		
		for (int i = 0; i < a; i++) {
			if (!(s[i] - '0' >= 0 && s[i] - '0' <= 9)) {
				System.out.println("No");
				return;
			}
		}
		if (s[a] != '-') {
			System.out.println("No");
			return;
		}
		for (int i = a + 1; i < a + b; i++) {
			if (!(s[i] - '0' >= 0 && s[i] - '0' <= 9)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
