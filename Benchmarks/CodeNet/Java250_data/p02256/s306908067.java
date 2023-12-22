import java.util.Scanner;


public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println(gcd(x, y));
	}
	
	int gcd(int x, int y) {
		int rem;
		int largenum;
		if (x == 1 || y == 1) return 1;
		if (x > y) {
			rem = x % y;
			largenum = x;
		} else if (y > x) {
			rem = y % x;
			largenum = x;
		} else return x;
		for (int i = rem - 1; i > 0; i--)
			if (rem % i == 0 && largenum % i == 0) return i;
		return rem;
	}
	public static void main(String[] args) {
		new Main().run();
	}
}