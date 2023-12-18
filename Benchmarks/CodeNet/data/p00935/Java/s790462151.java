import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static final int INF = 2 << 28;
	static final long INF_L = 2L << 60;
	static final int  MOD = 1000000007;
	static final long MOD_L = 1000000007L;
	static final int[] vx_4 = {1,0,-1,0};
	static final int[] vy_4 = {0,1,0,-1};
	static final int[] vx_5 = {1,0,-1,0,0};
	static final int[] vy_5 = {0,1,0,-1,0};
	static final int[] vx_8 = {1,1,1,0,0,-1,-1,-1};
	static final int[] vy_8 = {1,0,-1,1,-1,1,0,-1};
	static final int[] vx_9 = {1,1,1,0,0,0,-1,-1,-1};
	static final int[] vy_9 = {1,0,-1,1,0,-1,1,0,-1};
	
	static int idx;
	static char[] in;
	public static void main(String[] args) {	
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		while(true) {
			int n = sc.nextInt();
			int[] in = new int[n];
			for(int i = 0; i < n; i++) in[i] = sc.nextInt();
			HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
			for(int i = 0; i < n; i++) {
				map.put(in[i], true);
			}
			for(int i = 0; i < n-1; i++) {
				map.put(in[i] * 10 + in[i+1], true);
			}
			for(int i = 0; i < n-2; i++) {
				map.put(in[i] * 100 + in[i+1] * 10 + in[i+2], true);
			}
			for(int i = 0; i < n-3; i++) {
				map.put(in[i] * 1000 + in[i+1] * 100 + in[i+2] * 10 + in[i+3], true);
			}
			for(int i = 0; i < n-4; i++) {
				map.put(in[i] * 10000 + in[i+1] * 1000 + in[i+2] * 100 + in[i+3] * 10 + in[i+4], true);
			}
			for(int i = 0; ; i++) {
				if(!map.containsKey(i)) {
					System.out.println(i);
					break;
				}	
			}
			break;
			
			
		}
	}
		
	
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
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
    	if (!hasNext()) throw new NoSuchElementException();
        int n = 0;
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
}