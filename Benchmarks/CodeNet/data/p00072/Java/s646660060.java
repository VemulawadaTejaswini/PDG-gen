import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


public class Main {
	
	public static class Path implements Comparable<Path>{
		private int to,from,len;
		
		public Path(int f,int t,int l){
			from = f;
			to = t;
			len = l;
		}
		
		public int get_from(){
			return from;
		}
		
		public int get_to(){
			return to;
		}
		
		public int get_len(){
			return len;
		}
		
		public int compareTo(Path p){
			return this.get_len() - p.get_len(); 	
		}
		
		public String toString(){
			return "From " + from + ". To " + to + ". len " + len +".";
		}
	}

	static class UnionFind {
		final int[] tree;
		int num;

		public UnionFind(int n) {
			this.tree = new int[n];
			Arrays.fill(tree, -1);
			num = n;
		}

		// merge the set contains x and the set contains y
		void union(int x, int y) {
			x = root(x);
			y = root(y);
			if (x != y) {
				if (tree[x] < tree[y]) {
					x ^= y;
					y ^= x;
					x ^= y;
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

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n == 0){break;}
			int m = sc.nextInt();
			
			Queue<Path> queue = new PriorityQueue<Path>();
			
			for(int i = 0; i < m; i++){
				String strs[] = sc.next().split(",");
				queue.add(new Path(Integer.parseInt(strs[0]),Integer.parseInt(strs[1]),Integer.parseInt(strs[2])));
			}
			
			int sum = 0;
			UnionFind union = new UnionFind(n);
			
			while(union.num > 1){
				Path p = queue.poll();
				if(!union.find(p.get_from(), p.get_to())){
					union.union(p.get_to(), p.get_from());
					sum += p.get_len()/100-1;
				}
			}
			
			System.out.println(sum);
			
		}
	}
}