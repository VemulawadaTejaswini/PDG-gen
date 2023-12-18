import java.io.InputStream;
import java.util.NoSuchElementException;
public class Main {
	public static void main(String[] args)throws Exception{
		int N=nextInt();
		int K=nextInt();
		int A[]=new int[N];
		int L[]=new int[N];
		int R[]=new int[N];
		boolean ans=false;
		for(int i=0;i<N;i++){
			A[i]=nextInt();
			if(i-A[i]<0)
				L[0]++;
			else
				L[i-A[i]]++;
			if(i+A[i]>N-1)
				R[N-1]++;
			else
				R[i+A[i]]++;
		}
		for(int j=0;j<K;j++){
			int cout=0,key=0;
			if(ans==false){
				for(int i=0;i<N;i++){
					key+=L[i];
					A[i]=key+cout;
					cout++;
					key--;
					cout-=R[i];
				}
				ans=true;
				R=new int[N];
				L=new int[N];
				for(int i=0;i<N;i++){
					if(i-A[i]<=0)
						L[0]++;
					else{
						L[i-A[i]]++;
						ans=false;
					}
					if(i+A[i]>=N-1)
						R[N-1]++;
					else{
						R[i+A[i]]++;
						ans=false;
					}
				}
			}
			else{
				for(int i=0;i<N;i++){
					System.out.println((long)A[i]+(long)(K-1-j)*N);
				}
				System.exit(0);
			}
		}
		for(int i=0;i<N;i++){
			System.out.println(A[i]);
		}
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
