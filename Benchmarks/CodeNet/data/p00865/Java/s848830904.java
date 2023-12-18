import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	int[] num;
	int[] dice;
	int n, m;
	
	void calc(int d) {
		if (d == n) {
			int sum = 0;
			for (int i : dice)
				sum += i;
			num[sum]++;
		} else {
			for (int i = 1; i <= m; i++) {
				dice[d] = i;
				calc(d+1);
			}
		}
	}
	
	void run() {
		while (true) {
			int k;
			n = sc.nextInt(); m = sc.nextInt(); k = sc.nextInt();
			if (n == 0 && m == 0 && k == 0) break;
			
			double ans = 0;
			num = new int[n*m+1];
			dice = new int[n];
			calc(0);
			for (int i = n; i <= n*m; i++) {
				ans += num[i]/Math.pow(m, n)*Math.max(1, i-k);
			}
			
			out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}