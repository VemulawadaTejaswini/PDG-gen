import java.util.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
			for(int i = 0; i < 31; i++){
				list.add(new ArrayList<Integer>());
			}
			for(int i = 0; i < n; i++){
				int t = sc.nextInt();
				while(t-- > 0){
					int day = sc.nextInt();
					list.get(day).add(i);
				}
			}
			
			UnionFind uf = new UnionFind(n);
			boolean flg = true;
			for(int i = 0; i < 31; i++){
				for(int j = 0; j < list.get(i).size(); j++){
					for(int k = j + 1; k < list.get(i).size(); k++){
						int a = list.get(i).get(j);
						int b = list.get(i).get(k);
						uf.unite(a, b);
					}
				}
				if(uf.num == 1){
					flg = false;
					System.out.println(i);
					break;
				}
			}
			
			if(flg) System.out.println(-1);
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