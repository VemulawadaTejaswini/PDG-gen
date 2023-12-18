import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = gcd(a, b);
		System.out.println(ans);
		sc.close();
	}
	int gcd(int a, int b) {
		if(a < b) {
			int c = a;
			a = b;
			b = c;
		}
		if(b == 0) return a;
		else return gcd(b, a%b);
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
