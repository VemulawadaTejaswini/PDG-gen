import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;


class UnionFind{
	int Parent[];
	UnionFind(int n){//Initialize by -1
		Parent=new int[n];
		Arrays.fill(Parent, -1);
	}
	int root(int A) {//In which tree is A?
		if(Parent[A]<0)return A;
		return Parent[A]=root(Parent[A]);
    }
	int size(int A) {//size of tree which is include A
		return -Parent[root(A)];
	}
	boolean connect(int A,int B) {//Connect A and B
		A=root(A);
		B=root(B);
		if(A==B) return false;
		if(size(A)<size(B)) {int C=0;C=B;B=A;A=C;}//SWAP
		Parent[A]+=Parent[B];
		Parent[B]=A;
		return true;
	}
}
class Pair<T,E>{
	public T first;
	public E second;
	void set(T x,E y){
		first=x;
		second=y;
	}
}	
class Pint{
	public int first;
	public int second;
	Pint(int x,int y){
		first=x;
		second=y;
	}
	void set(int x,int y){
		first=x;
		second=y;
	}
}
class Tpair{
	public int first;
	public int second;
	public long third;
	Tpair(int x,int y,long z){
		first=x;
		second=y;
		third=z;
	}
	void set(int x,int y,long z){
		first=x;
		second=y;
		third=z;
    }
}
public class Main {
	static FastScanner scan=new FastScanner();
	static Scanner scanner=new Scanner(System.in);
	static Random rand=new Random();
	static long mod=1000000007;
	static double eps=1.0E-14;
	static int big=Integer.MAX_VALUE;
	static double PI=3.14159265358979323846262338327950288;
	static long modlcm(long a,long b) {return a*b*modinv(GCD(a,b),mod);}
	static long GCD (long a, long b) {return b>0?GCD(b,a%b):a;}
	static long lcm (long a, long b) {return a*b/GCD(a,b);}
	static int min(int a,int b) {return a<b?a:b;}
	static long factorial(int i) {return i==1?1:i*factorial(i-1);}
	static int max(int ...i) {int x=i[0];for(int e:i)x=Math.max(x,e);return x;}
	static int min(int ...i) {int x=i[0];for(int e:i)x=Math.min(x,e);return x;}
	static long gcd(long ...i) {long x=i[0];for(long e:i)x=GCD(x,e);return x;}
	static long lmax(long ...i) {long x=i[0];for(long e:i)x=Math.max(x,e);return x;}
	static long lmin(long ...i) {long x=i[0];for(long e:i)x=Math.min(x,e);return x;}
	public static void main(String[]$) throws IOException{
		int arr[]={1,4,10,20,35,56,84,120,165,220,286,364,455,560,680,816,969,
				1140,1330,1540,1771,2024,2300,2600,2925,3276,3654,4060,4495,4960,5456,5984,6545,
				7140,7770,8436,9139,9880,10660,11480,12341,13244,14190,15180,16215,17296,18424,
				19600,20825,22100,23426,24804,26235,27720,29260,30856,32509,34220,35990,37820,
				39711,41664,43680,45760,47905,50116,52394,54740,57155,59640,62196,64824,67525,
				70300,73150,76076,79079,82160,85320,88560,91881,95284,98770,102340,105995,109736,
				113564,117480,121485,125580,129766,134044,138415,142880,147440,152096,156849,161700,
				166650,171700,176851,182104,187460,192920,198485,204156,209934,215820,221815,227920,
				234136,240464,246905,253460,260130,266916,273819,280840,287980,295240,302621,310124,
				317750,325500,333375,341376,349504,357760,366145,374660,383306,392084,400995,410040,
				419220,428536,437989,447580,457310,467180,477191,487344,497640,508080,518665,529396,
				540274,551300,562475,573800,585276,596904,608685,620620,632710,644956,657359,669920,
				682640,695520,708561,721764,735130,748660,762355,776216,790244,804440,818805,833340,
				848046,862924,877975,893200,908600,924176,939929,955860,971970,988260,1004731,1021384,
				1038220,1055240};
		int dp[]=new int[1000010];
		int odddp[]=new int[1000010];
		Arrays.fill(dp, Integer.MAX_VALUE);
		Arrays.fill(odddp, Integer.MAX_VALUE);
		dp[0]=0;
		odddp[0]=0;
		for(int i=1;;i++) {
			int num=i*(i+1)*(i+2)/6;
			if(num>=1000010)break;
			for(int j=num;j<1000010;j++) {
				dp[j]=min(dp[j],dp[j-num]+1);
				if((num&1)>0) {
					odddp[j]=min(odddp[j],odddp[j-num]+1);
				}
			}
		}
		while(true) {
			int x=scan.nextInt();
			if(x==0)break;
			System.out.println(dp[x]+" "+odddp[x]);
		}
	}
	static long nCr(long n,long r,long m) {
		long ans=1;
		for(long i=0;i<r;i++) {
			ans*=(n-i);
			ans%=m;
		}
		for(long i=0;i<=r;i++) {
			ans*=modinv(i,m);
			ans%=mod;
		}
		return ans;
	}
	static int lower_bound(int a[],int key) {
		int ok=a.length;
		int ng=-1;
		while(Math.abs(ok-ng)>1) {
			int mid=(ok+ng)/2;
			if(a[mid]>=key)ok=mid;
			else ng=mid;
		}
		return ok;
	}
	static int upper_bound(int a[],int key) {
		int ok=a.length;
		int ng=-1;
		while(Math.abs(ok-ng)>1) {
			int mid=(ok+ng)/2;
			if(a[mid]>key)ok=mid;
			else ng=mid;
		}
		return ok;
	}
	static boolean isPrime (long n) {
		if (n==2) return true;
		if (n<2 || n%2==0) return false;
		double d = Math.sqrt(n);
		for (int i=3; i<=d; i+=2)if(n%i==0){return false;}
		return true;
	}
	static int upper_division(int a,int b) {
		if(a%b==0) {
			return a/b;
		}
		else {
			return a/b+1;
		}
	}
	static long lupper_division(long a,long b) {
		if(a%b==0) {
			return a/b;
		}
		else {
			return a/b+1;
		}
	}
	static int[] setArray(int a) {
		int b[]=new int[a];
		for(int i=0;i<a;i++) {
			b[i]=scan.nextInt();
		}
		return b;
	}
	static long[] lsetArray(int a) {
		long b[]=new long[a];
		for(int i=0;i<a;i++) {
			b[i]=scan.nextLong();
		}
		return b;
	}
	static String reverse(String str) {
		char ch[]=new char[str.length()];
		char chch[]=str.toCharArray();
		int a=str.length();
		for(int i=0;i<upper_division(a,2);i++) {
			ch[i]=chch[ch.length-i-1];
			ch[ch.length-1-i]=chch[i];
		}
		return String.valueOf(ch);
	}
	public static void printArray(int[] que) {
		for(int i=0;i<que.length-1;i++) {
			System.out.print(que[i]+" ");
		}
		System.out.println(que[que.length-1]);
	}
	public static void lprintArray(long[] que) {
		for(int i=0;i<que.length-1;i++) {
			System.out.print(que[i]+" ");
		}
		System.out.println(que[que.length-1]);
	}
	public static int[][] doublesort(int[][]a) {
		Arrays.sort(a,(x,y)->Integer.compare(x[0],y[0]));
		return a;
	}
	public static long[][] ldoublesort(long[][]a) {
		Arrays.sort(a,(x,y)->Long.compare(x[0],y[0]));
		return a;
	}
	static long modpow(long x,long n,long mo) {
	        long sum=1;
	        while(n>0) {
	            if((n&1)==1) {
	                sum=sum*x%mo;
	            }
	            x=x*x%mo;
	            n>>=1;
	        }
	        return sum;
	    }
	public static char[] revch(char ch[]) {
		char ret[]=new char[ch.length];
		for(int i=ch.length-1,j=0;i>=0;i--,j++) {
			ret[j]=ch[i];
		}
		return ret;
	}
	public static int[] revint(int ch[]) {
		int ret[]=new int[ch.length];
		for(int i=ch.length-1,j=0;i>=0;i--,j++) {
			ret[j]=ch[i];
		}
		return ret;
	}
	public static void warshall_floyd(int v[][],int n) {
		for(int k=0;k<n;k++)
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					v[i][j]=min(v[i][j],v[i][k]+v[k][j]);
	}	
	public static long modinv(long a,long m) {
		long b=m,u=1,v=0;
		while(b!=0) {
			long t=a/b;
			a-=t*b;
			long x=a;
			a=b;
			b=x;
			
			u-=t*v;
			x=u;
			u=v;
			v=x;
		}
		u%=m;
		if(u<0)u+=m;
		return u;
	}
}
class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		}else{
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}
	private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext()) throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while(true){
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			}else if(b == -1 || !isPrintableChar(b)){
				return minus ? -n : n;
			}else{
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
		return (int) nl;
	}
	public double nextDouble() { return Double.parseDouble(next());}
}	
