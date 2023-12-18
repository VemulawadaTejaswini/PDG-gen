import java.util.*;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a > b) {
			int d = a;
			a = b;
			b = d;
		}
		if (a > c) {
			int d = a;
			a = c;
			c = d;
		}
		if (b > c) {
			int d = b;
			b = c;
			c = d;
		}
		System.out.println(a + " " + b + " " + c);
	}
}