import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static class UnionFind{
		int[] dat;
		
		// - -> root & size + -> not root
		public UnionFind(int n){
			dat = new int[n];
			Arrays.fill(dat, -1);
		}
		
		public int find(int x){
			if(dat[x] < 0){
				return x;
			}else{
				return dat[x] = find(dat[x]);
			}
		}
		
		public void union(int x, int y){
			final int s1 = find(x);
			final int s2 = find(y);
			
			if(s1 == s2){
				return;
			}else{
				if(s1 <= s2){
					dat[s1] += dat[s2];
					dat[s2] = s1;
				}else{
					dat[s2] += dat[s1];
					dat[s1] = s2;
				}
			}
		}
		
		public int size(int x){
			//System.out.println(Arrays.toString(dat));
			return -dat[find(x)];
		}
		
		public boolean same(int x, int y){
			return find(x) == find(y);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			ArrayList<LinkedList<Integer>> adj_list = new ArrayList<LinkedList<Integer>>(30);
			
			for(int i = 0; i <= 31; i++){
				adj_list.add(new LinkedList<Integer>());
			}
			
			for(int i = 0; i < n; i++){
				final int times = sc.nextInt();
				
				for(int j = 0; j < times; j++){
					final int time = sc.nextInt();
					
					adj_list.get(time).add(i);
				}
			}
			
			UnionFind uf = new UnionFind(n);
			
			boolean find = false;
			for(int time = 1; time <= 30; time++){
				boolean first = true;
				int pos = -1;
				
				for(int next : adj_list.get(time)){
					if(first){
						pos = next;
						first = false;
					}else{
						uf.union(pos, next);
					}
				}
				
				//System.out.println(uf.size(1));
				if(pos != -1 && uf.size(pos) >= n){
					System.out.println(time);
					find = true;
					break;
				}
			}
			
			if(!find){
				System.out.println(-1);
			}
		}
		
	}

}