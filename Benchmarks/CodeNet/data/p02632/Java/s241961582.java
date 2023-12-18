import java.io.*;
import java.util.*;

public class Main{
	static long[]fac;
	static int mod=(int)1e9+7;
	static long fastpow(long n,long ti) {
		 if (ti == 0) 
		        return 1l;
		if(ti%2==0) {
			long y=fastpow(n, ti/2);
			long k=y*y;
			k%=mod;
			return k;
		}
		else {
			long y=fastpow(n, ti/2);
			long k=((n*y)%mod)*y;
			k%=mod;
			return k;
		}
	}
	public static long ncr(int n,int k) {
		long num=fac[(n)];
		long den=(fac[(n-k)]*fac[k])%mod;
		long ans=(num*fastpow(den,mod-2));
		return ans%mod;
	}
	static void main() throws Exception{
		fac=new long[2000007];
		fac[0]=1;for(int i=1;i<fac.length;i++)fac[i]=(fac[i-1]*i)%mod;
		int k=sc.nextInt();
		int n=sc.nextLine().length();
		long ans=0;
		for(int pos=n+k;pos>=n;pos--) {
			//n+k-1-(n+k-pos)
			long otherPos=ncr(pos-1, n-1);
			long cur=(otherPos*fastpow(25, pos-n))%mod;
			cur=(cur*fastpow(26, n+k-pos))%mod;
			ans=(ans+cur)%mod;
		}
		pw.println(ans);
	}
	public static void main(String[] args) throws Exception{
		pw=new PrintWriter(System.out);
		sc = new MScanner(System.in);
//		int tc=sc.nextInt();
//		while(tc-->0)
			main();
		pw.flush();
	}
	static PrintWriter pw;
	static MScanner  sc;
	static class MScanner {
		StringTokenizer st;
		BufferedReader br;
		public MScanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}
 
		public MScanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int[] intArr(int n) throws IOException {
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public long[] longArr(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
		}
		public int[] intSortedArr(int n) throws IOException {
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        shuffle(in);
	        Arrays.sort(in);
	        return in;
		}
		public long[] longSortedArr(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        shuffle(in);
	        Arrays.sort(in);
	        return in;
		}
		public Integer[] IntegerArr(int n) throws IOException {
	        Integer[]in=new Integer[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public Long[] LongArr(int n) throws IOException {
	        Long[]in=new Long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
		}
		public String nextLine() throws IOException {
			return br.readLine();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
 
		public char nextChar() throws IOException {
			return next().charAt(0);
		}
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
	static void shuffle(int[]in) {
		for(int i=0;i<in.length;i++) {
			int idx=(int)(Math.random()*in.length);
			int tmp=in[i];
			in[i]=in[idx];
			in[idx]=tmp;
		}
	}
	static void shuffle(long[]in) {
		for(int i=0;i<in.length;i++) {
			int idx=(int)(Math.random()*in.length);
			long tmp=in[i];
			in[i]=in[idx];
			in[idx]=tmp;
		}
	}
}
