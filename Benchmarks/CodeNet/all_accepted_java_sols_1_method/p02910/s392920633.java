import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				if (s.charAt(i) == 'L') {
					System.out.println("No");
					return;
				}
			} else {
				if (s.charAt(i) == 'R') {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
}
