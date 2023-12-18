
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		for(int i=0;i<k;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			a = min(a, n-a+1);
			b = min(b, n-b+1);
			System.out.println((min(a, b) % 3 + 2) % 3+1);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}