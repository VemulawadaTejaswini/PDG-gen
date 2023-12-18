
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}

	public Main() {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			@SuppressWarnings("unchecked")
			ArrayList<Integer>[] l = new ArrayList[30];
			for(int i=0;i<30;i++)
				l[i] = new ArrayList<Integer>();
			
			for(int i=0;i<n;i++){
				int m = sc.nextInt();
				for(int j=0;j<m;j++){
					l[sc.nextInt()-1].add(i);
				}
			}
			solve(n, l);
		}
	}

	public void solve(int n, ArrayList<Integer>[] l) {
		uf(n);
		int ok = -1;
		for(int i=0;i<l.length;i++){
			for(int j=0;j<l[i].size()-1;j++){
				unite(l[i].get(j), l[i].get(j+1));
			}
			
			ok = i+1;
			for(int j=0;j<n-1;j++){
				if(!same(j,j+1)){
					ok = -1;
					break;
				}
			}
			if(ok>0)
				break;
		}
		
		System.out.println(ok>0 ? ok : "-1");
		
			
	}

	int[] par;
	int[] rank;

	private void uf(int n) {
		par = new int[n];
		rank = new int[n];
		for (int i = 0; i < n; i++) {
			par[i] = i;
			rank[i] = 0;
		}
	}

	// 木の根を返す
	private int find(int x) {
		if (par[x] == x)
			return x;
		else
			return par[x] = find(par[x]);
	}

	// 併合
	private void unite(int x, int y) {
		x = find(x);
		y = find(y);

		// すでに同じグループ
		if (x == y)
			return;

		if (rank[x] < rank[y]) {
			par[x] = y;
		} else {
			par[y] = x;
			if (rank[x] == rank[y])
				rank[x]++;
		}
	}

	// 同じグループなら真
	private boolean same(int x, int y) {
		return find(x) == find(y);
	}
	
}