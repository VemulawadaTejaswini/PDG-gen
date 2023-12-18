import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
		String s = sc.next();
		int counterAB = 0, counterB = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'a' && counterAB < a + b) {
				System.out.println("Yes");
				counterAB++;
			} else if (s.charAt(i) == 'b' && counterAB < a + b && counterB < b) {
				System.out.println("Yes");
				counterAB++;
				counterB++;
			} else {
				System.out.println("No");
			}
		}
	}
}