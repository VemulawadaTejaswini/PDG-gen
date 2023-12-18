
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
			int p = sc.nextInt();
			if( (n|m|p) == 0 ) break;
			
			int sum = 0;
			int tgt = 0;
			for(int i=0;i<n;i++) {
				int x = sc.nextInt();
				sum += x;
				if(i+1 == m) tgt = x;
			}
			
			sum *= 100;
			sum -= sum*p/100;
			if(tgt == 0) System.out.println(0);
			else System.out.println(sum / tgt);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}