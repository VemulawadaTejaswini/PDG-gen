
import java.awt.geom.Point2D;
import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new aoj1157().doIt();
    }
    class aoj1157{
    	class UnionFind{
    		int [] par,rank;
    		int num;
    		public UnionFind(int n){
    			par = new int[n];
    			rank = new int[n];
    			for(int i = 0;i < n;i++){
    				par[i] = i;
    				rank[i] = 0;
    			}
    			num = n;
    		}
    		int find(int x){
    			if(par[x] == x)return x;
    			else return par[x] = find(par[x]);
    		}
    		void unite(int x,int y){
    			x = find(x);
    			y = find(y);
    			if(x == y)return;
    			if(rank[x] < rank[y])par[x] = y;
    			else{
    				par[y] = x;
    				if(rank[x] == rank[y])rank[x]++;
    			}
    			num--;
    		}
    		boolean same(int x,int y){
    			return find(x) == find(y);
    		}
    	}
        void doIt(){
        	int n = sc.nextInt();
        	int m = sc.nextInt();
        	int num[] = new int[n+1];
        	UnionFind uf = new UnionFind(n+1);
        	for(int i = 0;i < m;i++){
        		int s = sc.nextInt();
        		int g = sc.nextInt();
        		uf.unite(s,g);
        	}
        	for(int i = 1;i < n+1;i++){
        		num[uf.find(i)]++;
        	}
        	int S = 0;
        	int V = 0;
        	for(int i = 1;i < n+1;i++){
        		if(num[i] == 1)V++;
        		else if(num[i] > 1)S++;
        	}
        	System.out.println(Math.abs(V-S));
        }
    }
}