import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;



public class Main {

	static int[] fac;
	static int mod=(int)1e9+7;
	static ArrayList<Integer>[] adjList;
	static int dfs_num[],dfs_low[],timer;
	static boolean[] vis;
	static int r,c,k;
	static int x,y;
	static char[][] grid;
	static int[] dx={1,-1,0,0};
	static int[] dy={0,0,1,-1};
	static int INF=(int)1e9;


	public static void main(String[] args) throws Exception {

		Scanner	sc = new Scanner(System.in);
		PrintWriter	pw =new PrintWriter(System.out);
		r=sc.nextInt();
		c=sc.nextInt();
		k=sc.nextInt();
		int sx=sc.nextInt()-1;
		int sy=sc.nextInt()-1;
		x=sc.nextInt()-1;
		y=sc.nextInt()-1;
		grid=new char[r][c];
		int[][] done=new int[r][c];
		for(int i=0;i<r;i++)
			grid[i]=sc.next().toCharArray();
//				for(int i=0;i<r;i++)
//					for(int j=0;j<c;j++) {
//						grid[i][j]='.';
//					}

		long s=System.currentTimeMillis();
		Queue<Pair> q= new LinkedList();
		int[][] dist=new int[r][c];

		for(int[] arr:dist)
			Arrays.fill(arr, INF);

		
		q.add(new Pair(sx,sy,-1,0));
		dist[sx][sy]=0;
		while(!q.isEmpty()) {
	
			Pair node =q.poll();
			if(node.x==x&&node.y==y)break;
			int tmp=dist[node.x][node.y];
			for(int p=0;p<dx.length;p++) {
				int nx=node.x+dx[p];
				int ny=node.y+dy[p];

				if(nx<0||nx>=r||ny<0||ny>=c||grid[nx][ny]=='@')continue;
				int nxt=0;
				if((done[node.x][node.y]&(1<<p))!=0) {
					nxt=tmp+1;

				}else {
					nxt=1+k*((tmp+k-1)/k);
				}


				if(nxt<=dist[nx][ny]) {
					if(dist[nx][ny]==nxt) {
						done[nx][ny]|=(1<<p);
					}
					else {
						done[nx][ny]=(1<<p);
						q.add(new Pair(nx,ny,p,dist[nx][ny]=nxt));
					}


				}

			}


		}
		if(dist[x][y]==INF)pw.println(-1);
		else
			pw.println((dist[x][y]+k-1)/k);



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
	static long square(long l) {
		return l*l;
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
	static int powmod(int b,long e, int mod) {
		int ans=1;
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
		int  x;int y;int z,dist;

		public Pair(int a,int b, int c,int w) {
			this.x=a;y=b;z=c;dist=w;
		}




		public int compareTo(Pair o) {
			//			return (x==o.x)?((y>o.y)?1:(y==o.y)?0:-1):((x>o.x)?1:-1);
			return dist-o.dist;
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