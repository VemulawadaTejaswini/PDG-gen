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
		hoge();
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

	void hoge(){
		if(1==1)return;
		n=10;
		g=new long[n];
		pow=new int[n];
		Random rand=new Random(1);
		for(int t=0; t<100; t++){
			int i=rand.nextInt(n);
			int j=rand.nextInt(n);
			if(i!=j){
				g[i]|=1L<<j;
				g[j]|=1L<<i;
			}
		}
		for(int i=0; i<n; i++){
			String s=Long.toBinaryString(g[i]);
			for(; s.length()<n; s="0"+s);
			debug(s);
		}
		mis(0, 0, 0, 0);
	}

	long[] g;
	long[] memo;
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

		for(int i=0; i<n; i++){
			String s=Long.toBinaryString(g[i]);
			for(; s.length()<n; s="0"+s);
			// debug(s);
		}

		ans=0;
		memo=new long[n];
		for(int i=n-2; i>=0; i--){
			memo[i]=memo[i+1]|g[i+1];
		}
		mis(1, 1|g[0], 1, pow[0]);
		// debug(ans);
		println(ans+"");
	}

	void mis(int k, long covered, long choosed, int sum){
		if(k==n){
			String c=Long.toBinaryString(choosed);
			for(; c.length()<n; c="0"+c);
			// debug(c, sum);
			ans=max(ans, sum);
			return;
		}

		// debug(k, Long.toBinaryString(covered), Long.toBinaryString(choosed));

		// long choosed
		// long
		// 今まで使った頂点とこれから使うかどうか決める頂点のどれとも隣接していない頂点はかならず使う

		// covered & (g[k] | (1L<<k)) != 0
		// 使わん
		// (covered | memo[k]) & (g[k] | (1L<<k)) == 0

		// Aの時，aだけ
		// Bの時，bだけ
		// それ以外，aとb

		if((choosed&(g[k]|(1L<<k)))!=0){
			// つかわん
			mis(k+1, covered, choosed, sum);
			return;
		}
		
		long rem=0;
		for(int i=k+1;i<n;i++){
			// iが現状使えたら
			if	((choosed&g[i])==0)
//				if((covered>>i&1)==0)
			rem|=g[i];
		}
		
		// [0, n)-[0, k+1) = [k+1, n)
		long korekara=((1L<<n)-1)^((1L<<(k+1))-1);
//		if(((choosed|korekara)&(g[k]|(1L<<k)))==0){
		if((rem>>k&1)==0){
			// mis(k+1, covered|(g[k]|(1L<<k)), choosed|(1L<<k), sum+pow[k]);
			mis(k+1, covered|(g[k]), choosed|(1L<<k), sum+pow[k]);
			return;
		}
		mis(k+1, covered, choosed, sum);
		// mis(k+1, covered|(g[k]|(1L<<k)), choosed|(1L<<k), sum+pow[k]);
		mis(k+1, covered|(g[k]), choosed|(1L<<k), sum+pow[k]);

		// 両方か，片方か

		// g[k]

		// mis(k+1, choosed, temp|(1L<<k));
		// mis(k+1, choosed|(1L<<k), temp|g[k]);

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
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}