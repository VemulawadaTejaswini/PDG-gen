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
//		solveD(args);
		solveE(args);
		if(in!=null){
			in.close();
		}
		pw.flush();
		pw.close();
	}

	public static void solveA(String[] args) throws Exception{
		String a = nextString();
		if('a'<= a.charAt(0) && a.charAt(0) <='z') {
			pw.println("a");

		}else {
			pw.println("A");
		}
	}
	public static void solveB(String[] args) throws Exception{
		int N=nextInt();
		int K=nextInt();

		int[] p = nextInts();
		Arrays.sort(p);
		int ans = 0;
		for(int i=0;i<K;i++) {
			ans+=p[i];
		}
		pw.println(ans);
	}
	public static void solveC(String[] args) throws Exception{
		long n = nextLong();
		String ans = "";
		while((n-1)/26!=0) {
			ans=(char)('a'+(n-1)%26)+ans;
			n=(n-1)/26;
		}
		ans=(char)('a'+(n-1)%26)+ans;
		pw.println(ans);
	}
	public static void solveD(String[] args) throws Exception{
		int N = nextInt();
		long[] A = nextLongs();
		int Q = nextInt();
		long[] B = new long[Q];
		long[] C = new long[Q];
		HashMap<Long,Integer> map = new HashMap<>();
		long ans = 0;
		for(int i=0;i<N;i++) {
			map.put((long)A[i],map.getOrDefault(A[i], 0)+1);
			ans+=A[i];
		}

		for(int i=0;i<Q;i++) {
			B[i]=nextLong();
			C[i]=nextLong();
			ans-=B[i]*map.getOrDefault(B[i], 0);
			ans+=C[i]*map.getOrDefault(B[i], 0);
			if(map.containsKey(B[i])) {
				map.put((long)C[i],map.getOrDefault(C[i], 0)+map.get(B[i]));
				map.put((long)B[i],0);
			}
			pw.println(ans);

		}

	}
	public static void solveE(String[] args) throws Exception{
		int N = nextInt();
		int[] a = nextInts();

		int[] e = new int[N];
		int t = 0;
		for(int i=0;i<N;i++) {
			t=t^a[i];
		}
		for(int i=0;i<N;i++) {
			pw.println(t^a[i]);
		}

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

