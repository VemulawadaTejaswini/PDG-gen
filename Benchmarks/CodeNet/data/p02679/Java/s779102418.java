import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		long INF = Long.MAX_VALUE;
		HashMap<Q, Integer> hm = new HashMap<Q, Integer>();
		HashMap<Q, Q> pair = new HashMap<Q, Q>();
		HashSet<Q> chk = new HashSet<Q>();
		int zero = 0;
		for(int i = 0; i < n; i++){
		    long a = sc.nextLong();
		    long b = sc.nextLong();
		    if(a == 0 && b == 0){
		        zero++;
		        continue;
		    }
		    Q q = new Q(a, b);
		    hm.put(q, hm.getOrDefault(q, 0) + 1);
		    chk.add(q);
		    Q other = new Q(-b, a);
		    if(hm.containsKey(other)){
		        pair.put(q, other);
		        pair.put(other, q);
		    }
		}
		
		// 計算
		long result = 1;
		long MOD = 1000000007L;
		//System.out.println(hm.toString());
		//System.out.println(pair.toString());
		//System.out.println(chk.toString());
		for(Q key : hm.keySet()){
		    if(!chk.contains(key)) continue;
		    int cnt1 = hm.get(key);
		    int cnt2 = 0;
		    if(pair.containsKey(key)){
		        cnt2 = hm.get(pair.get(key));
		        chk.remove(pair.get(key));
		        chk.remove(key);
		    }
		    if(cnt2 > 0){
		        result *= (pow(2, cnt1, MOD) + pow(2, cnt2, MOD) + MOD - 1)%MOD;
		    }else{
		        result *= pow(2, cnt1, MOD);
		    }
		    result %= MOD;
		}
		result = (result + MOD -1 + zero)%MOD;
		
		// 出力
		System.out.println(result);
	}
	
	public static class Scanner {
		private BufferedReader br; private StringTokenizer tok;
		public Scanner(InputStream is) throws IOException { br = new BufferedReader(new InputStreamReader(is));}
		private void getLine() throws IOException { while(!hasNext()) tok = new StringTokenizer(br.readLine());}
		private boolean hasNext() { return tok != null && tok.hasMoreTokens();}
		public String next() throws IOException { getLine(); return tok.nextToken();}
		public int nextInt() throws IOException { return Integer.parseInt(next());}
		public long nextLong() throws IOException { return Long.parseLong(next());}
		public double nextDouble() throws IOException { return Double.parseDouble(next());}
	}
	
	public static long pow(long a, long n, long MOD) {
		long res=1;
		while (n>0) {
			if ((n-n/2*2)==1) {
				res=(res*a)%MOD;
			}
			a=(a*a)%MOD;
			n>>=1;
		}
		return res%MOD;
	}

}

class Q implements Comparable<Q> {
	long a;
	long b;

	Q(long a, long b){
		if(b == 0){
			this.a = Long.MAX_VALUE;
			this.b = 0;
		}else if(a == 0){
			this.a = 0;
			this.b = 0;
		}else{
			long gcd = abs(gcd(a, b));
			int signum = (int)signum((double)a*b);
			this.a = signum*abs(a/gcd);
			this.b = abs(b/gcd);
		}
	}
	
	Q(long a){
		new Q(a, 1);
	}
	
	private long gcd(long x, long y){
		if(y == 0) return x;
		return gcd(y , x%y);
	}
	
	public double value(){
		if(this.b == 0){
			return this.a;
		}else{
			return (double)this.a/this.b;
		}
	}

	@Override
	public int compareTo(Q q) {
		return Double.compare(this.value(), q.value());
	}

	@Override
	public boolean equals(Object obj){
		if(obj == null) return false;
		if(this == obj) return true;
		if(this.getClass() != obj.getClass()) return false;

		Q q = (Q)obj;
		return this.a == q.a && this.b == q.b;
	}

	@Override
	public int hashCode(){
		int hc = 17;
		hc = 31 * hc + Long.hashCode(this.a);
		hc = 31 * hc + Long.hashCode(this.b);
		return hc;
	}

	public String toString() {
		return "(" + a + ", " + b + ")";
	}
}

