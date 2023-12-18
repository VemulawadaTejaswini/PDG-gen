import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
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
	
	final long M=(long)1e9+7;
	
	int MAX=5000;
	
	long[] fac=new long[MAX];
	long[] ifac=new long[MAX];
	long[] inv=new long[MAX];
	{
		fac[0]=fac[1]=ifac[0]=ifac[1]=inv[0]=inv[1]=1;
		for (int i=2;i<MAX;++i) {
			fac[i]=i*fac[i-1]%M;
			inv[i]=M-M/i*inv[(int)M%i]%M;
			ifac[i]=inv[i]*ifac[i-1]%M;
		}
	}
	
	long comb(int n,int k) {
		if (n<0||k<0||n-k<0) return 0;
		return fac[n]*ifac[k]%M*ifac[n-k]%M;
	}
	
	void run() {
		FastScanner sc=new FastScanner();
		int S=sc.nextInt();
		long ans=0;
		for (int n=1;n<=S/3+10;++n) {
			int t=S-n*3;
			if (t<0) continue;
			ans+=comb(n+t-1,n-1);
			ans%=M;
		}
		System.out.println(ans);
	}
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
}