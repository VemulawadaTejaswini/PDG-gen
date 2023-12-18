
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n= sc.nextInt();
			if(n == 0) break;
			int a[] = new int[n+1];
			for(int i=0;i<n;i++) a[i] = sc.nextInt();
			a[n] = 0;
			int sum = 0;
			sort(a);
			for(int i=0;i<n;i++) {
				sum += a[i];
				a[i+1] += a[i];
			}
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