import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	static Scanner scn = new Scanner(System.in);
	static FastScanner sc = new FastScanner();
	static Mathplus mp = new Mathplus();
	static int mod = 1000000007;
	static long modmod = (long)mod * mod;
	static long inf = (long)1e17;
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	static int[] dx8 = {-1,-1,-1,0,0,1,1,1};
	static int[] dy8 = {-1,0,1,-1,1,-1,0,1};
	static char[] dc = {'R','D','L','U'};
	static String sp = " ";
	public static void main(String[] args) {
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int T = sc.nextInt();
		int U = sc.nextInt();
		int V = sc.nextInt();
		int L = sc.nextInt();
		int[] D = sc.nextInts(N);
		int slow = 0; //Um/sで走る距離
		int fast = 0; //Vm/sで走る距離
		int[] P = new int[L];
		for(int i=0;i<N;i++) {
			P[D[i]] = 1;//ニンジンのある位置
		}
		boolean isfast = false;
		int run_end = 0;
		int carrot = 0;
		for(int i=0;i<L;i++) {
			if(i==run_end)isfast = false;
			if(P[i]==1) {
				if(isfast) {
					if(carrot==K) run_end = i + T * V;
					else carrot++;
				}
				else {
					isfast = true;
					run_end = i + T * V;
				}
			}
			if(!isfast&&carrot>0) {
				isfast = true;
				run_end = i + T * V;
				carrot--;
			}
			if(isfast)fast++;
			else slow++;
		}
		System.out.println((double)fast/V+(double)slow/U);
	}

}

class FastScanner {
    private final java.io.InputStream in = System.in;
    private final byte[] b = new byte[1024];
    private int p = 0;
    private int bl = 0;
    private boolean hNB() {
        if (p<bl) {
            return true;
        }else{
            p = 0;
            try {
                bl = in.read(b);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (bl<=0) {
                return false;
            }
        }
        return true;
    }
   
	private int rB() { if (hNB()) return b[p++]; else return -1;}
    private static boolean iPC(int c) { return 33 <= c && c <= 126;}
    private void sU() { while(hNB() && !iPC(b[p])) p++;}
    public boolean hN() { sU(); return hNB();}
    public String next() {
        if (!hN()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = rB();
        while(iPC(b)) {
            sb.appendCodePoint(b);
            b = rB();
        }
        return sb.toString();
    }
    public char nextChar() {
    	return next().charAt(0);
    }
    public long nextLong() {
        if (!hN()) throw new NoSuchElementException();
        long n = 0;
        boolean m = false;
        int b = rB();
        if (b=='-') {
            m=true;
            b=rB();
        }
        if (b<'0'||'9'<b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0'<=b&&b<='9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1||!iPC(b)){
                return (m?-n:n);
            }else{
                throw new NumberFormatException();
            }
            b = rB();
        }
    }
    public int nextInt() {
        if (!hN()) throw new NoSuchElementException();
        long n = 0;
        boolean m = false;
        int b = rB();
        if (b == '-') {
            m = true;
            b = rB();
        }
        if (b<'0'||'9'<b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0'<=b&&b<='9') {
                n *= 10;
                n += b-'0';
            }else if(b==-1||!iPC(b)){
                return (int) (m?-n:n);
            }else{
                throw new NumberFormatException();
            }
            b = rB();
        }
    }
    public int[] nextInts(int n) {
    	int[] a = new int[n];
    	for(int i=0;i<n;i++) {
    		a[i] = nextInt();
    	}
    	return a;
    }
    public int[] nextInts(int n,int s) {
    	int[] a = new int[n+s];
    	for(int i=s;i<n+s;i++) {
    		a[i] = nextInt();
    	}
    	return a;
    }
    public long[] nextLongs(int n, int s) {
    	long[] a = new long[n+s];
    	for(int i=s;i<n+s;i++) {
    		a[i] = nextLong();
    	}
    	return a;
	}
    public long[] nextLongs(int n) {
    	long[] a = new long[n];
    	for(int i=0;i<n;i++) {
    		a[i] = nextLong();
    	}
    	return a;
    }
    public int[][] nextIntses(int n,int m){
    	int[][] a = new int[n][m];
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<m;j++) {
    			a[i][j] = nextInt();
    		}
    	}
    	return a;
    }
    
    public String[] nexts(int n) {
    	String[] a = new String[n];
    	for(int i=0;i<n;i++) {
    		a[i] = next();
    	}
    	return a;
    }
    void nextIntses(int n,int[] ...m) {
    	int l = m[0].length;
    	for(int i=0;i<l;i++) {
    		for(int j=0;j<m.length;j++) {
    			m[j][i] = nextInt();
    		}
    	}
    }
    void nextLongses(int n,long[] ...m) {
    	int l = m[0].length;
    	for(int i=0;i<l;i++) {
    		for(int j=0;j<m.length;j++) {
    			m[j][i] = nextLong();
    		}
    	}
    }
    
   
   
}


