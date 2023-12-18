import java.io.*;
import java.util.*;


public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new A().doIt();
	}
	class A{
		void doIt(){
			int n = sc.nextInt();
			int m = sc.nextInt();
			UnionFind u = new UnionFind(n);
			for(int i = 0;i < m;i++){
				int num = sc.nextInt();
				if(num == 0)u.unite(sc.nextInt(), sc.nextInt());
				else System.out.println(u.same(sc.nextInt(), sc.nextInt()) ? 1:0);
			}
		}
		class UnionFind{
			int [] par, rank; // par -> rootnumber, rank -> height 
			int num; // ?????¨???????????????????????°
			public UnionFind(int n) {
				par = new int[n];
				rank = new int[n]; for(int i=0;i<n;i++){
					par[i] = i;
		            //rank[i] = 0;
				}
				num=n; 
			}
			int find(int x){ //?????????????????????????????¢??? 
				if(par[x] == x)return x;
				else return par[x] = find(par[x]);
			}
			void unite(int x, int y){ //????????????
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
			boolean same(int x, int y){ //????????????????????????????????¨?????????????????? 
				return find(x) == find(y);
			} 
		}
	}
}