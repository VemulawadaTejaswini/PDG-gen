import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNextInt()) {
			int a = s.nextInt();
			int b = s.nextInt();
			if (a == 0 && b == 0) break;
			if (a > b) {
				int t = a;
				a = b;
				b = t;
			}
			System.out.printf("%d %d\n", a, b);
		}
	}
}