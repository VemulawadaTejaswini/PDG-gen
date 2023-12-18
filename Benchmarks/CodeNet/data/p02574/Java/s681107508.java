import java.io.*;
import java.util.*;
// i want to become the best
class Main{
	public static HashMap<Long,Integer> hmprod = new HashMap<>();
	public static HashMap<Long,Integer> hmlcm = new HashMap<>();
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		long[] list = Arrays.stream(reader.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
	    //System.out.println(list[1]*list[2]>=list[0]?"Yes":"No");
		long gcd = list[0];
		for(int i = 0;i<n;i++){
			if(i!=0) gcd = GCD(gcd,list[i]);
			lcm(list[i]);
			prod(list[i]);
		}
		if(hmprod.equals(hmlcm)) System.out.println("pairwise coprime");
		else if(gcd==1) System.out.println("setwise coprime");
		else System.out.println("not coprime");
	}
	static long GCD(long a, long b) 
    { 
      if (b == 0) 
        return a; 
      return GCD(b, a % b);  
    } 
	public static void prod(long a){
		for(long i = 2;i*i<=a;i++){
			if(a%i==0){
				int cnt = 0;
				while(a%i==0){
					a=a/i;
					cnt++;
				}
				hmprod.put(i,cnt+hmprod.getOrDefault(i,0));
			}
		}
		if(a!=1) hmprod.put(a,1+hmprod.getOrDefault(a,0)); 
	}
	public static void lcm(long a){
		for(long i = 2;i*i<=a;i++){
			if(a%i==0){
				int cnt = 0;
				while(a%i==0){
					a=a/i;
					cnt++;
				}
				hmlcm.put(i,Math.max(cnt,hmlcm.getOrDefault(i,0)));
			}
		}
		if(a!=1) hmlcm.put(a,Math.max(1,hmlcm.getOrDefault(a,0))); 
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
