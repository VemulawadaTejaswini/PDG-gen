import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int k = sc.nextInt();
			while (k > 0) {
				if (a < b && c > b) {
					break;
				}
				if (a >= b) {
					b *= 2;
					k--;
				}
				if (b >= c) {
					c *= 2;
					k--;
				}
			}
			if (a < b && c > b && k >= 0) {
				System.out.print("Yes");
			} else {
				System.out.print("No");
			}
		}
	}
}