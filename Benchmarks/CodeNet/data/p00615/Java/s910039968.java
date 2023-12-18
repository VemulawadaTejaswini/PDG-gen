
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
			if((n|m) == 0) break;
			
			int[] a = new int[n+m+1];
			a[0] = 0;
			
			for(int i=0;i<n;i++) a[i+1] = sc.nextInt();
			for(int j=0;j<m;j++) a[j+n+1] = sc.nextInt();
			
			sort(a);
			int max = 0;
			for(int i=0;i<n+m;i++) {
				max = max(max, a[i+1]-a[i]);
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