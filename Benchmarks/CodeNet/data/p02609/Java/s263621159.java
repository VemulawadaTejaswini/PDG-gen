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
		int L= nextInt();
		int R= nextInt();
		int d= nextInt();
		int ans=0;
		for(;L<=R;L++) {
			if(L%d==0) {
				ans++;
			}
		}
		pw.println(ans);
	}
	public static void solveB(String[] args) throws Exception{
		int N = nextInt();

		int[] a = nextInts();
		int ans = 0;
		for(int i=0;i<N;i++) {
			if(i%2==0&&a[i]%2==1) {
				ans++;
			}
		}

		pw.println(ans);
	}
	public static void solveC(String[] args) throws Exception{
		int N = nextInt();
//		long x=System.currentTimeMillis();
		for(int i=1;i<=N;i++) {
			pw.println(fc(i));
		}
//		pw.println(System.currentTimeMillis()-x);
	}

	public static int fc(int n) {
		int ans = 0;
		int m = (int)Math.sqrt(n);
		for(int x=1;x<=m;x++) {
			for(int y=1;y<=m;y++) {
				for(int z=1;z<=m;z++) {
					long tmp =  x*x+y*y+z*z+x*y+y*z+x*z;
					if(tmp==n) {
						ans++;
					}else if(tmp>n) {
						break;
					}
				}
			}
		}
		return ans;
	}

	public static void solveD(String[] args) throws Exception{
		int N = nextInt();
		char[] X = nextString().toCharArray();
		int bNum = 0;
		for(int i=0;i<X.length;i++) {
			if(X[i]=='1') {
				bNum++;
			}
		}
		int[] modP = new int[N];
		int[] modN = new int[N];
		modP[0]=1;
		modN[0]=1;
		for(int i=1;i<modP.length;i++) {
			modP[i]=(modP[i-1]*2)%(bNum+1);
			if(bNum-1!=0) {
				modN[i]=(modN[i-1]*2)%(bNum-1);
			}else {
				modN[i]=0;
			}
		}

		long ruiP = 0;
		long ruiN = 0;
		for(int i=0;i<N;i++) {
			if(X[N-i-1]=='1') {
				ruiN+=modN[i];
				ruiP+=modP[i];
			}else {
			}
		}
		for(int i=0;i<N;i++) {
			int ans = 1;
			if(X[i]=='1') {
				long tmp = ruiN-modN[N-i-1];
				if(bNum-1!=0) {
					tmp%=bNum-1;
					while(tmp!=0) {
						tmp%=Long.bitCount(tmp);
						ans++;
					}
				}else {
					ans=0;
				}
			}else {
				long tmp = ruiP+modP[N-i-1];
				tmp%=bNum+1;
				while(tmp!=0) {
					tmp%=Long.bitCount(tmp);
					ans++;
				}

			}
			pw.println(ans);
		}
	}

	/* pow(a,n) % modの繰り返し2乗法による計算 */
	public static long modPow(long a, long n, long mod) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return a % mod;
		}
		if (n % 2 == 1) {
			return (a * modPow(a, n - 1, mod)) % mod;
		}
		long t = modPow(a, n / 2, mod);
		return (t * t) % mod;

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

