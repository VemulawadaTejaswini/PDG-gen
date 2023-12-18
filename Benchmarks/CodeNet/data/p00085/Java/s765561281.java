import java.util.*;
public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt(), m = sc.nextInt();
			if( (n|m) == 0 ) break;
			System.out.println(josephus(n, m, n)+1);
		}
	}
	int josephus(int n, int m, int k) {
		int x = -1;
		for (int i = n - k + 1; i <= n; i++) {
			x = (x + m) % i;
		}
		return x;
	}
	public static void main(String[] args) {
		new Main().run();
	}
}