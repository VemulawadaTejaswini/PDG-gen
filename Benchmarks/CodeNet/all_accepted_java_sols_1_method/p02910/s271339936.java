import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		char[] c = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {

			if (i % 2 == 0) {
				if (c[i] == 'L') {
					System.out.println("No");
					return;
				}

			} else if (i % 2 == 1) {
				if (c[i] == 'R') {
					System.out.println("No");
					return;
				}
			}

		}
		System.out.println("Yes");

	}
}