class Mathplus{
	long mod = 1000000007;
	long[] fac;
	long[] revfac;
	long[][] comb;
	long[] pow;
	long[] revpow;
	boolean isBuild = false;
	boolean isBuildc = false;
	boolean isBuildp = false;
	int mindex = -1;
	int maxdex = -1;
	int graydiff = 0;
	int graymark = 0;

	int LIS(int N, int[] a) {
		int[] dp = new int[N+1];
		Arrays.fill(dp,(int)mod);
		for(int i=0;i<N;i++) {
			int ok = 0;
			int ng = N;
			while(ng-ok>1) {
				int mid = (ok+ng)/2;
				if(dp[mid]<a[i])ok = mid;
				else ng = mid;
			}
			dp[ok+1] = a[i];
		}
		int ok = 0;
		for(int i=1;i<=N;i++) {
			if(dp[i]<mod)ok=i;
		}
		return ok;
	}

	public Integer[] Ints(int n, int i) {
		Integer[] ret = new Integer[n];
		Arrays.fill(ret,i);
		return ret;
	}
	public Long[] Longs(int n, long i) {
		Long[] ret = new Long[n];
		Arrays.fill(ret,i);
		return ret;
	}

	public boolean nexperm(int[] p) {
		int n = p.length;
		for(int i=n-1;i>0;i--) {
			if(p[i-1]<p[i]) {
				int sw = n;
				for(int j=n-1;j>=i;j--) {
					if(p[i-1]<p[j]) {						
						sw = j;
						break;
					}
				}
				
				int tmp = p[i-1];
				p[i-1] = p[sw];
				p[sw] = tmp;
				int[] r = new int[n];
				for(int j=i;j<n;j++) {
					r[j] = p[n-1-j+i];
				}
				for(int j=i;j<n;j++) {
					p[j] = r[j];
				}
				return true;
			}
		}
		return false;
	}

