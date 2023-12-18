import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.length() % 2 != 0) {
			System.out.println("No");
			System.exit(0);
		}
		for(int i = 0; i < s.length() - 1; i += 2) {
			if(s.charAt(i) != 'h' || s.charAt(i + 1) != 'i') {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");

		sc.close();
	}
}
