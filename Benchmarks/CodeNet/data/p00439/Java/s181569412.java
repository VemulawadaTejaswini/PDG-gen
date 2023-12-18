
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			if( (n|k) == 0 ) break;
			int[] a = new int[n];
			for(int i=0;i<n;i++) a[i] = Integer.parseInt(sc.next());
			int sum = 0;
			int max = 0;
			for(int i=0;i<k;i++) sum += a[i];
			max = sum;
			for(int i=k;i<n;i++) {
				sum += a[i] - a[i-k];
				max = max(max, sum);
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