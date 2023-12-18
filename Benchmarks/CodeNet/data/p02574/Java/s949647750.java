import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
public class Main {
	public static void main(String[] args)throws Exception{
		PrintWriter out = new PrintWriter(System.out);
		int N=nextInt();
		boolean V[]=new boolean[10000];
		ArrayList<Integer> prime=new ArrayList<Integer>();
		boolean pair=true;
		int x=1,ans=0;
		prime.add(2);
		for(int i=3;i<=Math.sqrt(1000000);i+=2){
			boolean key=false;
			for(int j=0;j<prime.size();j++){
				if(i%prime.get(j)==0){
					key=true;
					break;
				}
			}
			if(key==false)
				prime.add(i);
		}
		for(int i=0;i<N;i++){
			int A=nextInt();
			if(i==0)
				ans=A;
			else
				ans=gcd(ans,A);
			if(pair) for(int j=0;j<prime.size()&&prime.get(j)<=A;j++){
				if(A%prime.get(j)==0){
					while(A%prime.get(j)==0){
						A/=prime.get(j);
					}
					if(V[j]==false)
						V[j]=true;
					else{
						pair=false;
						break;
					}
				}
			}
			if(A>prime.get(prime.size()-1)){
				V[prime.size()]=true;
				prime.add(A);
			}
		}
		if(pair)
			System.out.println("pairwise coprime");
		else if(ans==1)
			System.out.println("setwise coprime");
		else
			System.out.println("not coprime");
	}
	public static int gcd(int m, int n) {
        int r;
        while (n > 0) {
            r = m % n;
            m = n;
            n = r;
        }
        return m;
    }
	public static long lmod(long i, long j) {
	     return (i%j)<0?(i%j)+0+(j<0?-j:j):(i%j+0);
	 }
	static boolean isOK(int index,int key,ArrayList<Integer> a){
		if (a.get(index)>=key) return true;
	    else return false;
	}
	static int binary(int key,ArrayList<Integer> a) {
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

