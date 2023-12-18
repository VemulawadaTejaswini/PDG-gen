
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	int[][] next = {{1,4},
					{0,2,5},
					{1,3,6},
					{2,7},
					{0,5},
					{1,4,6},
					{2,5,7},
					{3,6}};
	HashMap<Integer, Integer> ans = new HashMap<Integer, Integer>();
	void run() {
		Scanner sc = new Scanner(System.in);
		bfs();
		while(sc.hasNext()) {
			int q = 0;
			int tmp = 1;
			for(int i=0;i<8;i++) {
				q += sc.nextInt() * tmp;
				tmp *= 8;
			}
			System.out.println(ans.get(q));
		}
	}
	
	void bfs() {
		boolean[] visited = new boolean[16777216];
		Struct now = new Struct(new int[] {0, 1, 2, 3, 4, 5, 6, 7}, 0);
		LinkedList<Struct> que = new LinkedList<Struct>();
		que.add(now);
		visited[toInt(now.s)] = true;
		for(;!que.isEmpty();) {
			now = que.removeFirst();
			ans.put(toInt(now.s), now.c);
//			System.out.println(toString(now.s));
			int a[] = now.s.clone();
			int zero = 0;
			for(int i=0;i<8;i++) if(a[i] == 0) {
				zero = i; break;
			}
			for(int i=0;i<next[zero].length;i++) {
				int[] b = a.clone();
				int tmp = b[zero];
				b[zero] = b[next[zero][i]];
				b[next[zero][i]] = tmp;
				Struct next_s = new Struct(b, now.c+1);
				int ind = toInt(b);
				if( !visited[ind] ) {
					visited[ind] = true;
					que.addLast(next_s);
				}
			}
		}
	}
	
	int toInt(int[] a) {
		int ret = 0;
		int tmp = 1;
		for(int i=0;i<8;i++) {
			ret += a[i]*tmp;
			tmp *= 8;
		}
		return ret;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	class Struct {
		int[] s;
		int c;
		int zero;
		Struct(int s[], int c) {
			this.s = s.clone();
			this.c = c;
		}
	}
}