import java.util.*;
import java.awt.geom.*;
public class Main {
	//2337 start

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			while(n-- > 0){
				int m = sc.nextInt();
				Line2D [][] data = new Line2D[m][4];
				for(int i = 0 ; i< m; i++){
					Point2D [] input = new Point2D[4];
					for(int j = 0; j < 4; j++){
						int x = sc.nextInt();
						int y = sc.nextInt();
						input[j] = new Point2D.Double(x, y);
					}
					
					for(int j = 0 ; j< 4; j++){
						data[i][j] = new Line2D.Double(input[j], input[(j+1) % 4]);
					}
				}
				solve(data, m);
			}
		}
	}
	
	private void solve(Line2D[][] data, int m) {
		UnionFind uf = new UnionFind(m);
		for(int i = 0 ; i < m ;i++){
			for(int j = i+1; j < m; j++){
				if(intersect(data[i], data[j])){
					uf.unite(i, j);
				}
			}
		}
		System.out.println(uf.num);
	}

	private boolean intersect(Line2D[] l, Line2D[] m) {
		for(int i = 0 ; i < l.length ; i++){
			for(int j = 0 ; j < m.length; j++){
				if(l[i].intersectsLine(m[j])){
					return true;
				}
			}
		}
		
		int temp = l[0].relativeCCW(m[0].getP1());
		boolean flg = true;
		for(int i = 1 ; i < l.length; i++){
			if(l[i].relativeCCW(m[0].getP1()) * temp < 0 ){
				flg = false;
				break;
			}
		}
		if(flg) return true;
		
		temp = m[0].relativeCCW(l[0].getP2());
		flg = true;
		for(int i = 1; i < m.length; i++){
			if(m[i].relativeCCW(l[0].getP2()) * temp < 0){
				return false;
			}
		}
		return true;
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

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}