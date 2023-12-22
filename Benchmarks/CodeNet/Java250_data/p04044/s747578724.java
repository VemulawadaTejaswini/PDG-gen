import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static String minS = "";
	public static void main(String[] args) throws Exception {

		int N=nextInt();
		int L=nextInt();
		String[] S = new String[N];
		for(int i=0;i<N;i++){
			S[i]=nextString();
			minS+=S[i];
		}
		Arrays.sort(S);
		boolean[] flg = new boolean[N];
		Arrays.fill(flg, true);
		int cnt=0;
		String ans = "";
		while(cnt <N){
			int min = -1;
			String tmp=null;
			int len=-1;
			for(int i=0;i<N;i++){
				if(flg[i]){
					min=i;
					tmp=S[i];
					len=tmp.length();
					break;
				}
			}

			for(int i=0;i<N;i++){
				if(flg[i]&&tmp.compareTo(S[i].substring(0,len)) > 0){
					tmp=S[i].substring(0,len);
					min=i;
				}
			}

			ans+=S[min];
			cnt++;
			flg[min]=false;
		}

		System.out.println(ans);
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
