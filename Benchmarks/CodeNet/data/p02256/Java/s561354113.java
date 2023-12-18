import java.util.Scanner;

public class Main {

	public static void main(String[] atgs) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (x < y) {
			int tmp = x;
			x = y;
			y = tmp;
		}
		System.out.println(gcd(x, y));
		sc.close();
	}

	public static int gcd(int a, int b) {
		int v = a % b;
		if (v == 0) {
			return b;
		} else {
			return gcd(b, v);
		}
	}
}

