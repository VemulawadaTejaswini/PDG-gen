import java.io.*;
import java.util.*;
// i want to become the best
class Main{
	public static HashMap<Long,Integer> hmprod = new HashMap<>();
	public static HashMap<Long,Integer> hmlcm = new HashMap<>();
	//public static long[] list = new 
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		long[] list = Arrays.stream(reader.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
	    //System.out.println(list[1]*list[2]>=list[0]?"Yes":"No");
		ArrayList<Integer> primes = new ArrayList<>();
		for(int i = 1;i<=1000;i++){
			if(prime(i)) primes.add(i);
		}
		int max = 0;
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int o:primes){
			for(long l:list){
				if(l%o==0){
					int p = hm.getOrDefault(o,0);
					p = p+1;
					hm.put(o,p);
					max = Math.max(max,p);
				}
			}
		}
		//System.out.println(primes);
		//System.out.println(max+"    max");
		if(max==1 || max==0) System.out.println("pairwise coprime");
		else if(max!=n) System.out.println("setwise coprime");
		else System.out.println("not coprime");
	}
	static boolean prime(int a){
		if(a==1 || a==0) return false;
		else if(a==2) return true;
		else if(a%2==0) return false;
		else{
			int j = 3;
			while(j*j<=a){
				if(a%j==0) return false;
				j=j+2;
			}
			return true;
		} 
	}
	static long GCD(long a, long b) 
    { 
    	long sum = a+b;
    	b = Math.max(b,a);
    	a = sum-b;
     while (b > 0)
    {
        long temp = b;
        b = a % b; // % is remainder
        a = temp;
    }
    return a;    } 
	public static void prod(long a){
		if(a%2==0){
			int j = 0;
			while(a%2==0){
				a=a/2;
				j++;
			}
			hmprod.put(2L,j+hmprod.getOrDefault(2L,0));
			hmlcm.put(2L,Math.max(j,hmlcm.getOrDefault(2L,0)));
		}
		for(long i = 3;i*i<=a;i=i+2){
			if(a%i==0){
				int cnt = 0;
				while(a%i==0){
					a=a/i;
					cnt++;
				}
				hmprod.put(i,cnt+hmprod.getOrDefault(i,0));
				hmlcm.put(i,Math.max(cnt,hmlcm.getOrDefault(i,0)));
			}
		}
		if(a!=1) hmprod.put(a,1+hmprod.getOrDefault(a,0));
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
