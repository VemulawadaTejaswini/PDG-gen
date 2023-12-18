import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();
		int g = gcd(x, y);
		System.out.println(g);
	}
	static int gcd(int n, int m) {
		if(n > m) {
			return gcd(m, n);
		}
		int k = m % n;
		if(k == 0) {
			return n;
		}else {
			return gcd(n, k);
		}
	}
}
