import java.util.*;

public class Main {
	static int gcd(int x, int y) {
		if(x < y) {
			int tmp = x;
			x = y;
			y = tmp;
		}
		while(y > 0) {
			int r = x % y;
			x = y;
			y = r;
		}
		return x;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(gcd(a, b));
	}
}

