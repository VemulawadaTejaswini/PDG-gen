import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;



public class COVID {

	static ArrayList<Edge>[] adjList;

	static int mod;


	static class Edge implements Comparable<Edge>{
		int node,sec;long t;

		public Edge( int v, int sec, long t) {
			super();
			this.node = v;
			this.sec = sec;
			this.t = t;
		}
		public int compareTo(Edge e) {
			return (int)(t-e.t);
		}


	}




	public static void main(String[] args) throws Exception {

		Scanner	sc = new Scanner(System.in);
		PrintWriter pw= new PrintWriter(System.out);
		int n=sc.nextInt();
		long[] a=sc.nextLongArr(n);
		long sum=0l;
		long xor=0l;
		for(long r:a) {
			xor^=r;
		}
		sum=a[0]+a[1];
		xor^=a[0]^a[1];
		long and=(sum-xor)/2;
		
		long or =xor+and;
//		System.out.println(and+" and " +Long.toBinaryString(and) );
//		System.out.println("or "+Long.toBinaryString(or));
//		System.out.println("xor "+Long.toBinaryString(xor));
		long ans=xor^or;
//		System.out.println(ans);
		for(int i=62;i>=0;i--) {
			if(((ans&(1l<<i))==0)&&((xor&(1l<<i))!=0)) {
//				System.out.println(" * "+(1l<<i)+" "+(ans+(1l<<i)<a[0]));
				if((ans+(1l<<i)<a[0]))
					ans+=(1l<<i);
			}
		}
//			System.out.println(ans);
		if(a[0]-ans<=0||ans==0) {
			pw.println("-1");
		}else {
			pw.println(a[0]-ans);
		}
		
		
		pw.flush();
		pw.close();

	}
	


	static long gcd(long a, long b) {
		return (b==0)?a:gcd(b,a%b);
	}
	static long lcm(long a, long b) {
		return a/gcd(a,b)*b;
	}
	public static int log(int n , int base) {
		int ans=0;
		while(n+1>base) {
			ans++;
			n/=base;
		}
		return ans;
	}
	static int pow(int b,long e) {
		int ans=1;
		while(e>0) {
			if((e&1)==1)
				ans=(int)((ans*1l*b));
			e>>=1;{

			}
			b=(int)((b*1l*b));
		}
		return ans;
	}
	static long powmod(long b,long e, int mod) {
		long ans=1;
		b%=mod;
		while(e>0) {
			if((e&1)==1)
				ans=(int)((ans*1l*b)%mod);
			e>>=1;
			b=(int)((b*1l*b)%mod);
		}
		return ans;
	}
	public static long add(long a, long b) {
		return (a+b)%mod;
	}
	public static long mul(long a, long b) {
		return ((a%mod)*(b%mod))%mod;
	}










	static class Pair implements Comparable<Pair>{

		int  x;int y;



		public Pair(int a,int b) {
			this.x=a;y=b;
		}









		public int compareTo(Pair o) {
			return (x==o.x)?((y>o.y)?1:(y==o.y)?0:-1):((x>o.x)?1:-1);
			//		return y-o.y;
		}


		@Override




		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}


		@Override


		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pair other = (Pair) obj;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}

	}






	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}
		public Scanner(String s) throws FileNotFoundException{	br = new BufferedReader(new FileReader(s));}

		public long[] nextLongArr(int n) throws IOException {
			long[] arr=new long[n];
			for(int i=0;i<n;i++)
				arr[i]=nextLong();
			return arr;
		}
		public int[] nextIntArr(int n) throws IOException {
			int[] arr=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=nextInt();
			return arr;
		}
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine()," ,");
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}


		public double nextDouble() throws IOException {
			String x = next();
			StringBuilder sb = new StringBuilder("0");
			double res = 0, f = 1;
			boolean dec = false, neg = false;
			int start = 0;
			if (x.charAt(0) == '-') {
				neg = true;
				start++;
			}
			for (int i = start; i < x.length(); i++) {
				if (x.charAt(i) == '.') {
					res = Long.parseLong(sb.toString());
					sb = new StringBuilder("0");
					dec = true;
				} else {
					sb.append(x.charAt(i));
					if (dec)
						f *= 10;
				}
				if (sb.length() == 18) {
					res += Long.parseLong(sb.toString()) / f;
					sb = new StringBuilder("0");
				}
			}
			res += Long.parseLong(sb.toString()) / f;
			return res * (neg ? -1 : 1);
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

	}

	public static void shuffle(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n - i));
			int tmp = a[i];
			a[i] = a[r];
			a[r] = tmp;
		}
	}
}