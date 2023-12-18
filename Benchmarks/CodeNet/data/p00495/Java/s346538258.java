
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[m];
		for(int i=0;i<n;i++) a[i] = sc.nextInt();
		for(int i=0;i<m;i++) b[i] = sc.nextInt();
		int max = 0;
		for(int i=0;i<m;i++) {
			int p = i;
			for(int j=0;j<n;j++) {
				if(a[j] == b[p]) p++;
				if(p == m) break;
			}
			max = max(max, p-i);
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}