import java.util.Arrays;
import java.util.Scanner;


public class Main {
	Scanner in = new Scanner(System.in);
	int n, m, k;
	int ans;
	
	public void recursive(int n, int sum) {
		if (n == 0) {
			if (sum - k <= 0) {
				ans++;
			} else {
				ans += sum - k;
			}
		} else {
			for (int i = 1; i <= m; i++) {
				recursive(n - 1, sum + i);
			}
		}
	}
	
	public void run() {
		while (true) {
			n = in.nextInt();
			m = in.nextInt();
			k = in.nextInt();
			if (n == 0 && m == 0 && k == 0) break;
			ans = 0;
			
			recursive(n, 0);
			
			double all = Math.pow(m, n);
			
			System.out.println(ans / all);
		}
	}
	
	public static void main(String args[]) {
		new Main().run();
	}
}