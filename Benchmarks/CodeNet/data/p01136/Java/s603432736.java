import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static class Sche{
		int pos;
		int time;
		long bit;
				
		public Sche(int pos, int time, long bit) {
			super();
			this.pos = pos;
			this.bit = bit;
			this.time = time;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			System.gc();
			
			ArrayList<LinkedList<Integer>> adj_list = new ArrayList<LinkedList<Integer>>(n);
			ArrayList<HashSet<Integer>> adj_set = new ArrayList<HashSet<Integer>>(n);
			
			for(int i = 0; i <= 31; i++){
				adj_list.add(new LinkedList<Integer>());
				adj_set.add(new HashSet<Integer>());
			}
			
			for(int i = 0; i < n; i++){
				final int times = sc.nextInt();
				
				for(int j = 0; j < times; j++){
					final int time = sc.nextInt();
					
					adj_list.get(time).add(i);
					adj_set.get(time).add(i);
				}
			}
			
			ArrayList<HashMap<Long, Boolean>> is_visited = new ArrayList<HashMap<Long,Boolean>>();
			for(int i = 0; i <= 31; i++){
				is_visited.add(new HashMap<Long, Boolean>());
			}
			
			LinkedList<Sche> queue = new LinkedList<Sche>();
			for(int i = 0; i < n; i++){
				queue.add(new Sche(i, 1, 1L << (n + i)));
			}
			
			while(!queue.isEmpty()){
				Sche sche = queue.poll();
				
				//System.out.println(sche.time + " " + sche.pos + " " + Long.toBinaryString(sche.bit));
				//System.out.println(adj_list.get(index));
				
				if(adj_set.get(sche.time).contains(sche.pos)){
					for(int next : adj_list.get(sche.time)){
						sche.bit |= (1L << next);
					}
				}
				
				if((sche.bit & ((1L << n) - 1)) == (1L << n) - 1){
					System.out.println(sche.time);
					break;
				}else if(sche.time > 30){
					System.out.println(-1);
					break;
				}
				
				if(is_visited.get(sche.time).containsKey(sche.bit)){
					continue;
				}else{
					is_visited.get(sche.time).put(sche.bit, true);
				}
				
				if(adj_set.get(sche.time).contains(sche.pos)){
					for(int next : adj_list.get(sche.time)){
						queue.addLast(new Sche(next, sche.time + 1, (sche.bit & (~(1L << (n + sche.pos)))) | (1L << (n + next))));
					}
				}else{
					queue.addLast(new Sche(sche.pos, sche.time + 1, sche.bit));					
				}
			}
		}
		
	}

}