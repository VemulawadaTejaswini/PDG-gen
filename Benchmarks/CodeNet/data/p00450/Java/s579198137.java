
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	LinkedList<Integer> gos;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if(n == 0) break;
			int s = sc.nextInt();
			int cnt = 1;
			int st = s;
			gos = new LinkedList<Integer>();
			for(int i=2;i<=n;i++) {
				int go = sc.nextInt();
				if( i%2 == 0 ) {
					if( go == st )
						cnt++;
					else {
						if(!gos.isEmpty())
							cnt += gos.removeLast();
						cnt++;
						st = go;
					}
				}
				else {
					if( go == st )
						cnt++;
					else {
						gos.add(cnt);
						st = go;
						cnt = 1;
					}
				}
			}
			gos.add(cnt);
			debug(gos);
			int ans = 0;
			int size = gos.size();
			for(int i=0;i<size;i++) {
				int val = gos.removeFirst();
				if( (i+s)%2 == 1 ) ans+=val;
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}