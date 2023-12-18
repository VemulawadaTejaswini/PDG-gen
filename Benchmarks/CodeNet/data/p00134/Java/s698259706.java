
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		long sum = 0;
		for(int i=0;i<n;i++) {
			sum += sc.nextLong();
		}
		System.out.println(sum/n);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}