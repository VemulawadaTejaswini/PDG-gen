
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int MAX = 10000;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int x = sc.nextInt();
			if( (n|a|b|c|x) == 0 ) break;
			
			int y[] = new int[n];
			for(int i=0;i<n;i++) y[i] = sc.nextInt();
			
			int i, j = 0;
			for(i=0;i<=MAX;i++) {
				if( x == y[j] ) j++;
				if( j == n ) break;
				x = (a * x + b) % c;
			}
			
			System.out.println( (i>MAX? -1:i) );
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}