import java.io.*;
import java.util.*;
public class Main{
	static long n,d;
	static long[]cost;
	static long[]arr= {2,3,5};
	static HashMap<Long, Long>memo;
	static long dp(long i) {
		if(memo.containsKey(i))return memo.get(i);
		if(i==0) {
			memo.put(i, 0l);
			return 0;
		}
		if(i==1) {
			memo.put(i, d);
			return d;
		}
		long ans=(long)3e18;
		if(i<ans/d) {
			ans=i*d;
		}
		for(int j=0;j<3;j++) {
			long ceil=arr[j]*((i+arr[j]-1)/arr[j]),floor=(i/arr[j])*arr[j];
			long curCost=(Math.abs(floor-i))*d + cost[j] + dp(floor/arr[j]);
			ans=Math.min(ans, curCost);
			
			curCost=(Math.abs(ceil-i))*d + cost[j] + dp(ceil/arr[j]);
			ans=Math.min(ans, curCost);
		}
		
		memo.put(i, ans);
//		System.out.println(i+" "+ans);
		return ans;
	}
	static void main() throws Exception{
		memo=new HashMap<>();
		n=sc.nextLong();
		cost=sc.longArr(3);
		d=sc.nextLong();
		
		pw.println(dp(n));
	}
	public static void main(String[] args) throws Exception{
		pw=new PrintWriter(System.out);
		sc = new MScanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0)main();
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
