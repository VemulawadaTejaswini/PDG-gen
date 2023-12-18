import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.util.Calendar.Builder;



public class Main {
	static int INF = 2 << 27;
	public static void main(String[] args) {	
		//FastScanner sc = new FastScanner();
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			ArrayList<ArrayList<Calendar>> list = new ArrayList<ArrayList<Calendar>>();
			for(int i = 0; i < 1000; i++) list.add(new ArrayList<Calendar>());
			for(int i = 0; i < n; i++) {
				String MMDD = sc.next();
				int M = Integer.parseInt(MMDD.substring(0, 2));
				int D = Integer.parseInt(MMDD.substring(3, 5));
			
				String HHMM = sc.next();
				int H = Integer.parseInt(HHMM.substring(0, 2));
				int Min = Integer.parseInt(HHMM.substring(3, 5));
			
				sc.next();
			
				int ID = Integer.parseInt(sc.next());
				
				Builder c = new Calendar.Builder();
				Calendar cc = c.build();
				cc.set(2000, M, D, H, Min, 0);
				
				
				list.get(ID).add(cc);
			}
			PriorityQueue<Data> q = new PriorityQueue<Data>();
			int[] sum = new int[1000];
			Data[] state = new Data[1000];
			for(int i = 0; i < list.size(); i++) {
				ArrayList<Calendar> l = list.get(i);
				for(int j = 0; j < l.size(); j += 2) {
					Calendar a = l.get(j);
					Calendar b = l.get(j+1);
					Date aa = a.getTime();
					Date bb = b.getTime();
					q.add(new Data(i,aa.getTime(),bb.getTime()));
				}
			}
			while(!q.isEmpty()) {
				Data tmp = q.poll();
				for(int i = 0; i < state.length; i++) {
					if(state[i] != null) {
						if(state[i].Out <= tmp.In) state[i] = null;
					}
				}
				state[tmp.ID] = tmp;
				if(tmp.ID == 0) {
					for(int i = 0; i < state.length; i++) {
						if(state[i] == null) continue;
						int stA = (int)state[i].In;
						int enA = (int)state[i].Out;
						int stB = (int)state[0].In;
						int enB = (int)state[0].Out;
						stA = Math.max(stA, stB);
						enA = Math.min(enA, enB);
						if(stA < enA) {
							sum[i] += (enA - stA) / 60000;
						}
					}
				}
			}
			int MAX = 0;
			for(int i = 1; i < 1000; i++) {
				MAX = Math.max(MAX, sum[i]);
			}
			System.out.println(MAX);
			
			
		}
	}
	static class Data implements Comparable<Data> {
		int ID;
		long In;
		long Out;
		Data(int id, long a, long b) {
			ID = id;
			In = a;
			Out = b;
		}
		@Override
		public int compareTo(Data o) {
			if(this.In == o.In) {
				if(this.Out == o.Out) return this.ID - o.ID;
				return (int)(this.Out - o.Out);
			}
			return (int)(this.In - o.In);
			
		}
	}
}