import java.io.File;
import java.util.Scanner;

public class Main {
	public static int gcd(int x, int y) {
		// x <= y?????????
		if (x == 0)
			return y;
		else
			return gcd(y % x, x);
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// Scanner sc = new Scanner(new File("test_1.txt"));
		// Scanner sc = new Scanner(new File("test_2.txt"));
		int x = sc.nextInt(), y = sc.nextInt();
		if (x <= y)
			System.out.println(gcd(x, y));
		else
			System.out.println(gcd(y, x));
	}
}