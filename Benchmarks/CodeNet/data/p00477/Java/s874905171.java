
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i=0;i<4;i++) {
			sum += sc.nextInt();
		}
		System.out.println(sum/60);
		System.out.println(sum%60);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}