import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
public class Main {
	public static void main(String[] args)throws Exception{
		PrintWriter out = new PrintWriter(System.out);
		int N=nextInt();
		int K=nextInt();
		ArrayList<Integer> P=new ArrayList<Integer>();
		ArrayList<Integer> M=new ArrayList<Integer>();
		int p=0,m=0,tm=0;
		int mip=0,mim=0,mod=1000000007;
		long ans=1,A=0,B=0;
		for(int i=0;i<N;i++){
			int a=nextInt();
			if(a>=0){
				P.add(a);p++;
			}
			else{
				M.add(a);m++;
			}
		}
		Collections.sort(P);
		Collections.sort(M);
		if(p==0&&K%2==1){
			for(int i=0;i<K;i++){
				ans*=M.get(m-i-1);ans%=mod;
			}
			ans=lmod(ans,mod);
			System.out.println(ans);
			System.exit(0);
		}
		for(int i=0;i<K;i++){
			if(tm==m||p==0)
				if(tm==m){
					ans*=P.get(p-1);ans%=mod;
					mip=P.get(p-1);p--;
				}
				else{
					ans*=M.get(tm);ans%=mod;
					mim=M.get(tm);tm++;
				}
			else
				if(Math.abs(M.get(tm))>=P.get(p-1)){
					ans*=M.get(tm);ans%=mod;
					mim=M.get(tm);tm++;
				}
				else{
					ans*=P.get(p-1);ans%=mod;
					mip=P.get(p-1);p--;
				}
		}A=ans;B=ans;
		if(tm!=m&&ans<0){
			A=modinv(A,mip);
			A*=M.get(tm+1);A=lmod(A,mod);
		}
		if(p!=0&&ans<0){
			B=modinv(B,mim);
			B*=P.get(p-1);B=lmod(B,mod);
		}
		ans=lmod(ans,mod);
		if(A>=B)
			System.out.println(A);
		else
			System.out.println(B);
	}
	 public static long lmod(long i, long j) {
	     return (i%j)<0?(i%j)+0+(j<0?-j:j):(i%j+0);
	 }
	 public static long modinv(long a,long m) {
			long b = m, u = 1, v = 0;
			while (b>0) {
				long t = a / b;
				long k=0;
				a -= t * b; k=a;a=b;b=k;
				u -= t * v; k=u;v=u;u=k;
			}
			u %= m;
			if (u < 0) u += m;
			return u;
	}
	static boolean isOK(int index,int key,ArrayList<Integer>a){
		if (a.get(index) >= key) return true;
	    else return false;
	}
	static int binary_search(int key,ArrayList<Integer> a) {
	    int ng = -1; //「index = 0」が条件を満たすこともあるので、初期値は -1
	    int ok = (int)a.size(); // 「index = a.size()-1」が条件を満たさないこともあるので、初期値は a.size()
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

