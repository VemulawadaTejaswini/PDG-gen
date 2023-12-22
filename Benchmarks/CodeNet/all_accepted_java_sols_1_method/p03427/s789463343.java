import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = sc.next();
		boolean b = true;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == '9') {

			} else {
				b = false;
				break;
			}
		}
		int sum = 9 * (s.length() - 1) + s.charAt(0) - '0';
		if (b) {
		} else {
			sum += -1;
		}
		System.out.println(sum);

	}
}
