
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	V[] G;
	boolean[] used;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if(n == 0) break;
			
			G = new V[n * 20 ];
			for(int i=0;i<n*20;i++) G[i] = new V();
			
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			
			int ind = 0;
			for(int i=0;i<n;i++) {
				String[] sp = sc.next().split("[:,.]");
				if(!map.containsKey(sp[0])) map.put(sp[0], ind++);
				int f = map.get(sp[0]);
				
				for(int j=1;j<sp.length;j++) {
					if(!map.containsKey(sp[j])) map.put(sp[j], ind++);
					int t = map.get(sp[j]);
					G[f].add(t);
				}
			}
			
			used = new boolean[n*20];
			cnt = 0;
			dfs(0);
			System.out.println(cnt);
		}
		
	}
	
	int cnt;
	void dfs(int p) {
		used[p] = true;
		if(G[p].size()==0)cnt++;
		for(int i: G[p]) if(!used[i]) dfs(i);
	}
	
	class V extends ArrayList<Integer>{}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}