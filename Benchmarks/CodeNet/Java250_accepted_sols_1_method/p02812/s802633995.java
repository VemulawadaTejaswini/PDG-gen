import java.util.Scanner;

/**
 * Count ABC
 */
public class Main {

	public static void main(String...args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			String[] s = sc.next().split("");

			int count = 0;
			for (int i = 0; i < n - 2; i++) {
				if (s[i].equals("A") && s[i+1].equals("B") && s[i+2].equals("C")) {
					count ++;
				}
			}
			System.out.println(count);
		}
	}
}