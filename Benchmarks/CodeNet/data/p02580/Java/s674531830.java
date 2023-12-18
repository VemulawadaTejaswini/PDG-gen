import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
public class Main {
	public static void main(String[] args)throws Exception{
		PrintWriter out = new PrintWriter(System.out);
		int H=nextInt();
		int W=nextInt();
		int M=nextInt();
		int h[]=new int[H];
		int w[]=new int[W];
		int Y[]=new int[M];
		int X[]=new int[M];
		boolean A[]=new boolean[H];
		boolean B[]=new boolean[W];
		long hmax=0,wmax=0,sum=0,hans=0,wans=0;
		for(int i=0;i<M;i++){
			int y=nextInt()-1;
			int x=nextInt()-1;
			Y[i]=y;X[i]=x;
			h[y]++;w[x]++;
			if(h[y]>hmax){
				hmax=h[y];
			}
			if(w[x]>wmax){
				wmax=w[x];
			}
		}
		for(int i=0;i<M;i++){
			if((wmax==w[X[i]]&&hmax==h[Y[i]])){
				sum++;
			}
			if(A[Y[i]]==false&&h[Y[i]]==hmax){
				hans++;A[Y[i]]=true;
			}
			if(B[X[i]]==false&&w[X[i]]==wmax)
				wans++;B[X[i]]=true;
		}
		if(sum>=hans*wans)
			hmax--;
		System.out.println(hmax+wmax);
	}
	public static long lmod(long i, long j) {
	     return (i%j)<0?(i%j)+0+(j<0?-j:j):(i%j+0);
	 }
	static boolean isOK(int index,int key,int[]a){
		if (a[index]>=key) return true;
	    else return false;
	}
	static int binary_search(int key,int[] a) {
	    int ng = -1; //「index = 0」が条件を満たすこともあるので、初期値は -1
	    int ok = (int)a.length; // 「index = a.size()-1」が条件を満たさないこともあるので、初期値は a.size()
	    while (Math.abs(ok - ng) > 1) {
	        int mid = (ok + ng) / 2;
	        if (isOK(mid,key,a)) ok = mid;
	        else ng = mid;
	    }
	    return ok;
	}
	//FastScanner
	static InputStream in = System.in;
	static  byte[] buffer = new byte[1024];
	static int length = 0, p = 0;
	public static boolean hasNextByte () {
		if (p < length) return true;
		else {
			p = 0;
			try {length = in.read(buffer);}
			catch (Exception e) {e.printStackTrace();}
			if (length == 0) return false;
		}
		return true;
	}
	public static int readByte () {
		if (hasNextByte() == true) return buffer[p++];
		return -1;
	}
	public static boolean isPrintable (int n) {return 33<=n&&n<=126;}
	public static void skip () {
		while (hasNextByte() && !isPrintable(buffer[p])) p++;
	}
	public static boolean hasNext () {skip(); return hasNextByte();}
	public static String next () {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int temp = readByte();
		while (isPrintable(temp)) {
			sb.appendCodePoint(temp);
			temp = readByte();
		}
		return sb.toString();
	}
	public static int nextInt () {return Math.toIntExact(nextLong());}
	public static int[] nextInts (int n) {
		int[] ar = new int[n];
		for (int i=0; i<n; i++) ar[i] = nextInt();
		return ar;
	}
	public static long nextLong () {
		if (!hasNext()) throw new NoSuchElementException();
		boolean minus = false;
		int temp = readByte();
		if (temp == '-') {
			minus = true;
			temp = readByte();
		}
		if (temp<'0' || '9'<temp) throw new NumberFormatException();
		long n = 0;
		while (isPrintable(temp)) {
			if ('0'<=temp && temp<='9') {
				n *= 10;
				n += temp - '0';
			}
			temp = readByte();
		}
		return minus? -n : n;
	}
}

