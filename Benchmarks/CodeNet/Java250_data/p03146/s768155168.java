import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static void main(String[] args) throws Exception {

		int s = nextInt();

		long ans = 1;
		long[] a = new long[1000000];
		Arrays.fill(a, -1);
		a[0]=s;
		int k=1;
		boolean flg=true;
		while(flg){
			if(a[k-1]%2==0){
				a[k]=a[k-1]/2;
			}else{
				a[k]=a[k-1]*3+1;

			}
			for(int i=0;i<k;i++){
				if(a[k]==a[i]){
					flg=false;
					break;
				}
			}
			k++;
		}
		System.out.println(k);
	}

	public static boolean isExpN(long a,int base){
		int x=1;
		while((int)Math.pow(x, 2) <= a){
			if((int)Math.pow(x, 2) == a){
				return true;
			}
			x*=base;
		}
		return false;
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
