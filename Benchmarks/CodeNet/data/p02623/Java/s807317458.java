import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	void run() {
		FastScanner sc=new FastScanner();
		int N=sc.nextInt();
		int M=sc.nextInt();
		long K=sc.nextLong();
		long[] A=new long[N];
		long[] B=new long[M];
		for (int i=0;i<N;++i) {
			A[i]=sc.nextLong();
			if (i>0) A[i]+=A[i-1];
		}
		for (int i=0;i<M;++i) {
			B[i]=sc.nextLong();
			if (i>0) B[i]+=B[i-1];
		}
		int p=0;
		long ans=0;
		while (p<N && A[p]<=K) ++p;
		for (int q=0;q<=M;++q) {
			while (p>0 && (p==0?0:A[p-1])+(q==0?0:B[q-1])>K) --p;
			long v=(p==0?0:A[p-1])+(q==0?0:B[q-1]);
			if (v<=K) ans=Math.max(ans, p+q);
		}
		System.out.println(ans);
	}

	void tr(Object...o) {System.out.println(Arrays.deepToString(o));}
}

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
