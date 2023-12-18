import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmpArray = br.readLine().split(" ");
		int n = Integer.parseInt(tmpArray[0]);
		int q = Integer.parseInt(tmpArray[1]);
		
		DisjointSet set = new DisjointSet(n);
		
		for(int i = 0; i < q; i++){
			tmpArray = br.readLine().split(" ");
			
			int x = Integer.parseInt(tmpArray[1]);
			int y = Integer.parseInt(tmpArray[2]);
			
			if(tmpArray[0].equals("0")){
				set.union(x, y);
			}
			else {
				boolean result = set.isSameSet(x, y);
				if(result == true){
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
			}
		}
	}

}

class DisjointSet {
	private int n;
	private int[] p;
	private int[] rank;

	public DisjointSet(int n){
		this.n = n;

		p = new int[n + 1];
		rank = new int[n + 1];

		for(int i = 1; i <= n; i++){
			makeSet(i);
		}
	}

	private void makeSet(int x){
		p[x] = x;
		rank[x] = 0;
	}

	public void union(int x, int y){
		link (findSet(x), findSet(y));
	}

	private int findSet(int x){
		if(x != p[x]){
			p[x] = findSet( p[x]);
		}
		return p[x];
	}

	public boolean isSameSet(int x, int y){
		return findSet(x) == findSet(y);
	}

	private void link(int x, int y){
		if(rank[x] > rank[y]){
			p[y] = x;
		}
		else {
			p[x] = y;
			if(rank[x] == rank[y]){
				rank[y]++;
			}
		}
	}
}