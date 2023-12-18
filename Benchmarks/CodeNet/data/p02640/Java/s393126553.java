import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		for (int i = 0; i < x + 1; i++) {
			for (int j = 0; j < x + 1; j++) {
				if ((2 * i + 4 * j) == y && i + j == x) {
					System.out.println("Yes");
					System.exit(0);
				}
			}
		}

		System.out.println("No");

		sc.close();
	}
}