import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == 'A') {
				if (s.charAt(i + 1) == 'C') {
					System.out.print("Yes");
					return;
				}
			}
		}
		System.out.print("No");
	}

}
