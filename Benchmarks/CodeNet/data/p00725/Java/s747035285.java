import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;
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
		//AOJ1144 Curling 2.0
		//author:Suunn
		//やるだけっぽい
		//再帰の引数にステップ数を持つのが工夫ポイント？
		
		//ゴール消失バグを起こして3時間くらいハマった
		
		while(true) {
			N = sc.nextInt();
			M = sc.nextInt();
			if(N==0&&M==0)break;
			int[][] b = new int[M][N];
			for(int i=0;i<M;i++) {
				for(int j=0;j<N;j++)b[i][j] = sc.nextInt();
			}
			int ans = solve(b,0);
			System.out.println(ans>=11?-1:ans);
			
		}
	}

	private static int solve(int[][] b, int t) {
		if(t==10) return 11;
		int ret = 11;
		int x = -1;
		int y = -1;
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(b[i][j]==2) {
					x = i;
					y = j;
				}
			}
		}
		for(int i=x;i>=0;i--) {
			if(b[i][y]==3) {
				ret = Math.min(ret, t+1);
				break;
			}
			if(b[i][y]==1) {
				if(i==x-1)break;
				else {
					b[i][y] = 0;
					b[x][y] = 0;
					b[i+1][y] = 2;
					ret = Math.min(ret,solve(b,t+1));
					b[i][y] = 1;
					b[x][y] = 2;
					b[i+1][y] = 0;
				}
				break;
			}
		}
		for(int i=x;i<M;i++) {
			if(b[i][y]==3) {
				ret = Math.min(ret, t+1);
				break;
			}
			if(b[i][y]==1) {
				if(i==x+1)break;
				else {
					b[i][y] = 0;
					b[x][y] = 0;
					b[i-1][y] = 2;
					ret = Math.min(ret,solve(b,t+1));
					b[i][y] = 1;
					b[x][y] = 2;
					b[i-1][y] = 0;
				}
				break;
			}
		}
		for(int i=y;i>=0;i--) {
			if(b[x][i]==3) {
				ret = Math.min(ret, t+1);
				break;
			}
			if(b[x][i]==1) {
				if(i==y-1)break;
				else {
					b[x][i] = 0;
					b[x][y] = 0;
					b[x][i+1] = 2;
					ret = Math.min(ret,solve(b,t+1));
					b[x][i] = 1;
					b[x][y] = 2;
					b[x][i+1] = 0;
				}
				break;
			}
		}
		for(int i=y;i<N;i++) {
			if(b[x][i]==3) {
				ret = Math.min(ret, t+1);
				break;
			}
			if(b[x][i]==1) {
				if(i==y+1)break;
				else {
					b[x][i] = 0;
					b[x][y] = 0;
					b[x][i-1] = 2;
					ret = Math.min(ret,solve(b,t+1));
					b[x][i] = 1;
					b[x][y] = 2;
					b[x][i-1] = 0;
				}
				break;
			}
		}
		return ret;
			
		
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