	public int[] makeperm(int n) {
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = i;
		}
		return a;
	}

	int color(int[][] diff,int N) {

		int[] val = new int[1<<N];
		val[0] = 1;
		for(int i=0;i<(1<<N);i++) {
			for(int j=0;j<N;j++) {
				if(contains(i,j)) {
					if(val[bitremove(i,j)]==1) {
						boolean b = true;
						for(int k=0;k<N;k++) {
							if(contains(i,k)&&diff[j][k]==1) {
								b = false;
							}
						}
						if(b)val[i] = 1;
					}
					break;
				}
			}
		}
		int[] dp = new int[1<<N];
		Arrays.fill(dp,N+1);;
		dp[0] = 0;
		for(int i=0;i<(1<<N);i++) {
			for(int j=i;j>0;j=(j-1)&i) {
				if(val[j]==1)dp[i]=Math.min(dp[i],dp[i^j]+1);
			}
		}
		return dp[(1<<N)-1];
	}

	

	public void timeout() throws InterruptedException {
		Thread.sleep(10000);
	}

	public int gray(int i) {
		for(int j=0;j<20;j++) {
			if(contains(i,j)) {
				graydiff = j;
				if(contains(i,j+1))graymark=-1;
				else graymark = 1;
				break;
			}
		}
		return i ^ (i>>1);
			

	}

	public void hakidashi(long[] A) {
		Arrays.sort(A);
		int N = A.length;
		int[] index = new int[61];
		for(int i=0;i<=60;i++){
			index[i] = -1;
		}
		int searching = 60;
		int [] used = new int[N];
		while(searching>=0){
			boolean b = true;
			for(int i=N-1;i>=0;i--){
				for(int j=60;j>searching;j--){
					if((A[i]>>j&1)==1){
						if(i!=index[j]&&index[j]!=-1){
							A[i] ^= A[index[j]];
							//System.out.println(i+" changed by " + index[j]);
							//System.out.println(A[i]);
						}
					}
				}
				if((A[i]>>searching&1)==1&&used[i]==0){
					//System.out.println("find " + searching+" is "+i);
					index[searching] = i;
					searching--;
					used[i] = 1;
					b = false;
					if(searching==-1){
						searching = 0;
					}
				}
			}
			if(b){
				searching--;
			}

		}

		for(int i=N-1;i>=0;i--){
			for(int j=60;j>=searching;j--){
				if((A[i]>>j&1)==1){
					if(i!=index[j]&&index[j]!=-1){
						A[i] ^= A[index[j]];
					}
				}
			}
		}

		Arrays.sort(A);
		
	}

	public void printjudge(boolean b, String y, String n) {
		System.out.println(b?y:n);
	}
	public void printYN(boolean b) {
		printjudge(b,"Yes","No");
	}
	public void printyn(boolean b) {
		printjudge(b,"yes","no");
	}
	
	public void reverse(int[] x) {
		int[] r = new int[x.length];
		for(int i=0;i<x.length;i++)r[i] = x[x.length-1-i];
		for(int i=0;i<x.length;i++)x[i] = r[i];
	}
	public void reverse(long[] x) {
		long[] r = new long[x.length];
		for(int i=0;i<x.length;i++)r[i] = x[x.length-1-i];
		for(int i=0;i<x.length;i++)x[i] = r[i];
	}

	
	
	
	public boolean dcross(double ax, double ay, double bx, double by, double cx, double cy, double dx, double dy) {
		double ta = (cx - dx) * (ay - cy) + (cy - dy) * (cx - ax);
		double tb = (cx - dx) * (by - cy) + (cy - dy) * (cx - bx);
		double tc = (ax - bx) * (cy - ay) + (ay - by) * (ax - cx);
		double td = (ax - bx) * (dy - ay) + (ay - by) * (ax - dx);
		return((tc>=0&&td<=0)||(tc<=0&&td>=0))&&((ta>=0&&tb<=0)||(ta<=0&&tb>=0));
	}

	void buildFac(){
		fac = new long[10000003];
		revfac = new long[10000003];
		fac[0] = 1;
		for(int i=1;i<=10000002;i++){
			fac[i] = (fac[i-1] * i)%mod;
		}
		revfac[10000002] = rev(fac[10000002])%mod;
		for(int i=10000001;i>=0;i--) {
			revfac[i] = (revfac[i+1] * (i+1))%mod;
		}
		isBuild = true;
	}
	void buildFacn(int n){
		fac = new long[n+1];
		revfac = new long[n+1];
		fac[0] = 1;
		for(int i=1;i<=n;i++){
			fac[i] = (fac[i-1] * i)%mod;
		}
		revfac[n] = rev(fac[n])%mod;
		for(int i=n-1;i>=0;i--) {
			revfac[i] = (revfac[i+1] * (i+1))%mod;
		}
		isBuild = true;
	}
	public long[] buildrui(int[] a) {
		int n = a.length;
		long[] ans = new long[n];
		ans[0] = a[0];
		for(int i=1;i<n;i++) {
			ans[i] = ans[i-1] + a[i];
		}
		return ans;
	}
	public int[][] ibuildrui(int[][] a) {
		int n = a.length;
		int m = a[0].length;
		int[][] ans = new int[n][m];
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
				ans[i][j] = a[i][j];
			}
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
				ans[i][j] += ans[i][j-1] + ans[i-1][j] - ans[i-1][j-1];
			}
		}
		return ans;
	}
	public void buildruin(int[][] a) {
		int n = a.length;
		int m = a[0].length;
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
				a[i][j] += a[i][j-1] + a[i-1][j] - a[i-1][j-1];
			}
		}
	}
	public long[][] buildrui(int[][] a) {
		int n = a.length;
		int m = a[0].length;
		long[][] ans = new long[n][m];
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
				ans[i][j] = a[i][j];
			}
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
				ans[i][j] += ans[i][j-1] + ans[i-1][j] - ans[i-1][j-1];
			}
		}
		return ans;
	}
	public int getrui(int[][] r,int a,int b,int c,int d) {
		return r[c][d] - r[a-1][d] - r[c][b-1] + r[a-1][b-1];
	}
	public long getrui(long[][] r,int a,int b,int c,int d) {
		if(a<0||b<0||c>=r.length||d>=r[0].length) return mod;
		return r[c][d] - r[a-1][d] - r[c][b-1] + r[a-1][b-1];
	}
	
	long divroundup(long n,long d) {
		if(n==0)return 0;
		return (n-1)/d+1;
	}
	public long sigma(long i) {
		return i*(i+1)/2;
	}
	public int digit(long i) {
		int ans = 1;
		while(i>=10) {
			i /= 10;
			ans++;
		}
		return ans;

	}
	public int digitsum(long n) {
		int ans = 0;
		while(n>0) {
			ans += n%10;
			n /= 10;
		}
		return ans;
	}
	public int popcount(int i) {
		int ans = 0;
		while(i>0) {
			ans += i%2;
			i /= 2;
		}
		return ans;
	}
	public boolean contains(int S,int i) {return (S>>i&1)==1;}
	public int bitremove(int S,int i) {return S&(~(1<<i));}
	public int bitadd(int S,int i) {return S|(1<<i);}
	public boolean isSubSet(int S,int T) {return (S-T)==(S^T);}
	public boolean isDisjoint(int S,int T) {return (S+T)==(S^T);}
	public boolean contains(long S,int i) {return (S>>i&1)==1;}
	public long bitremove(long S,int i) {return S&(~(1<<i));}
	public long bitadd(long S,int i) {return S|(1<<i);}
	public boolean isSubSet(long S,long T) {return (S-T)==(S^T);}
	public boolean isDisjoint(long S,long T) {return (S+T)==(S^T);}
	public int isBigger(int[] d, int i) {
		int ok = d.length;
		int ng = -1;
		while(Math.abs(ok-ng)>1) {
			int mid = (ok+ng)/2;
			if(d[mid]>i) {
				ok = mid;
			}else {
				ng = mid;
			}
		}
		return ok;
	}
	public int isSmaller(int[] d, int i) {
		int ok = -1;
		int ng = d.length;
		while(Math.abs(ok-ng)>1) {
			int mid = (ok+ng)/2;
			if(d[mid]<i) {
				ok = mid;
			}else {
				ng = mid;
			}
		}
		return ok;
	}
	public int isBigger(long[] d, long i) {
		int ok = d.length;
		int ng = -1;
		while(Math.abs(ok-ng)>1) {
			int mid = (ok+ng)/2;
			if(d[mid]>i) {
				ok = mid;
			}else {
				ng = mid;
			}
		}
		return ok;
	}
	public int isSmaller(long[] d, long i) {
		int ok = -1;
		int ng = d.length;
		while(Math.abs(ok-ng)>1) {
			int mid = (ok+ng)/2;
			if(d[mid]<i) {
				ok = mid;
			}else {
				ng = mid;
			}
		}
		return ok;
	}
	public int isBigger(ArrayList<Integer> d, int i) {
		int ok = d.size();
		int ng = -1;
		while(Math.abs(ok-ng)>1) {
			int mid = (ok+ng)/2;
			if(d.get(mid)>i) {
				ok = mid;
			}else {
				ng = mid;
			}
		}
		return ok;
	}
	public int isSmaller(ArrayList<Integer> d, int i) {
		int ok = -1;
		int ng = d.size();
		while(Math.abs(ok-ng)>1) {
			int mid = (ok+ng)/2;
			if(d.get(mid)<i) {
				ok = mid;
			}else {
				ng = mid;
			}
		}
		return ok;
	}
	public int isBigger(ArrayList<Long> d, long i) {
		int ok = d.size();
		int ng = -1;
		while(Math.abs(ok-ng)>1) {
			int mid = (ok+ng)/2;
			if(d.get(mid)>i) {
				ok = mid;
			}else {
				ng = mid;
			}
		}
		return ok;
	}
	public int isSmaller(ArrayList<Long> d, long i) {
		int ok = -1;
		int ng = d.size();
		while(Math.abs(ok-ng)>1) {
			int mid = (ok+ng)/2;
			if(d.get(mid)<i) {
				ok = mid;
			}else {
				ng = mid;
			}
		}
		return ok;
	}
	public HashSet<Integer> primetable(int m) {
		HashSet<Integer> pt = new HashSet<Integer>();
		for(int i=2;i<=m;i++) {
			boolean b = true;
			for(int d:pt) {
				if(i%d==0) {
					b = false;
					break;
				}
			}
			if(b) {
				pt.add(i);
			}
		}
		return pt;
	}
	public ArrayList<Integer> primetablearray(int m) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		Queue<Integer> q = new ArrayDeque<Integer>();
		for(int i=2;i<=m;i++) {
			q.add(i);

		}
		boolean[] b = new boolean[m+1];
		while(!q.isEmpty()) {
			int e = q.poll();
			if(!b[e]) {
				al.add(e);
				for(int j=1;e*j<=1000000;j++) {
					b[e*j] = true;
				}
			}
		}
		return al;
	}
	
	public boolean isprime(int e) {
		if(e==1) return false;
		for(int i=2;i*i<=e;i++) {
			if(e%i==0) return false;
		}
		return true;
	}
	
	public int[] hipPush(int[] a){
		int[] r = new int[a.length];
		int[] s = new int[a.length];
		for(int i=0;i<a.length;i++) {
			s[i] = a[i];
		}
		Arrays.sort(s);
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++) {
			m.put(s[i],i);
		}
		for(int i=0;i<a.length;i++) {
			r[i] = m.get(a[i]);
		}
		return r;
	}
	public HashMap<Integer,Integer> hipPush(ArrayList<Integer> l){
		HashMap<Integer,Integer> r = new HashMap<Integer,Integer>();
		TreeSet<Integer> s = new TreeSet<Integer>();
		for(int e:l)s.add(e);
		int p = 0;
		for(int e:s) {
			r.put(e,p);
			p++;
		}
		return r;
	}
	public TreeMap<Integer,Integer> thipPush(ArrayList<Integer> l){
		TreeMap<Integer,Integer> r = new TreeMap<Integer,Integer>();
		Collections.sort(l);
		int b = -(1000000007+9393);
		int p = 0;
		for(int e:l) {
			if(b!=e) {
				r.put(e,p);
				p++;
			}
			b=e;
		}
		return r;
	}
	int[] count(int[] a) {
		int[] c = new int[max(a)+1];
		for(int i=0;i<a.length;i++) {
			c[a[i]]++;
		}
		return c;
	}
	int[] count(int[] a, int m) {
		int[] c = new int[m+1];
		for(int i=0;i<a.length;i++) {
			c[a[i]]++;
		}
		return c;
	}
	long max(long[] a){
		long M = Long.MIN_VALUE;
		for(int i=0;i<a.length;i++){
			if(M<=a[i]){
				M =a[i];
				maxdex = i;
			}
		}
		return M;
	}
	int max(int[] a){
		int M = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++){
			if(M<=a[i]){
				M =a[i];
				maxdex = i;
			}
		}
		return M;
	}
	long min(long[] a){
		long m = Long.MAX_VALUE;
		for(int i=0;i<a.length;i++){
			if(m>a[i]){
				m =a[i];
				mindex = i;
			}
		}
		return m;
	}
	int min(int[] a){
		int m = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++){
			if(m>a[i]){
				m =a[i];
				mindex = i;
			}
		}
		return m;
	}
	long sum(long[] a){
		long s = 0;
		for(int i=0;i<a.length;i++)s += a[i];
		return s;
	}
	long sum(int[] a){
		long s = 0;
		for(int i=0;i<a.length;i++)s += a[i];
		return s;
	}
	long  sum(ArrayList<Integer> l) {
		long s = 0;
		for(int e:l)s += e;
		return s;
	}
	long gcd(long a, long b){
		a = Math.abs(a);
		b = Math.abs(b);
		if(a==0)return b;
		if(b==0)return a;
		if(a%b==0) return b;
		else return gcd(b,a%b);
	}
	int igcd(int a, int b) {
		if(a%b==0) return b;
		else return igcd(b,a%b);
	}
	long lcm(long a, long b) {return a / gcd(a,b) * b;}
	public long perm(int a,int num) {
		if(!isBuild)buildFac();
		return fac[a]*(rev(fac[a-num]))%mod;
	}
	void buildComb(int N) {
		comb = new long[N+1][N+1];
		comb[0][0] = 1;
		for(int i=1;i<=N;i++) {
			comb[i][0] = 1;
			for(int j=1;j<N;j++) {
				comb[i][j] = comb[i-1][j-1]+comb[i-1][j];
				if(comb[i][j]>mod)comb[i][j]-=mod;
			}
			comb[i][i] = 1;
		}
	}
	public long comb(int a,int num){
		if(a-num<0)return 0;
		if(num<0)return 0;
		if(!isBuild)buildFac();
		if(a>10000000) return combN(a,num);
		return fac[a] * ((revfac[num]*revfac[a-num])%mod)%mod;
	}
	long combN(int a,int num) {
		long ans = 1;
		for(int i=0;i<num;i++) {
			ans *= a-i;
			ans %= mod;
		}
		return ans * revfac[num] % mod;
	}
	long mulchoose(int n,int k) {
		if(k==0) return 1;
		return comb(n+k-1,k);
	}
	long rev(long l) {return pow(l,mod-2);}

	void buildpow(int l,int i) {
		pow = new long[i+1];
		pow[0] = 1;
		for(int j=1;j<=i;j++) {
			pow[j] = pow[j-1]*l;
			if(pow[j]>mod)pow[j] %= mod;
		}
	}
	void buildrevpow(int l,int i) {
		revpow = new long[i+1];
		revpow[0] = 1;
		for(int j=1;j<=i;j++) {
			revpow[j] = revpow[j-1]*l;
			if(revpow[j]>mod) revpow[j] %= mod;
		}
	}
	long pow(long l, long i) {
		if(i==0)return 1;
		else{
			if(i%2==0){
				long val = pow(l,i/2);
				return val * val % mod;
			}
			else return pow(l,i-1) * l % mod;
		}
	}
	long mon(int i) {
		long ans = 0;
		for(int k=2;k<=i;k++) {
			ans += (k%2==0?1:-1) * revfac[k];
			ans += mod;
		}
		ans %= mod;
		ans *= fac[i];
		return ans%mod;
	}
	
	
	
}


