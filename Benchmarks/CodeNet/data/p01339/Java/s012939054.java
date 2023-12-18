import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Alien's Counting
public class Main{

	long MOD = 1000000007, res;
	int n, m, ID;
	List<Integer>[] e, rev, vs;
	List<Integer> visit;
	boolean[] u;
	int[] scc, out;
	
	void dfs(int k){
		if(u[k])return;
		u[k] = true;
		for(int x:e[k])dfs(x);
//		System.out.println("ORDER:"+k);
		visit.add(k);
	}
	void rdfs(int k){
		if(u[k])return;
		u[k] = true;
		scc[k] = ID;
		vs[ID].add(k);
		for(int x:rev[k])rdfs(x);
	}
	long modpow(long x, long n, long MOD){
		long res = 1, v = x;
		while(n>0){
			if((n&1)>0)res = res*v%MOD;
			v = v*v%MOD;
			n>>=1;
		}
		return res;
	}
	
	long f(int k){
		u[k] = true;
		long r = 2;
		List<Integer> l = new ArrayList<Integer>();
		for(int x:vs[k])for(int y:rev[x]){
			if(u[scc[y]])continue;
			u[scc[y]] = true;
			l.add(scc[y]);
		}
		while(!l.isEmpty()){
			r+=((modpow(2, l.size(), MOD)-1+MOD)%MOD);
			r%=MOD;
			List<Integer> next = new ArrayList<Integer>();
			for(int v:l){
				for(int x:vs[v])for(int y:rev[x]){
					if(u[scc[y]])continue;
					u[scc[y]] = true;
					next.add(scc[y]);
				}
			}
			l = next;
		}
//		System.out.println("K:"+k+" r:"+r);
		return r;
	}
	
	@SuppressWarnings("unchecked")
	void run(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); m = sc.nextInt();
		e = new List[n]; rev = new List[n]; vs = new List[n];
		for(int i=0;i<n;i++){
			e[i] = new ArrayList<Integer>(); rev[i] = new ArrayList<Integer>(); vs[i] = new ArrayList<Integer>();
		}
		while(m--!=0){
			int s =  sc.nextInt()-1, d = sc.nextInt()-1;
			e[s].add(d); rev[d].add(s);
		}
		visit = new ArrayList<Integer>();
		u = new boolean[n];
		for(int i=0;i<n;i++)dfs(i);
		scc = new int[n];
		ID = 0;
		Arrays.fill(u, false);
		for(int i=n-1;i>=0;i--){
			int x = visit.get(i);
//			System.out.println("X:"+x);
			if(u[x])continue;
			rdfs(x);
			ID++;
		}
//		System.out.println(ID);
		res = 1;
		out = new int[ID];
		for(int i=0;i<ID;i++)for(int x:vs[i])for(int y:e[x])if(scc[x]!=scc[y])out[i]++;
//		debug(scc); debug(out);
		Arrays.fill(u, false);
		for(int i=0;i<ID;i++)if(out[i]==0)res=res*f(i)%MOD;
		System.out.println(res);
	}
	
	void debug(Object...o){
		System.out.println(Arrays.deepToString(o));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}