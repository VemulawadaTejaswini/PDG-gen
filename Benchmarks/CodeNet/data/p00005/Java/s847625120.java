import java.util.Scanner;

public class Main {
	static int gcd(int x, int y) {
		return y == 0 ? x : gcd(y, x % y);
	}
	static int lcm(int x, int y) {
		return x / gcd(x, y) * y;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt(), b = sc.nextInt();
			System.out.printf("%d %d\n", gcd(a, b), lcm(a, b));
		}
		sc.close();
	}
}
