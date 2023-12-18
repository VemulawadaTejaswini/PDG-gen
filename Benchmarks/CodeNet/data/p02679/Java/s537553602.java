import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
static class NumberTheoryUtils {
	private long MOD = (long)(1e9 + 7);
	long[]fact, inverseFact;
	boolean factsMade = false;
	public long gcd(long a, long b) {
		if(b == 0)return a;
		return gcd(b, a%b);
	}
	public int gcd(int a, int b) {
		if(b == 0)return a;
		return gcd(b, a%b);
	}
	public long lcd(long a, long b) {
		return a * b / gcd(a, b);
	}
	public int lcm(int a, int b) {
		return (int) 1L * a * b / gcd(a, b);
	}
	public int[] getLPFArray(int maxLength) {
		int[]lpf = new int[maxLength+5];
		for(int i=2; i<=maxLength; i++) {
			if(lpf[i] == 0) {
				for(int j=i; j<=maxLength; j+=i) {
					if(lpf[j] == 0) {
						lpf[j] = i;
					}
				}
			}
		}
		return lpf;
	}
	public boolean[]getSieve(int maxLength){
		boolean[]isPrime = new boolean[maxLength+5];
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		for(int i=2; i<=maxLength; i++) {
			if(isPrime[i]) {
				for(int j=2*i; j<=maxLength; j+=i) {
					if(isPrime[j]) {
						isPrime[j] = false;
					}
				}
			}
		}
		return isPrime;
	}
	public void setMod(long MOD) {
		this.MOD = MOD;
	}
	public long powerModulo(long base, long exponent) {
		if(exponent == 0)return 1L;
		long tempValue = powerModulo(base, exponent / 2L);
		long res = (tempValue * tempValue) % MOD;
		if(exponent % 2 != 0)res = (res * base) % MOD;
		return res;
	}
	public long inverseModulo(long value) {
		return this.powerModulo(value, MOD - 2L);
	}
	public long nCr(int n, int r) {
		if(n < r || n < 0 || r < 0)return 0L;
		return (((fact[n] * inverseFact[n-r]) % MOD) * inverseFact[r]) % MOD;
	}
	
