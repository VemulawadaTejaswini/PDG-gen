import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			int d = s.charAt(i) - '0';
			sum += d;
		}
		if (sum % 9 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
