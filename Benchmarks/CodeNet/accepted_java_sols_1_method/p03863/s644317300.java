import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.nextLine().toCharArray();
		if (s[0] == s[s.length - 1]) {
			if (s.length % 2 == 0) {
				System.out.println("First");
			} else {
				System.out.println("Second");
			}
		} else {
			if (s.length % 2 == 0) {
				System.out.println("Second");
			} else {
				System.out.println("First");
			}
		}
	}
}
