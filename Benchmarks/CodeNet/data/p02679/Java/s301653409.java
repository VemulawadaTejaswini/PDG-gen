import java.util.*;
import java.io.PrintWriter;
public class Main{
	static long mod=1000000007;
	static HashMap<String,String> bbb=new HashMap<>();
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<String,Integer> aumap=new HashMap<>();
		int zero=0;
		int az=0;
		int bz=0;
		for(int i=0; i<n; i++){
			long a=sc.nextLong();
			long b=sc.nextLong();
			if(a==0 && b==0){
				zero++;
			}else if(a==0){
				az++;
			}else if(b==0){
				bz++;
			}else{
				long c=0;
				//+
				if((a>0 && b>0) || (a<0 && b<0)){
					c=1;
				}
				a=Math.abs(a);
				b=Math.abs(b);
				long g=gcd(a,b);
				add(aumap,a,b,g,c);
			}
		}
		long ans=1;
		HashMap<String,Integer> end=new HashMap<>();
		for(String i:aumap.keySet()){
			if(end.containsKey(i)){
				continue;
			}
			int bum=((aumap.get(bbb.get(i))==null)?0:aumap.get(bbb.get(i)));
			ans=(ans*((pow(2,aumap.get(i))+pow(2,bum)-1)%mod))%mod;
			end.put(bbb.get(i),1);
		}
		ans=(ans*((pow(2,az)+pow(2,bz)-1)%mod))%mod;
		System.out.println((ans+zero-1+mod)%mod);
	}
	static void add(HashMap<String,Integer> aumap,long a,long b,long g,long c){
		long[] t={a/g,b/g,c};
		String au=cov(t);
		if(!bbb.containsKey(au)){
			long[] bb={b/g,a/g,(c==0)?1:0};
			String bu=cov(bb);
			bbb.put(au,bu);
		}
		if(aumap.containsKey(au)){
			aumap.put(au,aumap.get(au)+1);
		}else{
			aumap.put(au,1);
		}
	}
	static String cov(long[] t){
		StringBuilder re=new StringBuilder();
		for(int i=0; i<t.length; i++){
			re.append(t[i]);
		}
		return re.toString();
	}
	static long pow(long p,long q){
		long res=1;
		while(q>0){
			if((q & 1)==1){
				res*=p;
				res%=mod;
			}
			q>>=1;
			p*=p;
			p%=mod;
		}
		return res;
	}
	private static long gcd(long m, long n) {
		return n == 0 ? m: gcd(n, m % n);
    
	}
}
