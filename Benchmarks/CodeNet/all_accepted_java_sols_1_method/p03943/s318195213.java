import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, c = 0, m = 0;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		m = Math.max(a, b);
		m = Math.max(m, c);
		if (m == a + b + c - m) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
