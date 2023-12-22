import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int h = sc.nextInt();
			int n = sc.nextInt();
			int i = 0;
			while (h > 0 && i++ < n) {
				h -= sc.nextInt();
			}
			if (h > 0) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
	}
}
