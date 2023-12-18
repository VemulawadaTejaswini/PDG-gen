
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int P = 100000;
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long x[] = new long[n];
		x[0] = 0;
		for(int i=1;i<n;i++) {
			x[i] = sc.nextLong() + x[i-1];
		}
		int p = 0;
		long sum = 0;
		for(int i=0;i<m;i++) {
			int next = sc.nextInt();
			sum = (sum + abs( x[p + next] - x[p] ) ) % P;
			p = p + next;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}