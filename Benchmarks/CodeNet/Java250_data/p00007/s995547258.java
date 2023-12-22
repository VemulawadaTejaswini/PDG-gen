
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int p = 100000;
		for(int i=0;i<n;i++) {
			p = (int)(p * 1.05);
//			System.out.println(p);
			if(p%1000 > 0) p -= p%1000 - 1000;
//			System.out.println(p);
		}
		System.out.println(p);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}