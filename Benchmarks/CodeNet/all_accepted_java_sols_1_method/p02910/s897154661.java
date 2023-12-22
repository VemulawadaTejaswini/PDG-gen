import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.next();
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'L' && i % 2 == 0) {
					System.out.println("No");
					return;
				}
				if (str.charAt(i) == 'R' && i % 2 == 1) {
					System.out.println("No");
					return;
				}
			}
			System.out.println("Yes");
		}
	}
}