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
			ArrayList<Data> pq = new ArrayList<Data>();
			ArrayDeque<Data> queue = new ArrayDeque<Data>();
			int[] tmpar = new int[n];
			tmpar[0] = n;
			queue.add(new Data(tmpar));
			while(!queue.isEmpty()) {
				Data tmp = queue.poll();
				StringBuilder sb = new StringBuilder();
				for(int i = 0; i < tmp.list.length; i++) {
					sb.append(" " + tmp.list[i]);
				}
				
				if(map.containsKey(sb.toString())) continue;
				map.put(sb.toString(), true);
				pq.add(tmp);
				
				for(int i = 0; i < tmp.list.length-1; i++) {
					IN:for(int j = i+1; j < tmp.list.length; j++) {
						int[] cp = Arrays.copyOf(tmp.list, tmp.list.length);
						cp[i]--;
						cp[j]++;
						if(cp[i] == 0) break;
						for(int k = 0; k < cp.length-1; k++) {
							if(cp[k] < cp[k+1]) continue IN;
						}
						queue.add(new Data(cp));
					}
				}
			}
			Collections.sort(pq);
			for(int k = 0; k < pq.size(); k++) {
				int[] xx = pq.get(k).list;
				System.out.print(xx[0]);
				for(int i = 1; i < xx.length; i++) {
					if(xx[i] == 0) break;
					System.out.print(" " + xx[i]);
				}
				System.out.println();
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
				if(this.list[i] - o.list[i] != 0) return  o.list[i]- this.list[i];
			}
			return 0;
			
			
			
		}
	}
	
}