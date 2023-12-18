
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0;t<T;t++) {
			int n = sc.nextInt(), k = sc.nextInt();
			int d[] = new int[n];
			int x = sc.nextInt();
			
			for(int i=1;i<n;i++) {
				int nx = sc.nextInt();
				d[i] = nx-x;
				x = nx;
			}
			
			sort(d);
			
			int sum = 0;
			for(int i=0;i<=n-k;i++) sum += d[i];
			
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}