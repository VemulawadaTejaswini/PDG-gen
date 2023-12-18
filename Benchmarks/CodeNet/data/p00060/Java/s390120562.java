
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(; sc.hasNext();) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			boolean[] open = new boolean[10];
			open[c1-1] = open[c2-1] = open[c3-1] = true;
			int num = c1 + c2;
			int cnt = 0;
			for(int i=0;i<10;i++) {
				if( !open[i] && num + (i+1) <= 20 ) cnt++; 
			}
			if(cnt>=4) System.out.println("YES");
			else System.out.println("NO");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}