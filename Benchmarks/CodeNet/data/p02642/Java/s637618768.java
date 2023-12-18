import java.io.*;
import java.util.*;

public class Main{
	static int[]lp;
	static void sieveLinear(int N)
	{
		ArrayList<Integer> primes = new ArrayList<Integer>();
		lp = new int[N + 1];								//lp[i] = least prime divisor of i
		for(int i = 2; i <= N; ++i)
		{
			if(lp[i] == 0)
			{
				primes.add(i);
				lp[i] = i;
			}
			int curLP = lp[i];
			for(int p: primes)//all primes smaller than or equal my lowest prime divisor
				if(p > curLP || p * 1l * i > N)
					break;
				else
					lp[p * i] = p;
		}
	}
	static LinkedList<Integer> divisors(int x){
		LinkedList<Integer>divs=new LinkedList<>();
		while(x>1) {
			int lowestDivisor=lp[x];
			int divisor=lowestDivisor;
			while(x%lowestDivisor==0) {
				divs.add(divisor);
				x/=lowestDivisor;
				divisor*=lowestDivisor;
			}
		}
		return divs;
	}
	static void main() throws Exception{
		sieveLinear(1000000);
		int n=sc.nextInt();
		int[]in=new int[n];
		int[]occ=new int[1000001];
		for(int i=0;i<n;i++) {
			in[i]=sc.nextInt();
			occ[in[i]]++;
		}
		int ans=0;
		for(int i=0;i<n;i++) {
			LinkedList<Integer>divisors=divisors(in[i]);
			boolean ok=true;
			while(!divisors.isEmpty() && ok) {
				int curD=divisors.poll();
				if(curD==in[i])occ[in[i]]--;
				if(occ[curD]!=0) {
					ok=false;
				}
				
				if(curD==in[i])occ[in[i]]++;
			}
			ans+=(ok?1:0);
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