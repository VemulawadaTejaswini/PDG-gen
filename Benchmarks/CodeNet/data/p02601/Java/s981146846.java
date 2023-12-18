
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer r = sc.nextInt();
		Integer g = sc.nextInt();
		Integer b = sc.nextInt();

		Integer k = sc.nextInt();

		for (Integer i = 0; i < k; i++) {

			if (g < r) {
				g *= 2;
				continue;
			} else if (b < g) {
				b *= 2;
				continue;
			}
		}

		if (r < g && g < b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");

		}

	}

}