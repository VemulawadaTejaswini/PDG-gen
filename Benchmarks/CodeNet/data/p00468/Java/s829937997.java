
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int n,m;
	LinkedList<Integer>[] friends;
	@SuppressWarnings("unchecked")
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			m = sc.nextInt();
			if( (n|m) == 0 ) break;
			friends = new LinkedList[n];
			for(int i=0;i<n;i++) friends[i] = new LinkedList<Integer>();
			for(int i=0;i<m;i++) {
				int a = sc.nextInt()-1;
				int b = sc.nextInt()-1;
				friends[a].add(b);
				friends[b].add(a);
			}
			HashSet<Integer> set = new HashSet<Integer>();
			for(int a: friends[0]) {
				set.add(a);
				for(int b: friends[a])
					set.add(b);
			}
//			debug(set);
			System.out.println( ( set.size()==0? 0:set.size() - 1 ) );
			
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}