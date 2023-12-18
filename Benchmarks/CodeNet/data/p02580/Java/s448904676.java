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
			long[][] grid = new long[(int)H][(int)W];
			long[] rows = new long[(int)H];
			long[] cols = new long[(int)W];
			for(int i = 0;i<M;i++){
				String[] lo = reader.readLine().split(" ");
				int h = Integer.parseInt(lo[0]);
				int w = Integer.parseInt(lo[1]);
				rows[h-1]++;
				cols[w-1]++;
				grid[h-1][w-1]++;
			}
			long max = 0;
			for(int i = 0 ;i<H;i++){
				for(int j = 0;j<W;j++){
					max = Math.max(max,rows[i]+cols[j] - grid[i][j]);
				}
			}
			System.out.println(max);
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