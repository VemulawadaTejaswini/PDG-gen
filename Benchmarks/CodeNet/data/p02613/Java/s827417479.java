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
		solveB(args);
//		solveC(args);
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

	}
	public static void solveD(String[] args) throws Exception{

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

