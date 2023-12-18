import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		long INF = Long.MAX_VALUE;
		HashMap<Double, Integer> hm = new HashMap<Double, Integer>();
		HashMap<Double, Double> pair = new HashMap<Double, Double>();
		HashSet<Double> chk = new HashSet<Double>();
		int zero = 0;
		for(int i = 0; i < n; i++){
		    double a = sc.nextDouble();
		    double b = sc.nextDouble();
		    double key = 0;
		    if(a == 0 && b == 0){
		        zero++;
		        continue;
		    }
		    if(a == 0){
		        key = INF;
		    }else{
		        key = b/a;
		    }
		    hm.put(key, hm.getOrDefault(key, 0) + 1);
		    chk.add(key);
		    double other = 0;
		    if(a != 0) other = -a/b;
		    if(hm.containsKey(other)){
		        pair.put(key, other);
		        pair.put(other, key);
		    }
		}
		
		// 計算
		long result = 1;
		long MOD = 1000000007L;
		//System.out.println(hm.toString());
		//System.out.println(pair.toString());
		//System.out.println(chk.toString());
		for(Double key : hm.keySet()){
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
