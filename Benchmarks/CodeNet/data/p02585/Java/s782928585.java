import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.NoSuchElementException;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}

class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	void run() {
		FastScanner sc = new FastScanner();
		int N=sc.nextInt();
		long K=sc.nextLong();
		int[] P=new int[N];
		for (int i=0;i<N;++i) {
			P[i]=sc.nextInt()-1;
		}
		long[] C=new long[N];
		for (int i=0;i<N;++i) {
			C[i]=sc.nextLong();
		}
		long INF=Long.MAX_VALUE/3;
		long[][][] a=new long[N][31][3];
		for (int i=0;i<a.length;++i) {
			for (int j=0;j<a[i].length;++j) {
				for (int k=0;k<a[i][j].length;++k) {
					a[i][j][k]=-INF;
				}
			}
		}
		for (int i=0;i<N;++i) {
			a[i][0][0]=C[i];
			a[i][0][1]=C[i];
			a[i][0][2]=P[i];
		}
		for (int t=0;t+1<=30;++t) {
			for (int src=0;src<N;++src) {
				int m=(int)a[src][t][2];
				a[src][t+1][0]=a[src][t][0]+a[m][t][0];
				a[src][t+1][1]=Math.max(a[src][t][1],a[src][t][0]+a[m][t][1]);
				a[src][t+1][2]=a[m][t][2];
			}
		}
		long ans=-INF;
		for (int src=0;src<N;++src) {
			long first=0;
			long second=-INF;
			int cur=src;
			for (int shift=0;shift<=30;++shift) {
				if ((K>>shift)%2==0) continue;
				second=Math.max(second, first+a[cur][shift][1]);
				first=first+a[cur][shift][0];
				cur=(int)a[cur][shift][2];
			}
			ans=Math.max(ans, second);
		}
		System.out.println(ans);
	}
	
	void tr(Object...o) {System.out.println(Arrays.deepToString(o));}
}
