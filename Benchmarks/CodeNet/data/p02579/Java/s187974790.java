import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
public class Main {
	public static void main(String[] args)throws Exception{
		PrintWriter out = new PrintWriter(System.out);
		int H=nextInt();
		int W=nextInt();
		int ch=nextInt()-1;
		int cw=nextInt()-1;
		int dh=nextInt()-1;
		int dw=nextInt()-1;
		boolean S[][]=new boolean[H][W];
		boolean V[][]=new boolean[H][W];
		boolean wv[][]=new boolean[H][W];
		int min[][]=new int[H][W];
		Deque<Integer> X=new ArrayDeque<Integer>();
		Deque<Integer> Y=new ArrayDeque<Integer>();
		Deque<Integer> wx=new ArrayDeque<Integer>();
		Deque<Integer> wy=new ArrayDeque<Integer>();
		Deque<Integer> wc=new ArrayDeque<Integer>();
		for(int i=0;i<H;i++){
			String a=next();
			for(int j=0;j<W;j++){
				char b=a.charAt(j);
				if(b=='.')
					S[i][j]=true;
			}
		}
		X.add(cw);Y.add(ch);
		V[ch][cw]=true;
		while(X.size()>0){
			while(X.size()>0){
				int x=X.poll();
				int y=Y.poll();
				for(int i=y-2;i<y+3;i++){
					for(int j=x-2;j<x+3;j++){
						if((i!=y||j!=x)&&0<=i&&i<H&&0<=j&&j<W)
							if(((i==y&&j==x-1)||(i==y&&j==x+1)||(i==y-1&&j==x)||(i==y+1&&j==x))&&V[i][j]==false){
								if(S[i][j]){
									X.add(j);Y.add(i);
									min[i][j]=min[y][x];
									V[i][j]=true;
								}
							}
							else
								if(S[i][j]&&wv[i][j]==false){
									wx.add(j);wy.add(i);wc.add(min[y][x]+1);
									wv[i][j]=true;
								}
					}
				}
			}
			while(wx.size()>0){
				int x=wx.poll();
				int y=wy.poll();
				int cnt=wc.poll();
				if(V[y][x]==false){
					min[y][x]=cnt;
					X.add(x);Y.add(y);
					V[y][x]=true;
				}
			}
		}
		if(V[dh][dw]==false)
			System.out.println(-1);
		else
			System.out.println(min[dh][dw]);
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

