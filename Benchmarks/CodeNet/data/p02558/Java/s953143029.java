import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

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
	
	int[] p=new int[200000];
	{
		Arrays.fill(p, -1);
	}
	
	int root(int x) {
		return p[x]==-1?x:(p[x]=root(p[x]));
	}
	
	void unite(int x,int y) {
		x=root(x);y=root(y);
		if (x!=y) p[x]=y;
	}
	
	boolean equiv(int x,int y) {
		return root(x)==root(y);
	}
	
	void run() {
		FastScanner sc=new FastScanner();
		int N=sc.nextInt();
		int Q=sc.nextInt();
		PrintWriter pw=new PrintWriter(System.out);
		while (Q-->0) {
			int t=sc.nextInt();
			int u=sc.nextInt();
			int v=sc.nextInt();
			if (t==0) unite(u,v);
			else pw.println(equiv(u,v)?1:0);
		}
		pw.flush();
	}
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
}
