import java.util.*;

public class Main {
	public static void main(String[] args) {
		// practice contest

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int add = 0;
		add = a + b;
		int sub = 0;
		sub = a - b;
		int product = 0;
		product = a * b;
		int x = 0;
		x = Math.max(add, sub);
		int y = 0;
		y = Math.max(x, product);
		System.out.println(y);
	}

}
