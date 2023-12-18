import java.util.Arrays;
import java.util.Scanner;

//Autumnal Illumination
public class Main{

	static boolean col(int[][] p, int[][] q){
		for(int i=0;i<4;i++){
			boolean right = true;
			for(int j=0;j<4;j++){
				int x1 = p[(j+1)%4][0]-p[j][0];
				int y1 = p[(j+1)%4][1]-p[j][1];
				int x2 = q[i][0]-p[j][0];
				int y2 = q[i][1]-p[j][1];
				if(x1*y2-x2*y1>0){
					right = false;
					break;
				}
			}
			if(right)return true;
		}
		return false;
	}

	static class UnionFind {
		final int[] tree;
		int num;
		public UnionFind(int n) {
			this.tree = new int[n];
			Arrays.fill(tree, -1);
			num=n;
		}

		// merge the set contains x and the set contains y
		void union(int x, int y) {
			x = root(x);
			y = root(y);
			if(x != y) {
				if(tree[x] < tree[y]) {
					x ^= y; y ^= x; x^= y;
				}
				tree[x] += tree[y];
				tree[y] = x;
				num--;
			}
		}
		// decide if x and y belong to the same set
		boolean find(int x, int y) {
			return root(x) == root(y);
		}
		int root(int x) {
			return tree[x] < 0 ? x : (tree[x] = root(tree[x]));
		}
		// return size of the set contains x
		int size(int x) {
			return -tree[root(x)];
		}
		// return the number of sets
		int getNum() {
			return num;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			while(n--!=0){
				int m = sc.nextInt();
				int[][][] p = new int[m][4][2];
				for(int i=0;i<m;i++){
					for(int j=0;j<4;j++){
						for(int k=0;k<2;k++){
							p[i][j][k]=sc.nextInt();
						}
					}
				}
				UnionFind u = new UnionFind(m);
				for(int i=0;i<m;i++){
					for(int j=i+1;j<m;j++){
						if(!u.find(i, j)&&col(p[i], p[j]))u.union(i, j);
					}
				}
				System.out.println(u.num);
			}
		}
	}
}