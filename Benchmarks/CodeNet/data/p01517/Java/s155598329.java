import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int n;
	int[] pow;
	String[] names;
	HashSet<String>[] sets;

	@SuppressWarnings("unchecked")
	void run(){
		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			names=new String[n];
			pow=new int[n];
			sets=new HashSet[n];
			for(int j=0; j<n; j++){
				names[j]=sc.next();
				pow[j]=sc.nextInt();
				sets[j]=new HashSet<String>();
				int m=sc.nextInt();
				for(int i=0; i<m; i++){
					sets[j].add(sc.next());
				}
			}
			solve();
		}
	}

	long[] g;
	int[] _;
	int ans;

	void solve(){
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		for(int i=0; i<n; i++){
			map.put(names[i], i);
		}
		g=new long[n];
		for(int i=0; i<n; i++){
			for(String s : sets[i]){
				int j=map.get(s);
				g[i]|=1L<<j;
			}
		}
		// _:順番->ID
		_=new int[n];
		for(int i=0; i<n; i++){
			_[i]=i;
		}
		for(int j=0; j<n; j++){
			for(int i=j+1; i<n; i++){
				if(Long.bitCount(g[_[i]])<Long.bitCount(g[_[j]])){
					int t=_[i];
					_[i]=_[j];
					_[j]=t;
				}
			}
		}

		ans=0;
		mis(1, 1, pow[0]);
		println(ans+"");
	}

	void mis(int k, long choosed, int sum){
		if(k==n){
			// String c=Long.toBinaryString(choosed);
			// for(; c.length()<n; c="0"+c);
			// debug(c, sum);
			ans=max(ans, sum);
			return;
		}

		// debug(k, Long.toBinaryString(choosed));

		if((choosed&(g[k]|(1L<<k)))==0){
			mis(k+1, choosed|(1L<<k), sum+pow[k]);
			long rem=0;
			for(int i=k+1; i<n; i++){
				if((choosed&g[i])==0)
					rem|=g[i];
			}
			if((rem>>>k&1)==0){
				mis(k+1, choosed|(1L<<k), sum+pow[_[k]]);
				return;
			}

		}
		mis(k+1, choosed, sum);

		if(1!=2){
			return;
		}

		if((choosed&(g[k]|(1L<<k)))!=0){
			mis(k+1, choosed, sum);
			return;
		}

		long rem=0;
		for(int i=k+1; i<n; i++){
			if((choosed&g[i])==0)
				rem|=g[i];
		}

		if((rem>>k&1)==0){
			mis(k+1, choosed|(1L<<k), sum+pow[k]);
			return;
		}
		mis(k+1, choosed, sum);
		mis(k+1, choosed|(1L<<k), sum+pow[k]);
	}

	void mis_(int k, long choosed, int sum){
		if(k==n){
			// String c=Long.toBinaryString(choosed);
			// for(; c.length()<n; c="0"+c);
			// debug(c, sum);
			ans=max(ans, sum);
			return;
		}

		// debug(k, Long.toBinaryString(choosed));

		if((choosed&(g[_[k]]|(1L<<_[k])))==0){
			mis(k+1, choosed|(1L<<_[k]), sum+pow[_[k]]);
			long rem=0;
			for(int i=k+1; i<n; i++){
				if((choosed&g[_[i]])==0)
					rem|=g[_[i]];
			}
			if((rem>>_[k]&1)==0){
				mis(k+1, choosed|(1L<<_[k]), sum+pow[k]);
				return;
			}

		}
		mis(k+1, choosed, sum);
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}