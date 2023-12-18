import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		DisjointSet ds = new DisjointSet(n);
		
		for (int i = 0; i < q; i++) {
			int c = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(c==0){
				ds.unite(a, b);
			} else {
				if (ds.same(a, b)) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			}
		}
	}
	
	
	
	static class DisjointSet{
		int[] rank;
		int[] p;
		
		DisjointSet(int s){
			rank = new int[s];
			p = new int[s];
			for (int i = 0; i<s; i++) {
				p[i] = i;
			}
		}
		
		int findSet(int x){
			while(true){
				if(x == p[x]){
					return x;
				}
				x = p[x];
			}
		}
		
		public boolean same(int x, int y){
			return findSet(x) == findSet(y);
		}
		
		public void unite(int x, int y){
			linkSet(findSet(x),findSet(y));
		}
		
		public void linkSet(int x, int y){
			if(rank[x] > rank[y]){
				p[y] = x;
			} else {
				p[x] = y;
				if(rank[x] == rank[y]){
					rank[y]++;
				}
			}
		}
		
	}
	
	
	
	
	
}
