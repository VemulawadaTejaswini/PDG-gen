import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static int[] fib;
	static int N=1001,V,d;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		fib=new int[1001];
		fib[0]=2;
		fib[1]=3;
		for(int i=0;i<fib.length;i++){
			fib(i);
		}		
		for(;cin.hasNext();){
			N=cin.nextInt();
			d=cin.nextInt();
			UnionFind u=new UnionFind(N);
			for(int i=0;i<N;i++){
				for(int j=i+1;j<N;j++){
					if(Math.abs(fib[i]-fib[j]) < d ){
						u.union(i,j);
					}
				}
			}
			System.out.println(u.num);
		}
		
		
	}
	static int fib(int i){
		if(fib[i]!=0)return fib[i];
		fib[i]=(fib[i-1]+fib[i-2])%N;
		
		return fib[i];
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
}