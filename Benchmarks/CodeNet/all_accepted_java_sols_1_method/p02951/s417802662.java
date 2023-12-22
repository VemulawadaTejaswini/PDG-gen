import java.util.*;

public class Main {
	public static void main(String[] args) {
		// practice contest

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int x = a - b;
		if (x <= c) {
			System.out.println(c - x);
		}
		if (x > c) {
			System.out.println(0);
		}
	}
}
