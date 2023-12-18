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
		solveC(args);
//		solveD(args);
//		solveE(args);
//		solveF(args);
		if(in!=null){
			in.close();
		}
		pw.flush();
		pw.close();
	}

	public static void solveA(String[] args) throws Exception{
		int a = nextInt();
		pw.println(a+a*a+a*a*a);
	}
	public static void solveB(String[] args) throws Exception{
		String S = nextString();
		String T = nextString();

		int ans = 0;
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)!=T.charAt(i)) {
				ans++;
			}
		}
		pw.println(ans);
	}
	public static void solveC(String[] args) throws Exception{
		int N = nextInt();
		int M = nextInt();
		int K = nextInt();

		int[] A = nextInts();
		int[] B = nextInts();

		long[] ruiA = new long[N+1];
		long[] ruiB = new long[M+1];

		for(int i=1;i<ruiA.length;i++) {
			ruiA[i]=ruiA[i-1]+A[i-1];
		}
		for(int i=1;i<ruiB.length;i++) {
			ruiB[i]=ruiB[i-1]+B[i-1];
		}
		long ans = 0;
		int b =M;
		for(int i=0;i<N+1;i++) {
			if(ruiA[i]>K) {
				break;
			}
			while(ruiB[b]+ruiA[i]>K) {
				b--;
			}
			ans=Math.max(i+b,ans);
		}
		pw.println(ans);


	}
	public static void solveD(String[] args) throws Exception{
		int N = nextInt();

		long[] x = new long[10000001];
		Arrays.fill(x,1);
		for (int i = 2; i < x.length/2; i++) {
			int c = 2;
			long lim = (long)Math.pow(i,c-1);
			for(int k=i;k<x.length;k+=i) {
				if(lim <k) {
					c++;
					lim=(long)Math.pow(i,c-1);
				}
				x[k]*=c;
			}
		}

		long ans = 1;
		for(int i=2;i<=N;i++) {
			ans+=i*x[i];
		}
		pw.println(ans);

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

