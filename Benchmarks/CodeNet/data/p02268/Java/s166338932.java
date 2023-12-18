import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;
public class Main {
	public static void main(String[] args)throws Exception{
		PrintWriter out = new PrintWriter(System.out);
		int n=nextInt();
		int S[]=new int[n];
		int k=-1;
		for(int i=0;i<n;i++){
			S[i]=nextInt();
			if(S[i]==k)
				S[i]=-1;
			else
				if(k!=S[i])
					k=S[i];
		}
		int q=nextInt();
		int T[]=new int[q];
		for(int i=0;i<q;i++)T[i]=nextInt();
		int ans=0;
		Arrays.sort(T);
		for(int i=0;i<n;i++){
			int a=Arrays.binarySearch(T,S[i]);
			if(a<q&&0<=a&&T[a]==S[i])
				ans++;
		}
		System.out.println(ans);
	}
	static boolean isOK(int index,int key,int[]a){
		if (key>=a[index]) return true;
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


