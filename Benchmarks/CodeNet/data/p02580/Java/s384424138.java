import java.io.*;
import java.util.*;
class Main{
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//Buffered
		int t = 1;
		// t = Integer.parseInt(reader.readLine());
		// long[] list = Arrays.stream(reader.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
		for(int u = 0;u<t;u++){
			long[] list = Arrays.stream(reader.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
			long H = list[0];
			long W = list[1];
			long M = list[2];
			HashSet<String> hs = new HashSet<>();
			long[] rows = new long[(int)H];
			long[] cols = new long[(int)W];
			long rowmax = 0;
			long colmax = 0;
			ArrayList<Integer> maxrow = new ArrayList<>();
			ArrayList<Integer> maxcols = new ArrayList<>();
			for(int i = 0;i<M;i++){
				String[] lo = reader.readLine().split(" ");
				int h = Integer.parseInt(lo[0]);
				int w = Integer.parseInt(lo[1]);
				rows[h-1]++;
				cols[w-1]++;
				if(rows[h-1]==rowmax){
					maxrow.add(h-1);
				}
				else if(rows[h-1]>rowmax){
					maxrow = new ArrayList<>();
					maxrow.add(h-1);
					rowmax = rows[h-1];
				}
				if(cols[w-1]==colmax){
					maxcols.add(w-1);
				}
				else if(cols[w-1]>colmax){
					maxcols = new ArrayList<Integer>();
					maxcols.add(w-1);
					colmax = cols[w-1];
				}
				hs.add((h-1)+" "+(w-1));
			}
			/*System.out.println(Arrays.toString(rows));
			System.out.println(Arrays.toString(cols));
			System.out.println(maxrow);
			System.out.println(maxcols);*/
			long res = 0;
			for(int r:maxrow){
				for(int c:maxcols){
					long p = rows[r]+cols[c];
					if(!hs.contains(r+" "+c)){
						System.out.println((p));
						return;
					}
					res = p - 1;
				}
			}
			System.out.println(res);

		}
	
	}
	
}
class pair implements Comparable<pair>{
		long a = 0;
		int b = 0;
		public pair(long a,int b){
			this.a = a;
			this.b = b;
		}
		@Override
		public int compareTo(pair p){
			if(this.a == p.a) return -(Integer.compare(this.b,p.b));
			else return -(Long.compare(this.a,p.a));
		}
		@Override
		public String toString(){
			return a+" "+b;
		}
	}