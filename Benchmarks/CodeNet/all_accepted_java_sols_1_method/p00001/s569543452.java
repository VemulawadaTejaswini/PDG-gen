
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, c = 0; // a>=b>=c
		while (sc.hasNext()) {
			String line = sc.nextLine();
			Scanner s = new Scanner(line);
			int h = s.nextInt();
			if (a < h) {
				c = b;
				b = a;
				a = h;
			} else if (b < h) {
				c = b;
				b = h;
			} else if (c < h) {
				c = h;
			}
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}