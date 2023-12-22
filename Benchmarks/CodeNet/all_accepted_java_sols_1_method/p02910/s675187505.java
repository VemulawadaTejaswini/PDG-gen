import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		boolean odd = true;
		boolean res = true;
		for (int i = 0; i < input.length(); i++) {
			if (odd) {
				if (input.charAt(i) == 'L') {
					res = false;
					break;
				}
				odd = !odd;
			} else {
				if (input.charAt(i) == 'R') {
					res = false;
					break;
				}
				odd = !odd;
			}
		}
		if (res) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
