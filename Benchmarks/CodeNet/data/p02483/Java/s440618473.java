import java.util.Scanner;

public class sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = a;

		if (a > b) {
			x = b;
			b = a;
			a = x;
			if (b > c) {
				x = c;
				c = b;
				b = x;
				if (a > b) {
					x = b;
					b = a;
					a = x;
				}
			}

		}
		System.out.println("%d %d %d\n", a, b, c);

	}

}