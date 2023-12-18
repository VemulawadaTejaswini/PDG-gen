import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

//No Story
public class Main{

	long gcd(long a, long b){
		if(b==0)return a;
		return gcd(b, a%b);
	}
	
	long pow(long a, long n){
		long res = 1;
		long x = a;
		while(n>0){
			if((n&1)>0)res *= x;
			x *= x;
			n = n>>1;
		}
		return res;
	}
	
	boolean prime(long x){
		for(long i=2;i*i<=x;i++)if(x%i==0)return false;
		return true;
	}
	
	int divN;
	int[] num;
	long[] d;
	Set<Long> set;
	Map<Long, Integer> ref;
	
	void dfs(int k, long res){
		if(k==divN){
			set.add(res);return;
		}
		int num = ref.get(d[k]);
		for(int i=0;i<=num;i++){
			dfs(k+1, res*pow(d[k], i));
		}
	}
	
	void count(long x){
		if(ref.containsKey(x)){
			ref.put(x, ref.get(x)+1);
		}
		else ref.put(x, 1);
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			long L = sc.nextLong();
			if(L==0)break;
			if(L==1){
				System.out.println(1);continue;
			}
			boolean prime = true;
			for(long i=2;i*i<=L;i++){
				if(L%i==0){
					prime = false;
					break;
				}
			}
			if(prime){
				System.out.println(2);continue;
			}
			ref = new TreeMap<Long, Integer>();
			num = new int[1000001];
			long l = L;
			long div = 2;
			divN = 0;
			SortedSet<Long> ss = new TreeSet<Long>();
			while(l>1){
				if(prime(l)){
					count(l);
					ss.add(l);
					l=1;
				}
				else if(l%div==0){
					ss.add(div);
					l/=div;
					count(div);
				}
				else div++;
			}
			d = new long[ss.size()];
			divN = 0;
			for(long x:ss){
				d[divN++] = x;
			}
			set = new HashSet<Long>();
			dfs(0, 1);
			int c = 0;
			for(long a:set){
				for(long b:set){
					long g = gcd(a, b);
					if(a<=b&&a/g*b==L){
						c++;
					}
				}
			}
			System.out.println(c);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}