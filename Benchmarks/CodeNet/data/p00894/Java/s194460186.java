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
				cc.set(1980, M, D, H, Min, 0);
				
				
				list.get(ID).add(cc);
			}
			int[] sum = new int[1000];
			ArrayList<Calendar> lg = list.get(0);
			for(int i = 1; i < list.size(); i++) {
				ArrayList<Calendar> lng = list.get(i);
				for(int j = 0; j < lg.size(); j += 2) {
					for(int k = 0; k < lng.size(); k += 2) {
						 long gA = lg.get(j).getTimeInMillis();
						 long gB = lg.get(j+1).getTimeInMillis();
						
						 long ngA = lng.get(k).getTimeInMillis();
						 long ngB = lng.get(k+1).getTimeInMillis();
						 
						 long gb = Math.max(gA, ngA);
						 long ngb = Math.min(gB,ngB);
						 
						 sum[i] += Math.max(0, ngb - gb);
					}
				}
			}
			
			
			int MAX = 0;
			for(int i = 1; i < 1000; i++) {
				MAX = Math.max(MAX, sum[i]);
			}
			System.out.println(MAX / 60000);
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