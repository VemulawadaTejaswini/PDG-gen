import java.io.*;
import java.util.*;

public class Main{
	static int inf=(int)1e9;
	static class segmentTree {
		long[][]sTree;
		long[]lazy;
		int N;
		int max;
		public segmentTree(int n) {//in array is 1-based array
			max=n-1;
			N=1;
			while(N<n) {
				N<<=1;
			}
			sTree=new long[N<<1][2];
			for(int i=1;i<sTree.length;i++) {
				sTree[i]=new long[] {inf,inf};
			}
			int i=N;
			int idx=1;
			while(i<sTree.length) {
				sTree[i++]=new long[] {0,idx++};
			}
			lazy=new long[N<<1];
		}
		long[] query(int left,int right) {
			return query(1, 1, N, left, right);
		}
		long[] query(int node,int curLeft,int curRight,int left,int right) {
			if(curLeft>right || curRight<left)return new long[] {inf,inf};//the value that won't affect the required operation
			
			if(curLeft>=left && curRight<=right) {
				return sTree[node];
			}
			int mid=(curLeft+curRight)>>1;
			int leftChild=node<<1,rightChild=node<<1|1;
			propagate(node, curLeft, mid, curRight);
			long[] q1=query(leftChild, curLeft, mid, left, right);
			long[] q2=query(rightChild, mid+1, curRight, left, right);
			
			if(q1[0]+q1[1]>max && q2[0]+q2[1]>max) {
				return new long[] {inf,inf};
			}
			else {
				if(q1[0]+q1[1]>max) {
					return q2;
				}
				else {
					if(q2[0]+q2[1]>max) {
						return q1;
					}
				}
			}
			if(q1[0]<q2[0] || (q1[0]==q2[0] && q1[1]<q2[1])) {
				return q1;
			}
			return q2;
		}
		long[] query_point(int i){
			return query_point(1,1,N,i);
		}
		
		long[] query_point(int node,int curLeft,int curRight,int idx){
			
			if(curLeft==curRight) {
				return sTree[node];
			}
			int mid=(curLeft+curRight)>>1;
			int leftChild=node<<1,rightChild=node<<1|1;
			propagate(node, curLeft, mid, curRight);
			if(idx<=mid) {
				return query_point(leftChild, curLeft, mid,idx);
			}
			return query_point(rightChild, mid+1, curRight,idx);
					
		}
		
		void update_range(int i, int j, int val){
			update_range(1,1,N,i,j,val);
		}
		
		void update_range(int node,int curLeft,int curRight,int left,int right,int val) {
			if(curLeft>right || curRight<left)return;
			
			if(curLeft>=left && curRight<=right) {
				sTree[node][0] += val;			
				lazy[node] += val;
				return;
			}
			int mid=(curLeft+curRight)>>1;
			int leftChild=node<<1,rightChild=node<<1|1;
			propagate(node, curLeft, mid, curRight);
			update_range(leftChild, curLeft, mid, left, right,val);
			update_range(rightChild, mid+1, curRight, left, right,val);
			
			if(sTree[leftChild][0]+sTree[leftChild][1]>max && sTree[rightChild][0]+sTree[rightChild][1]>max) {
				sTree[node]=new long[] {inf,inf};
				return;
			}
			else {
				if(sTree[leftChild][0]+sTree[leftChild][1]>max) {
					sTree[node]=sTree[rightChild];
					return;
				}
				else {
					if(sTree[rightChild][0]+sTree[rightChild][1]>max) {
						sTree[node]=sTree[leftChild];
						return;
					}
				}
			}
			
			if(sTree[leftChild][0]<sTree[rightChild][0] || (sTree[leftChild][0]==sTree[rightChild][0] && sTree[leftChild][1]<sTree[rightChild][1])) {
				sTree[node]=sTree[leftChild];
			}
			else
				sTree[node]=sTree[rightChild];
			
		}
		
		void update_Point(int i, int val){
			update_Point(1,1,N,i,val);
		}
		
		void update_Point(int node,int curLeft,int curRight,int idx,int val) {
			if(curLeft==curRight) {
				sTree[node][0] += val;			
				lazy[node] += val;
				return;
			}
			int mid=(curLeft+curRight)>>1;
			int leftChild=node<<1,rightChild=node<<1|1;
			propagate(node, curLeft, mid, curRight);
			if(idx<=mid)
				update_Point(leftChild, curLeft, mid, idx, val);
			else
				update_Point(rightChild, mid+1, curRight, idx ,val);
			
			if(sTree[leftChild][0]+sTree[leftChild][1]>max && sTree[rightChild][0]+sTree[rightChild][1]>max) {
				sTree[node]=new long[] {inf,inf};
				return;
			}
			else {
				if(sTree[leftChild][0]+sTree[leftChild][1]>max) {
					sTree[node]=sTree[rightChild];
					return;
				}
				else {
					if(sTree[rightChild][0]+sTree[rightChild][1]>max) {
						sTree[node]=sTree[leftChild];
						return;
					}
				}
			}
			
		}
		void propagate(int node, int b, int mid, int e){
			lazy[node<<1] += lazy[node];
			lazy[node<<1|1] += lazy[node];
			sTree[node<<1][0] += lazy[node];		
			sTree[node<<1|1][0] += lazy[node];		
			lazy[node] = 0;//the value that won't affect the required operation
		}
		
	}
	static void main() throws Exception{
		int n=sc.nextInt(),m=sc.nextInt();
		segmentTree st=new segmentTree(m+1);
		int[]assign=new int[m+2];
		TreeSet<Integer>pos=new TreeSet<Integer>();
		for(int i=1;i<=m;i++) {
			assign[i]=i;
			pos.add(i);
		}
		for(int i=1;i<=n;i++) {
			int a=sc.nextInt(),b=sc.nextInt();
			Integer cur=pos.ceiling(a);
			while(cur!=null && cur<=b) {
				st.update_Point(cur, b-cur+1);
				pos.remove(cur);
				cur=pos.ceiling(cur);
			}
			
			int left=assign[a],right=a-1;
			if(left<=right) {
//				System.out.println(left+" "+right+" "+(b-a+1));
				st.update_range(left, right, b-a+1);
			}
			
			assign[b+1]=assign[a];
			
			long[]best=st.query(1, m);
//			System.out.println(Arrays.toString(best)+" "+Arrays.toString(st.query_point(1)));
			if(best[0]>=inf || best[0]+best[1]>m) {
				pw.println(-1);
			}
			else
				pw.println(i+best[0]);
		}
	}
	public static void main(String[] args) throws Exception{
		sc=new MScanner(System.in);
		pw = new PrintWriter(System.out);
		int tc=1;
//		tc=sc.nextInt();
		while(tc-->0)
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