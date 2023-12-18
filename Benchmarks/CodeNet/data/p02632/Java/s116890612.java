


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
import java.util.HashSet;
import java.util.StringTokenizer;

import javax.security.auth.Subject;


public class Main {
 static ArrayList<Integer>[] adjList;
static ArrayList<Integer> divisors;

static final double EPS=1e-5;

static int mod=(int)1e9+7;
static int dfs_num[],dfs_low[],timer;
static boolean[] vis;
static long[] fac;
static int r,c,k;
static int x,y;
static char[][] grid;
static int[] dx={1,-1,0,0};
static int[] dy={0,0,1,-1};
static long INF=(long)1e13;

static HashSet<String> total;
public static void addChar(String s) {
	for(char c='a';c<='z';c++) {
		total.add(c+s);
		for(int i=0;i<s.length();i++) {
			total.add(s.substring(0,i+1)+c+s.substring(i+1));
		}
	}
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
public static long ncr(int c, int r) {
	long ans= mul(fac[c],powmod(fac[c-r], mod-2, mod));
		ans=mul(ans,powmod(fac[r],mod-2,mod));
		return ans;
}


public static void main(String[] args) throws IOException, InterruptedException {


	Scanner	sc = new Scanner(System.in);
	PrintWriter	pw =new PrintWriter(System.out);
//	total=new HashSet<>();
//	total.add("ab");
//	ArrayList<String> arr=new ArrayList<String>();
//for(int i=0;i<n;i++) {
//	HashSet<String>tmp=total;
//	total=new HashSet<>();
//	for(String s:tmp) {
//		addChar(s);
//	}
//}
//	for(String s:total) {
//		arr.add(s);
//	}
//	
//	Collections.sort(arr);
//	System.out.println(arr);
	
//	System.out.println(total.size());
	int n=sc.nextInt();
	int s=sc.next().length();
	fac=new long[n+s+1];
	fac[0]=1;
	for(int i=1;i<fac.length;i++)
		fac[i]=(i%mod*fac[i-1])%mod;
	long ans=0;
	for(int i=s;i<=n+s;i++) 
		{
		ans+=mul(ncr(i-1,s-1),(mul(powmod(26, s+n-i, mod),powmod(25, i-s, mod))));
		ans%=mod;
		}
	
	pw.println(ans);
	

	pw.flush();
	pw.close();


}


 
 static int pf[];
public static void modSieve(int N) {
	pf=new int[N+1];
	primes=new ArrayList<>();
	isPrime=new boolean[N+1];
	Arrays.fill(isPrime, true);
	for(int i=2;i<=N;i++) {
		if(!isPrime[i]) {
			for(int j=i;j<=N;j+=i) {
				isPrime[j]=false;
				pf[j]++;
			}
			isPrime[i]=true;
		}
	}
	for(int i=2;i<=N;i++)
		if(isPrime[i])
			primes.add(i);
	
}
public static long primeCount(int n) {
	if(n<pf.length)return pf[n];
	int p=primes.get(0);
	int idx=0;
	long ans=0;
	while(p*1l*p<=n) {
		if(n%p==0)ans++;
		while(n%p==0)
			n/=p;
		p=primes.get(++idx);
	}
	return ans;
}
 public static void divisorsGenerator(int N) {
		int p=primes.get(0);
		int idx=0;
		divisors=new ArrayList<>();
		divisors.add(1);
		while(p*1l*p<=N) {
			int c=0;
			ArrayList<Integer> primeComb=new ArrayList<>();
			int tmpP=p;
			while(N%p==0) {
				N/=p;
				primeComb.add(tmpP);
				tmpP*=p;
				
			}
			int size=divisors.size();
			for(int i=0;i<size;i++) {
				int curr=divisors.get(i);
				for(int num:primeComb)
					divisors.add(num*curr);
			}
			p=primes.get(++idx);
		}
		if(N!=1)
		{
		int size=divisors.size();
		for(int i=0;i<size;i++)
			divisors.add(divisors.get(i)*N);
		}
	 
 }
  public static double readDouble(String s) {
		StringBuilder sb =new StringBuilder("0");
		boolean neg=false;
		boolean dec=false;
		double div=1;
		int start=0;
		if(s.charAt(0)=='-') {
			neg=true;start++;
		}
		double result=0;
	for(int i=start;i<s.length();i++) {
		if(s.charAt(i)=='.') {
			result+=Long.parseLong(sb.toString());
	
			sb =new StringBuilder("0");
			dec=true;
		}else {
			sb.append(s.charAt(i));
			if(dec)
				div*=10;
		}
	}

	result+=Long.parseLong(sb.toString()) / div;
	return (neg)?-1*result:result;
}
public static int gcd(int a,int b) {
	if(a==0)return b;
	return gcd(b%a,a);
}


	static boolean[] isPrime;
	static ArrayList<Integer> primes;
	static ArrayList<Long>[] factors;//factors[i] if i=9 {3,2} 
	static StringBuilder[] factorsMult;
	static int[] prevMult;
public static void ModifiedSieveForFactors(int N) {// O( n log( log n ) )
		prevMult= new int[N+1];//u can save half the memory by neglecting all even numbers since they aren't primes
		Arrays.fill(prevMult, 1);
		int[] check=new int[N+1];
		
	factorsMult=new StringBuilder[N+1];
	for(int i=0;i<=N;i++)
		{factorsMult[i]=new StringBuilder("1 ");
		check[i]=i;
		}
		for(int i=2;i<=N;i++) {
			if(prevMult[i]==1) {
				for(int j=2*i;j<=N;j+=i) {
					while(check[j]%i==0) {
						if(!isPrime[check[j]])
						factorsMult[j].append((prevMult[j]=i*prevMult[j])+" ");
					
						check[j]/=i;
					}
				}
				
			}
		}
	}
public static String getFactors(long n){
		if(n<factorsMult.length)return factorsMult[(int)n].toString();
		StringBuilder sb =new StringBuilder("1 ");
		 long p=primes.get(0);
		int idx=0;
		long prev=1;
		while(p*1l*p<=n) {
			while(n%p==0) {
				if(n>=isPrime.length||!isPrime[(int)n])
				sb.append((prev=prev*p)+" ");
				n/=p;
			}
			p=primes.get(++idx);
			
		}
		return sb.toString();
	
}
	public static void sieve(int N) {// O( n log( log n ) )
		isPrime= new boolean[N+1];//u can save half the memory by neglecting all even numbers since they aren't primes
		pf=new int[N+1];
		primes= new ArrayList<>(N);
		Arrays.fill(isPrime, true);
		isPrime[0]=isPrime[1]=false;
		for(int i=2;i*i<=N;i++) {
			if(isPrime[i]) {
				for(int j=i;j<=N;j+=i) {
					isPrime[j]=false;
					pf[j]++;
				}
				isPrime[i]=true;
			}
		}
		
		for(int i=2;i<=N;i++)
			if(isPrime[i]) {
				primes.add(i);
			if(i*i>N) {
				pf[i]++;
			}
			}
		
	}

	

	static class Pair implements Comparable<Pair>{
		int  x;int y;int z;long dist;

		public Pair(int a,int b, int c,long w) {
			this.x=a;y=b;z=c;dist=w;
		}




		
public int compareTo(Pair o) {
			//			return (x==o.x)?((y>o.y)?1:(y==o.y)?0:-1):((x>o.x)?1:-1);
			return dist>o.dist?1:(dist==o.dist)?0:-1;
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




	public static void addEdge(int a, int b) {
		adjList[a].add(b);
		adjList[b].add(a);
	}

	static class SegmentTree{
		int N;
		int[] sTree,array;
		public SegmentTree(int[] arr){
			array=arr;
			N=array.length-1;
			sTree= new int[N<<1];
			build(1,1,N);
		}
		public  void build(int node , int b , int e) {
			if(b==e)
				sTree[node]=array[b];
			else {
				int mid= (b+e)>>1;
			build(node<<1, b, mid);
			build(node<<1|1, mid+1, e);
			sTree[node]=Math.max(sTree[node<<1],sTree[node<<1|1]);
			
			}
				
		}
		public int query(int i , int j){
			return query(1, 1,N,i,j);
			
		}
		public int query(int node , int b ,int e , int i , int j) {
			if(e<i||b>j)return -1*(int)1e6;
			if(b>=i&&e<=j)return sTree[node];
			int mid =(b+e)>>1;
			int left=query(node<<1,b,mid,i,j);
		int right=	query(node<<1|1,mid+1,e,i,j);
			return Math.max(left, right);
			
		}
	}

	static public class UDS {
		int[] parent, rank, setSize;
		int n;// number of sets
		int maxSet = 1;

		public UDS(int n) {

			this.n = n;
			parent = new int[n];
			rank = new int[n];
			setSize = new int[n];
			Arrays.fill(setSize, 1);
			for (int i = 0; i < n; i++)
				parent[i] = i;
		}

		public boolean unionSet(int i, int j) {
			int p1 = findSet(i);
			int p2 = findSet(j);

			if (p1 != p2) {
				n--;
				if (rank[p1] < rank[p2]) {
					parent[p1] = p2;
					setSize[p2] += setSize[p1];
					maxSet = Math.max(maxSet, setSize[p2]);
				} else {
					parent[p2] = p1;
					setSize[p1] += setSize[p2];
					maxSet = Math.max(maxSet, setSize[p1]);
					if (rank[p1] == rank[p2])
						rank[p1]++;
				}
				return true;
			}
			return false;
		}

		public int sizeOfSet(int i) {
			return setSize[findSet(i)];
		}

		public int numDisjointSets() {
			return n;
		}

		public boolean isSameSet(int i, int j) {
			return findSet(i) == findSet(j);
		}

		public int findSet(int i) {
			return (parent[i] == i) ? i : (parent[i] = findSet(parent[i]));
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
