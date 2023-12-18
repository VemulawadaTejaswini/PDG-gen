import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, c = 0, d = 0, e = 0;
		while (sc.hasNext()) {
			int h = sc.nextInt();
			if (a < h) {
				e = d;
				d = c;
				c = b;
				b = a;
				a = h;
			} else if (b < h) {
				e = d;
				d = c;
				c = b;
				b = h;
			} else if (c < h) {
				e = d;
				d = c;
				c = h;
			} else if (d < h) {
				e = d;
				d = h;
			} else if (e < h) {
				e = h;
			}
		}
		System.out.println(a+" "+b+" "+c+" "+d+" "+e);
	}
}