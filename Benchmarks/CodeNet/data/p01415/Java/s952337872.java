import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

class UnionFind {
	int[] data;
	UnionFind(int size) {
		data = new int[size];
		Arrays.fill(data, -1);
	}
	boolean unionSet(int x, int y) {
		x = root(x); 
		y = root(y);
		if (x != y) {
			if (data[y] < data[x]) {
				int tmp = x;
				x = y;
				y = tmp;
			}
			data[x] += data[y]; 
			data[y] = x;
		}
		return x != y;
	}
	boolean findSet(int x, int y) {
		return root(x) == root(y);
	}
	int root(int x) {
		return data[x] < 0 ? x : (data[x] = root(data[x]));
	}
	int size(int x) {
		return -data[root(x)];
	}
}

public class Main {
	static final int INF = 2 << 28;
	static final long INF_L = 2L << 60;
	static final int  MOD = 1000000007;
	static final long MOD_L = 1000000007L;
	static final int[] vx_4 = {1,0,-1,0};
	static final int[] vy_4 = {0,-1,0,1};
	static final int[] vx_5 = {1,0,-1,0,0};
	static final int[] vy_5 = {0,1,0,-1,0};
	static final int[] vx_8 = {1,1,1,0,0,-1,-1,-1};
	static final int[] vy_8 = {1,0,-1,1,-1,1,0,-1};
	static final int[] vx_9 = {1,1,1,0,0,0,-1,-1,-1};
	static final int[] vy_9 = {1,0,-1,1,0,-1,1,0,-1};
	
	static char[] check;
	static int idx;
	
	public static void main(String[] args) {	
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int T = sc.nextInt();
		int U = sc.nextInt();
		int V = sc.nextInt();
		int L = sc.nextInt();
		
		boolean[] state = new boolean[L+1];
		for(int i = 0; i < N; i++) {
			state[sc.nextInt()] = true;
		}
		double time = 0;
		int    k    = 0;
		double timeX = 0;
		IN:for(int i = 0; i < L; i++) {
			if(state[i]) k++;
			if(Math.abs(timeX) <= 1.0e-4) {
				if(k != 0) {
					k--;
					timeX = T;
					timeX -= 1.0 / V;
					time += 1.0 / V;
					continue IN;
				}
				else {
					time += 1.0 / U;
					continue IN;
				}
			}
			else if(k == K+1) {
				k--;
				timeX = T;
			}
			
			timeX -= 1.0 / V;
			time  += 1.0 / V;
		}
		System.out.printf("%.10f\n",time);
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