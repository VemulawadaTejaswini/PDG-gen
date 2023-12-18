import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		int x;
		int count;

		while (sc.hasNext()) {
			a = sc.nextInt();
			b = sc.nextInt();
			x = a + b;
			count = 0;
			while (0 < x) {
				count++;
				x = x / 10;
			}
			System.out.println(count);
		}
	}
}