	public long[]getFactorialsModulo(int maxLength){
		this.fact = new long[maxLength];
		fact[0] = 1L;
		for(int i=1; i<maxLength; i++) {
			fact[i] = (fact[i-1] * i) % MOD;
		}
		this.factsMade = true;
		return fact;
	}
	public long[]getInverseFactorialsModulo(int maxLength){
		this.inverseFact = new long[maxLength];
		if(!this.factsMade) {
			this.getFactorialsModulo(maxLength);
		}
		for(int i=0; i<maxLength; i++) {
			inverseFact[i] = this.inverseModulo(fact[i]);
		}
		return inverseFact;
	}
	public TreeMap<Integer, Integer> getPrimeFactors(long n){
		TreeMap<Integer, Integer> answer = new TreeMap<Integer, Integer>();
		int twoCount = 0;
		while(n % 2 == 0) {
			n /= 2;
			twoCount++;
		}
		if(twoCount > 0)answer.put(2, twoCount);
		for(int i=3; 1L*i*i<=n; i+=2) {
			int iCount = 0;
			while(n % i == 0) {
				n /= i;
				iCount++;
			}
			if(iCount > 0) {
				answer.put(i, iCount);
			}
		}
		return answer;
	}
	public long eulerTotientFunctionForSingleValue(long n) {
		// Complexity O(sqrt(n))
		long result = n;
		for(int i=2; 1L*i*i <= n; i++) {
			if(n % i == 0) {
				while(n % i == 0) {
					n /= i;
				}
				result -= result / i;
			}
		}
		if(n > 1) {
			result -= result / n;
		}
		return result;
	}
	public int[]eulerTotientFunctionForRange(int n){
		int[]phi = new int[n+1];
		for(int i=1; i<=n; i++) {
			phi[i] = i;
		}
		for(int i=2; i<=n; i++) {
			if(phi[i] == i) {
				for(int j=i; j<=n; j+=i) {
					phi[j] -= phi[j] / i;
				}
			}
		}
		return phi;
	}
	public long addModulo(long a, long b) {
		return (a + b) % MOD;
	}
	public long multiplyModulo(long a, long b) {
		return ((a % MOD) * (b % MOD)) % MOD;
	}
	public long subtractModulo(long a, long b) {
		return (a - b + MOD) % MOD;
	}
	public long divideModulo(long a, long b) {
		return a * this.inverseModulo(b);
	}
}
static class sardine{
	long deliciousness, fragrantness;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (a ^ (a >>> 32));
		result = prime * result + (int) (b ^ (b >>> 32));
		result = prime * result + sign;
		return result;
	}
	public sardine() {}
	public sardine(long a, long b, int type) {
		this.a = a;
		this.sign = type;
		this.b = b;
	}
	@Override
	public boolean equals(Object obj) {
		sardine cur = (sardine)obj;
		return (cur.a == this.a && cur.b == this.b && cur.sign == this.sign);
	}
	sardine(long deliciousness, long fragrantness){
		this.deliciousness = deliciousness;
		this.fragrantness = fragrantness;
		this.a = deliciousness;
		this.b = fragrantness;
		if(a == 0 && b == 0) {}
		else if(b == 0) {
			a = 1;
			b = 0;
		}else if(a == 0) {
			a = 0;
			b = 1;
		}else {
			if((a < 0 && b > 0) || (a > 0 && b < 0))sign = -1;
			else sign = 1;
			a = Math.abs(a);
			b = Math.abs(b);
			long g = ntu.gcd(a, b);
			a /= g;
			b /= g;
		}
	}
	
	long a, b;
	int sign;
}
public static void main(String[] args){

   new Thread(null, null, "Anshum Gupta", 99999999) {
        public void run() {
            try {
                solve();
            } catch(Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }.start();
}
static final long mxx = (long)(1e18+5);
static final int mxN = (int)(1e6);
static final int mxV = (int)(1e6), log = 18;
static long mod = (long)(1e9+7); //998244353;//̇
static final int INF = (int)1e9;
static boolean[]vis;
static ArrayList<ArrayList<Integer>> adj;
static int n, m, k, q, h, w;
static int[]dis, par;
static sardine[]arr;
static NumberTheoryUtils ntu;
public static void solve() throws Exception {
	   // solve the problem here
		s = new MyScanner();
   		out = new PrintWriter(new BufferedOutputStream(System.out), true);
//	   		out = new PrintWriter("output.txt");
        int tc = 1;//s.nextInt();
        ntu = new NumberTheoryUtils();
        while(tc-- > 0){
        	n = s.nextInt();
        	arr = new sardine[n];
        	ConcurrentHashMap<sardine, Integer> mp = new ConcurrentHashMap<sardine, Integer>();
        	long ans = 1;
        	for(int i=0; i<n; i++) {
        		arr[i] = new sardine(s.nextLong(), s.nextLong());
        		mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        	}
        	for(Map.Entry<sardine, Integer> es : mp.entrySet()) {
        		sardine cur = es.getKey();
        		sardine inverse = new sardine(cur.b, cur.a, -1*cur.sign);
        		if(es.getValue() == 0)continue;
        		long inverseCount = mp.getOrDefault(inverse, 0);
        		ans = ntu.multiplyModulo(ans, ntu.addModulo(ntu.powerModulo(2, es.getValue()),
        				ntu.powerModulo(2, inverseCount))-1);
        		mp.put(cur, 0);
        		mp.put(inverse, 0);
        	}
        	out.println(ntu.subtractModulo(ans, 1));
        } 
           
        out.flush();
        out.close();
}


public static PrintWriter out;
public static MyScanner s;
static class MyScanner {

    BufferedReader br;
    StringTokenizer st;

    public MyScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    public MyScanner(String fileName) {
    	try {
			br = new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() { return Integer.parseInt(next()); }
    long nextLong() { return Long.parseLong(next()); }
    double nextDouble() { return Double.parseDouble(next()); }
    int[] nextIntArray(int n){
    	int[]a = new int[n];
    	for(int i=0; i<n; i++) {
    		a[i] = this.nextInt();
    	}
    	return a;
    }
    long[] nextlongArray(int n) {
    	long[]a = new long[n];
    	for(int i=0; i<n; i++) {
    		a[i] = this.nextLong();
    	}
    	return a;
    }
    Integer[] nextIntegerArray(int n){
    	Integer[]a = new Integer[n];
    	for(int i=0; i<n; i++) {
    		a[i] = this.nextInt();
    	}
    	return a;
    }
    Long[] nextLongArray(int n) {
    	Long[]a = new Long[n];
    	for(int i=0; i<n; i++) {
    		a[i] = this.nextLong();
    	}
    	return a;
    }
    char[][] next2DCharArray(int n, int m){
    	char[][]arr = new char[n][m];
    	for(int i=0; i<n; i++) {
    		arr[i] = this.next().toCharArray();
    	}
    	return arr;
    }
    ArrayList<ArrayList<Integer>> readUndirectedUnweightedGraph(int n, int m) {
    	ArrayList<ArrayList<Integer>>adj = new ArrayList<ArrayList<Integer>>();
    	for(int i=0; i<=n; i++)adj.add(new ArrayList<Integer>());
    	for(int i=0; i<m; i++) {
    		int u = s.nextInt();
    		int v = s.nextInt();
    		adj.get(u).add(v);
    		adj.get(v).add(u);
    	}
    	return adj;
    }
    ArrayList<ArrayList<Integer>> readDirectedUnweightedGraph(int n, int m) {
    	ArrayList<ArrayList<Integer>>adj = new ArrayList<ArrayList<Integer>>();
    	for(int i=0; i<=n; i++)adj.add(new ArrayList<Integer>());
    	for(int i=0; i<m; i++) {
    		int u = s.nextInt();
    		int v = s.nextInt();
    		adj.get(u).add(v);
    	}
    	return adj;
    }
    String nextLine(){
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}

 
}
