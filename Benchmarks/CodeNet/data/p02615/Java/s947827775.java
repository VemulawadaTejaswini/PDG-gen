import java.io.*;
import java.math.*;
import java.util.*;
import java.util.regex.*;


public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static long cnt=0;
	public static PrintWriter pw = new PrintWriter(System.out);
	public static void main(String[] args) throws Exception {
//		solveA(args);
//		solveB(args);
//		solveC(args);
		solveD(args);
//		solveE(args);
//		solveF(args);
		if(in!=null){
			in.close();
		}
		pw.flush();
		pw.close();
	}

	public static void solveA(String[] args) throws Exception{
		int N= nextInt();
		int ans = 0;
		for(int i=1;i<11;i++) {
			if(i*1000-N>=0) {
				pw.println(i*1000-N);
				return;
			}
		}

	}
	public static void solveB(String[] args) throws Exception{
		int N = nextInt();
		String[] S = new String[] {"AC","WA","TLE","RE"};
		int[] ans = new int[S.length];
		for(int i=0;i<N;i++) {
			String s = nextString();
			for(int k=0;k<S.length;k++) {
				if(s.equals(S[k])) {
					ans[k]++;
					break;
				}
			}
		}
		for(int i=0;i<S.length;i++) {
			pw.println(S[i]+" x "+ans[i]);
		}
	}
	public static void solveC(String[] args) throws Exception{
		int H = nextInt();
		int W = nextInt();
		int K = nextInt();

		char[][] c = new char[H][W];
		for(int i=0;i<H;i++) {
			c[i]=nextString().toCharArray();
		}

		long ans = 0;
		for(int rbit=0;rbit<(1<<H);rbit++) {

			int tmp = rbit;
			boolean[] rb=new boolean[H];
			for(int i=0;i<H;i++) {
				if((tmp&1)==1) {
					rb[i]=true;
				}
				tmp/=2;
			}

			ans+=calC(H,W,K,c,rb);
		}
		pw.println(ans);

	}

	public static long calC(int H,int W ,int K ,char[][] s ,boolean[] rb) {
		long ans = 0;
		for(int cbit=0;cbit<(1<<W);cbit++) {

			int tmp = cbit;
			boolean[] cb=new boolean[W];
			for(int i=0;i<W;i++) {
				if((tmp&1)==1) {
					cb[i]=true;
				}
				tmp/=2;
			}
			int k=0;
			for(int r=0;r<H;r++) {
				for(int w=0;w<W;w++) {
					if(rb[r]&&cb[w]&&s[r][w]=='#') {
						k++;
					}
				}
			}
			if(k==K) {
				ans++;
			}
		}
		return ans;
	}
	public static void solveD(String[] args) throws Exception{
		int N = nextInt();
//		Pair[] A = new Pair[N];
//		for(int i=0;i<N;i++) {
//			A[i] = new Pair(i,nextInt());
//		}
//		Arrays.sort(A,Comparator.comparing(Pair::getVal,Comparator.reverseOrder()));
//		LinkedList<Pair> list = new LinkedList<>();
//		list.add(A[0]);

		int[] A = nextInts();
		Arrays.sort(A);
		ArrayDeque<Integer> q = new ArrayDeque<>();
		q.add(A[N-1]);
		long ans = 0;
		for(int i=N-2;i>=0;i--) {
			ans+=q.poll();
			q.offer(A[i]);
			q.offer(A[i]);
		}

		pw.println(ans);

	}

	public static class Pair{
		public int idx;
		public int val;
		public Pair(int idx,int val) {
			this.idx=idx;
			this.val=val;
		}
		public int getVal() {
			return val;
		}
	}

	public static void solveE(String[] args) throws Exception{

	}

	public static void solveF(String[] args) throws Exception{

	}

	public static void check() throws Exception{
		if(in == null){
			in = new BufferedReader(new InputStreamReader(System.in));
		}
		if(Ws==null || Ws.length<=wsIndx){
			Ws = in.readLine().split(" ");
			wsIndx=0;
		}
	}
	public static int nextInt()throws Exception{
		check();
		return Integer.parseInt(Ws[wsIndx++]);
	}

	public static long nextLong()throws Exception{
		check();
		return Long.parseLong(Ws[wsIndx++]);
	}

	public static String nextString()throws Exception{
		check();
		return Ws[wsIndx++];
	}

	public static int[] nextInts()throws Exception{
		check();
		int[] tmp = new int[Ws.length];
		for(int i=0;i<tmp.length;i++){
			tmp[i]=Integer.parseInt(Ws[i]);
		}
		wsIndx=Ws.length;
		return tmp;
	}

	public static long[] nextLongs()throws Exception{
		check();
		long[] tmp = new long[Ws.length];
		for(int i=0;i<tmp.length;i++){
			tmp[i]=Long.parseLong(Ws[i]);
		}
		wsIndx=Ws.length;
		return tmp;
	}

	public static String[] nextStrings()throws Exception{
		check();
		wsIndx=Ws.length;
		return Ws;
	}

}

