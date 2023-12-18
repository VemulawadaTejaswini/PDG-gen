import java.util.*;

public class Main {
	void solve() {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println(x + y + 2 - gcd(x, y) - 1);
		scan.close();
	}
	
	int gcd(int x, int y) {
		if(x % y == 0) return y;
		return gcd(y, x % y);
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}

