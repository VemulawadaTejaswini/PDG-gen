import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	class UnionFind {
		int[] par;
		UnionFind() {
			par = new int[50];
		}
		
		void init(int n) {
			for (int i = 0; i < n; i++)
				par[i] = i;
		}
		
		int find(int x) {
			if (x == par[x]) return x;
			return par[x] = find(par[x]);
		}
		
		void unite(int x, int y) {
			x = find(x);
			y = find(y);
			if (x == y) return;
			par[x] = y;
		}
		
		boolean same(int x, int y) {
			return find(x) == find(y);
		}
		
		boolean sameAll(int n) {
			int m = find(0);
			boolean flag = true;
			for (int i = 1; i < n; i++) {
				if (m != find(i)) {
					flag = false;
					break;
				}
			}
			return flag;
		}
	}
	
	@SuppressWarnings("unchecked")
	void run() {
		List<Integer>[] list = new ArrayList[30];
		for (int i = 0; i < 30; i++)
			list[i] = new ArrayList<Integer>();
		UnionFind uf = new UnionFind();
		top:while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			for (int i = 0; i < 30; i++)
				list[i].clear();
			uf.init(n);
			for (int i = 0; i < n; i++) {
				int m = sc.nextInt();
				for (int j = 0; j < m; j++) {
					list[sc.nextInt()-1].add(i);
				}
			}
			
			for (int t = 0; t < 30; t++) {
				for (int i = 0; i < list[t].size()-1; i++) {
					for (int j = i+1; j < list[t].size(); j++) {
						uf.unite(list[t].get(i), list[t].get(j));
					}
				}
				if (uf.sameAll(n)) {
					out.println(t+1);
					continue top;
				}
			}
			out.println(-1);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}