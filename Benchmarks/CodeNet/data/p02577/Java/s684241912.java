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
			long[] list = Arrays.stream(reader.readLine().split("")).mapToLong(Long::parseLong).toArray();
			long sum = 0;
			for(long l:list){
				sum=(sum+l)%9;
			}
			System.out.println(sum==0?"Yes":"No");
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