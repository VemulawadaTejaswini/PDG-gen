import java.util.Scanner;

public class Main {

	/**
	 * Eating Symbols Easy
	 */
	public static void main(String...args) {
		try (Scanner sc = new Scanner(System.in)) {
			int ans = 0;
			String[] s = sc.next().split("");
			for (String i : s) {
				if (i.equals("+")) {
					ans ++;
				} else {
					ans --;
				}
			}
			System.out.println(ans);
		}
	}
}
