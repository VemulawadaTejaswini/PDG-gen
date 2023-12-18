import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer k = sc.nextInt();
		String s = sc.next();

		if (s.length() <= k) {
			System.out.print(s);
		} else {
			for (int i = 0; i < k; i++) {
				System.out.print(s.charAt(i));
			}
			System.out.print("...");
		}
	}
}
