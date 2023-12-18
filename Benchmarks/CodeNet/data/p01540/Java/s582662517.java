import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.BiFunction;

public class Main{
	static Scanner scn = new Scanner(System.in);
	static FastScanner sc = new FastScanner();
	static PrintWriter ot = new PrintWriter(System.out);
	static Random rand = new Random();
	static int mod = 1000000007;
	static long modmod = (long)mod * mod;
	static long inf = (long)1e17;
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	static int[] dx8 = {-1,-1,-1,0,0,1,1,1};
	static int[] dy8 = {-1,0,1,-1,1,-1,0,1};
	static char[] dc = {'R','D','L','U'};
	static BiFunction<Integer,Integer,Integer> fmax = (a,b)-> {return Math.max(a,b);};
	static BiFunction<Integer,Integer,Integer> fmin = (a,b)-> {return Math.min(a,b);};
	static BiFunction<Integer,Integer,Integer> fsum = (a,b)-> {return a+b;};
	static BiFunction<Long,Long,Long> fmaxl = (a,b)-> {return Math.max(a,b);};
	static BiFunction<Long,Long,Long> fminl = (a,b)-> {return Math.min(a,b);};
	static BiFunction<Long,Long,Long> fsuml = (a,b)-> {return a+b;};
	static BiFunction<Integer,Integer,Integer> fadd = fsum;
	static BiFunction<Integer,Integer,Integer> fupd = (a,b)-> {return b;};
	static BiFunction<Long,Long,Long> faddl = fsuml;
	static BiFunction<Long,Long,Long> fupdl = (a,b)-> {return b;};
	static String sp = " ";
	static int N;
	static int M;
	public static void main(String[] args) {
		//AOJ2426 Treasure Hunt
		//author:Suunn
		//幾何らしくないと思う　座標圧縮と累積和で丁寧に実装
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		sc.nextIntses(N,x,y);
		TreeSet<Integer> xlist = new TreeSet<Integer>();
		TreeSet<Integer> ylist = new TreeSet<Integer>();
		for(int i=0;i<N;i++) {
			xlist.add(x[i]);
			ylist.add(y[i]);
		}
		xlist.add(-mod);
		xlist.add(mod);
		ylist.add(-mod);
		ylist.add(mod);
		TreeMap<Integer,Integer> xmap = new TreeMap<Integer,Integer>();
		TreeMap<Integer,Integer> ymap = new TreeMap<Integer,Integer>();
		
		int xidx = 1;
		for(int e:xlist) {
			xmap.put(e,xidx);
			xidx += 2;
		}
		int yidx = 1;
		for(int e:ylist) {
			ymap.put(e,yidx);
			yidx += 2;
		}
		int[][] a = new int[xidx+1][yidx+1];
		for(int i=0;i<N;i++) {
			int X = xmap.get(x[i]);
			int Y = ymap.get(y[i]);
			a[X][Y]++;
		}
		for(int i=0;i<=xidx;i++) { 
			for(int j=0;j<=yidx;j++) {
				if(i==0&&j==0)continue;
				else if(i==0)a[i][j] += a[i][j-1];
				else if(j==0)a[i][j] += a[i-1][j];
				else a[i][j] += a[i][j-1]+a[i-1][j]-a[i-1][j-1];
			}
		}
		
		for(int i=0;i<M;i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int X1 = xmap.get(xlist.ceiling(x1))-1;
			int Y1 = ymap.get(ylist.ceiling(y1))-1;
			int X2 = xmap.get(xlist.floor(x2));
			int Y2 = ymap.get(ylist.floor(y2));
			ot.println(a[X2][Y2]-a[X1][Y2]-a[X2][Y1]+a[X1][Y1]);
		}
		ot.flush();
	
		
	}
	
	
	


}


class FastScanner {
    private final java.io.InputStream in = System.in;
    private final byte[] b = new byte[1024];
    private int p = 0;
    private int bl = 0;
    private boolean hNB() {
        if (p<bl) {
            return true;
        }else{
            p = 0;
            try {
                bl = in.read(b);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (bl<=0) {
                return false;
            }
        }
        return true;
    }

	private int rB() { if (hNB()) return b[p++]; else return -1;}
    private static boolean iPC(int c) { return 33 <= c && c <= 126;}
    private void sU() { while(hNB() && !iPC(b[p])) p++;}
    public boolean hN() { sU(); return hNB();}
    public String next() {
        if (!hN()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = rB();
        while(iPC(b)) {
            sb.appendCodePoint(b);
            b = rB();
        }
        return sb.toString();
    }
    public char nextChar() {
    	return next().charAt(0);
    }
    public long nextLong() {
        if (!hN()) throw new NoSuchElementException();
        long n = 0;
        boolean m = false;
        int b = rB();
        if (b=='-') {
            m=true;
            b=rB();
        }
        if (b<'0'||'9'<b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0'<=b&&b<='9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1||!iPC(b)){
                return (m?-n:n);
            }else{
                throw new NumberFormatException();
            }
            b = rB();
        }
    }
    public int nextInt() {
        if (!hN()) throw new NoSuchElementException();
        long n = 0;
        boolean m = false;
        int b = rB();
        if (b == '-') {
            m = true;
            b = rB();
        }
        if (b<'0'||'9'<b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0'<=b&&b<='9') {
                n *= 10;
                n += b-'0';
            }else if(b==-1||!iPC(b)){
                return (int) (m?-n:n);
            }else{
                throw new NumberFormatException();
            }
            b = rB();
        }
    }
    public int[] nextInts(int n) {
    	int[] a = new int[n];
    	for(int i=0;i<n;i++) {
    		a[i] = nextInt();
    	}
    	return a;
    }
    public int[] nextInts(int n,int s) {
    	int[] a = new int[n+s];
    	for(int i=s;i<n+s;i++) {
    		a[i] = nextInt();
    	}
    	return a;
    }
    public long[] nextLongs(int n, int s) {
    	long[] a = new long[n+s];
    	for(int i=s;i<n+s;i++) {
    		a[i] = nextLong();
    	}
    	return a;
	}
    public long[] nextLongs(int n) {
    	long[] a = new long[n];
    	for(int i=0;i<n;i++) {
    		a[i] = nextLong();
    	}
    	return a;
    }
    public int[][] nextIntses(int n,int m){
    	int[][] a = new int[n][m];
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<m;j++) {
    			a[i][j] = nextInt();
    		}
    	}
    	return a;
    }

    public String[] nexts(int n) {
    	String[] a = new String[n];
    	for(int i=0;i<n;i++) {
    		a[i] = next();
    	}
    	return a;
    }
    void nextIntses(int n,int[] ...m) {
    	int l = m[0].length;
    	for(int i=0;i<l;i++) {
    		for(int j=0;j<m.length;j++) {
    			m[j][i] = nextInt();
    		}
    	}
    }
    void nextLongses(int n,long[] ...m) {
    	int l = m[0].length;
    	for(int i=0;i<l;i++) {
    		for(int j=0;j<m.length;j++) {
    			m[j][i] = nextLong();
    		}
    	}
    }

}






