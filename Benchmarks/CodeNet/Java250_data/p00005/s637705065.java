import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(GCD(a, b) + " " + 1l * a * b / GCD(a, b));
		}
		sc.close();
	}

	public static int GCD(int x, int y) {
		int tmp;
		while ((tmp = x % y) != 0) {
			x = y;
			y = tmp;
		}
		return y;
	}
}