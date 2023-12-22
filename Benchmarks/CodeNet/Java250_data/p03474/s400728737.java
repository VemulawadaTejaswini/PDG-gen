import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		char[] s = sc.next().toCharArray();
		boolean t = true;
		for (int i = 0; i < s.length; i++) {
			if (a != i && s[i] == '-') {
				t = false;
				break;
			}
			if (a == i && s[i] != '-') {
				t = false;
				break;
			}
		}
		if (t) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
