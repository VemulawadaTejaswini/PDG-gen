import java.util.*;

class Main {
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int g = gcd(a, b);
			System.out.println(g + " " + a / g * b);
		}
	}
}