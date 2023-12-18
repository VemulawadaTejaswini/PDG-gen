import java.util.*;
public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    int N = sc.nextInt();
    int M = sc.nextInt();       
    UnionFind uf = new UnionFind(N);
    for(int i=0;i<M;i++){
      int A = sc.nextInt()-1;
      int B = sc.nextInt()-1;
      uf.union(A,B);
    }
    System.out.println(uf.maxSize());
}

static class UnionFind {
	
	int[] parent;
	int[] rank;
	
	public UnionFind(int size) {
		this.parent = new int[size];
		this.rank = new int[size];
		for(int i=0;i<size;i++){
          parent[i] = i;
          rank[i] = 1;
        }
	}
	
	public void union(int x, int y) {
		int xRoot = find(x);
		int yRoot = find(y);
		
		//xが属する木の方が大きい場合
		if (rank[xRoot] > rank[yRoot]) { 
			parent[yRoot] = xRoot; //yの親をxに更新
            rank[xRoot]+=rank[yRoot];
		} else if(rank[xRoot] < rank[yRoot]) {
			parent[xRoot] = yRoot;
            rank[yRoot]+=rank[xRoot];
		} else if (xRoot != yRoot){
			parent[yRoot] = xRoot;
			rank[xRoot]+=rank[yRoot]; //同じ高さの木がルートの子として着くから大きさ++;
		}
	}
	
	//引数の属する木のルートを返す
	public int find(int i) {
		if (i != parent[i]) {
			parent[i] = find(parent[i]);
		}
		return parent[i];
	}
	
	//同じ木に属しているか
	public boolean same(int x, int y) {
		return find(x) == find(y);
	}
    
    public int maxSize() {
      int max = 0;
      for(int i=0;i<rank.length;i++){
        //System.out.println(rank[i]);
        max = Math.max(max,rank[i]);
      }
      return max;
	}
  
    public void parList(){
      for(int i=0;i<parent.length;i++){
        System.out.println(i+"の親は"+parent[i]);
      }
      System.out.println();
    }
}
}
