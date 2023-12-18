
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if( (n|m) == 0) break;
			int p[] = new int[n+1];
			p[0] = 0;
			for(int i=1;i<=n;i++) p[i] = sc.nextInt();

			HashSet<Integer> nums = new HashSet<Integer>();
			for(int i=0;i<=n;i++) for(int j=0;j<=n;j++) {
				if( p[i] + p[j] <= m )
					nums.add(p[i] + p[j]);
			}
			int max = 0;
			for(int p1: nums) for(int p2: nums) {
				if( p1 + p2 <= m ) max = max(max, p1 + p2);
			}
			System.out.println(max);
			
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}