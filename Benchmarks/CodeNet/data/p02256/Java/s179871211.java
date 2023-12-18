import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Gcd gcd = new Gcd();
		long x = sc.nextLong();
		long y = sc.nextLong();
		long z = 0;
		if (x >= y) {
			System.out.println(gcd.gcd(x, y));
		}else{
			System.out.println(gcd.gcd(y, x));
		}
	}
}

class Gcd {
	public long gcd(long x, long y) {
		long z = x % y;
		long tmpX = x;
		long tmpY = y;
		while (z > 0) {
			z = tmpX % tmpY;
			if (z <= 0) {
				break;
			}
			tmpX = tmpY;
			tmpY = z;
		}
		return tmpY;
	}
}
