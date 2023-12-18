
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int n;
	int[][] es;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			if(n == 0) break;
			es = new int[n][2];
			for(int i=0;i<n;i++) {
				es[i][0] = sc.nextInt()-1; es[i][1] = sc.nextInt()-1;
			}
			
			used = new boolean[n]; add = new boolean[100]; max = 0;
			visited = new HashSet<String>(); tmp = new ArrayList<String>();
			for(int i=0;i<100;i++) { add[i] = true; dfs(i, 1); add[i] = false; }
			System.out.println(max);
		}
	}
	
	String getCode() {
		String ret = "";
		for(int i=0;i<100;i++) ret += add[i]? 1: 0;
		return ret;
	}
	
	int MAX = 5000;
	HashSet<String> visited;
	ArrayList<String> tmp;
	boolean[] used;
	boolean[] add;
	int max = 0;
	Random rnd = new Random(System.currentTimeMillis());
	void dfs(int p, int num) {
		max = max(max, num);
		if(visited.contains(getCode())) return;
		if(visited.size() == MAX) {
			int r = rnd.nextInt(MAX);
			visited.remove(tmp.remove(r));
			visited.add(getCode());
		}
		for(int i=0;i<n;i++) if(!used[i] && ( es[i][0] == p || es[i][1] == p ) ) {
			if(add[es[i][0]]^add[es[i][1]]) {
				int tmp = es[i][0] == p? es[i][1]: es[i][0];
				used[i] = true;
				add[tmp] = true;
				dfs(tmp, num+1);
				used[i] = false;
				add[tmp] = false;
			}
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}