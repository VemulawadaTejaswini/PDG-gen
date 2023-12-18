
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int t[] = new int[3];
			for(int i=0;i<3;i++) t[i] = sc.nextInt();
			if((t[0]|t[1]|t[2]) == 0) break;
			sort(t);
			int n= sc.nextInt();
			int w = t[0];
			int h = t[1];
			w = w*w;
			h = h*h;
			for(int i=0;i<n;i++) {
				int r = 2*sc.nextInt();
				if( r * r > w+h) System.out.println("OK");
				else System.out.println("NA");
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}