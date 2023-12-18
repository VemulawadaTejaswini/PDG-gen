import java.util.*;

import javax.xml.crypto.Data;

import java.math.*;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			HashMap<String,Boolean> map = new HashMap<String,Boolean>();
			PriorityQueue<Data> pq = new PriorityQueue<Data>();
			ArrayDeque<Data> queue = new ArrayDeque<Data>();
			int[] tmpar = new int[n];
			tmpar[0] = n;
			queue.add(new Data(tmpar));
			while(!queue.isEmpty()) {
				Data tmp = queue.poll();
				StringBuilder sb = new StringBuilder();
				for(int i = 0; i < tmp.list.length; i++) {
					if(tmp.list[i] == 0) break;
					sb.append(" " + tmp.list[i]);
				}
				
				if(map.containsKey(sb.toString())) continue;
				map.put(sb.toString(), true);
				boolean ok = true;
				for(int i = 0; i < tmp.list.length-1; i++) {
					if(tmp.list[i] < tmp.list[i+1]){
						ok = false;
						break;
					}
					
				}
				if(ok)
				pq.add(tmp);
				
				for(int i = 0; i < tmp.list.length-1; i++) {
					int[] cp = Arrays.copyOf(tmp.list, tmp.list.length);
					if(cp[i] == 0) continue;
					cp[i+1]++;
					cp[i]--;
					queue.add(new Data(cp));
				}
				
				
				while(!pq.isEmpty()) {
					int[] xx = pq.poll().list;
					System.out.print(xx[0]);
					for(int i = 1; i < xx.length; i++) {
						if(xx[i] == 0) break;
						System.out.print(" " + xx[i]);
					}
					System.out.println();
				}
				
				
				
				
			}
		}
	}
		
	static class Data implements Comparable<Data>{
		int[] list;
		Data(int[] a) {
			list = a;
		}
		@Override
		public int compareTo(Data o) {

			for(int i = 0; i < o.list.length; i++) {
				if(o.list[i] == 0 && this.list[i] == 0) break;
				if(o.list[i] == 0) return 1;
				if(this.list[i] == 0) return -1;
			}
			
			for(int i = 0; i < o.list.length; i++) {
				if(this.list[i] - o.list[i] != 0) return this.list[i] - o.list[i];
			}
			return 0;
			
			
			
		}
	}
	
}