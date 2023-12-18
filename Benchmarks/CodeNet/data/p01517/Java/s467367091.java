import java.util.*;
import java.awt.geom.*;

public class Main{
	ArrayList<Integer> group;
	boolean [] used;
	int [] notused, power;
	int resDfs;
	ArrayList<ArrayList<Integer>> otherListInd;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			HashMap<String, Integer> toindex = new HashMap<String, Integer>();
			ArrayList<ArrayList<String>> otherList = new ArrayList<ArrayList<String>>();
			power = new int[n];
			for(int i = 0; i < n; i++){
				otherList.add(new ArrayList<String>());
				String name = sc.next();
				toindex.put(name, i);
				power[i] = sc.nextInt();
				int m = sc.nextInt();
				while(m-- > 0){
					String other = sc.next();
					otherList.get(i).add(other);
				}
			}
			
			otherListInd = new ArrayList<ArrayList<Integer>>();
			UnionFind uf = new UnionFind(n);
			for(int i = 0; i < n; i++){
				otherListInd.add(new ArrayList<Integer>());
				for(int j = 0; j < otherList.get(i).size(); j++){
					String temp = otherList.get(i).get(j);
					int ind = toindex.get(temp);
					otherListInd.get(i).add(ind);
					uf.unite(i, ind);
				}
			}
			
			int sum = 0;
			boolean [] searched = new boolean[n];
			for(int i = 0; i < n; i++){
				int root = uf.find(i);
				if(searched[root]) continue;
				searched[root] = true;
				group = new ArrayList<Integer>();
				for(int j = 0; j < n; j++){
					if(root == uf.find(j)){
						group.add(j);
					}
				}
				resDfs = 0;
				used = new boolean[group.size()];
				notused = new int[n];
				dfs(0, 0);
				sum += resDfs;
			}
			System.out.println(sum);
		}
	}
	
	private void dfs(int deep, int sum) {
		if(deep == group.size()){
			resDfs = Math.max(sum, resDfs);
			return ;
		}
		
		//use
		int nowind = group.get(deep);
		if(notused[nowind] == 0){
			for(int i = 0; i < otherListInd.get(nowind).size(); i++){
				int otherind = otherListInd.get(nowind).get(i);
				notused[otherind]++;
			}
			dfs(deep + 1, sum + power[nowind]);
			for(int i = 0; i < otherListInd.get(nowind).size(); i++){
				int otherind = otherListInd.get(nowind).get(i);
				notused[otherind]--;
			}
		}
		
		//notuse
		if(nowind != 0){
			dfs(deep + 1, sum);
		}
	}

	class UnionFind{
		int [] par, rank;
		int num;
		public UnionFind(int n) {
			par = new int[n];
			rank = new int[n];
			for(int i = 0 ; i < n; i++){
				par[i] = i;
				//rank[i] = 0;
			}
			num = n;
		}
		int find(int x){
			if(par[x] == x)return x;
			else return par[x] = find(par[x]);
		}
		void unite(int x, int y){
			x = find(x);
			y = find(y);
			if(x == y) return ;
			if(rank[x] < rank[y]) par[x] = y;
			else{
				par[y] = x;
				if(rank[x] == rank[y]) rank[x]++;
			}
			num--;
		}
		boolean same(int x, int y){
			return find(x) == find(y);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}