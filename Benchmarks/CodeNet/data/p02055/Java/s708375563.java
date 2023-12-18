import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.math.BigInteger;

public class Main implements Runnable {
	
	//static int mod = 1000000007;
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 1024 * 1024 * 1024).start();
    }
    
    public void run() {
        PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        
        int n = sc.nextInt();
        int r = sc.nextInt();
        
        int[] p = sc.nextintArray(n);
        for(int i=0;i<n;i++){
        	p[i]--;
        }
        
        UnionFind uft = new UnionFind(n);
        
        for(int i=0;i<n;i++){
        	uft.unite(i, p[i]);
        }
        
        ArrayList<Integer> size = new ArrayList<>();
        
        boolean[] checked = new boolean[n];
        int onenum = 0;
        
        for(int i=0;i<n;i++){
        	int root = uft.find(i);
        	if(!checked[root]){
        		checked[root] = true;
        		int ssize = uft.setSize(root);
        		if(ssize == 1){
        			onenum++;
        		}
        		else{
        			size.add(ssize);
        		}
        	}
        }
        
        if(size.size() == 0){
        	out.println("Yes");
        	out.flush();
        	return;
        }

        BitVector dp = new BitVector(r+1);
        dp.set(0);
        if(size.get(0)<=r){
            dp.set(size.get(0));
        }
        
        for(int i=0;i<size.size()-1;i++){
        	dp.shiftLOr(size.get(i+1));
        }
        
        boolean can = false;
        
        for(int i=0;i<=onenum && r-i>=0;i++){
        	if(dp.get(r-i)){
        		can = true;
        		break;
        	}
        }

        if(can){
        	out.println("Yes");
        }
        else{
        	out.println("No");
        }
        
        out.flush();
    }
    
}

class BitVector {
    public int n;
    public int m;
    public long[] bits;

    public BitVector(int length) {
        n = length;
        bits = new long[(n+63)>>>6];
        m = bits.length;
    }

    public void set(int at) {
        bits[at>>>6] |= 1L<<(at&63);
    }

    public void set(int at, boolean s) {
        if (s) {
            bits[at>>>6] |= 1L<<(at&63);
        } else {
            bits[at>>>6] &= ~(1L<<(at&63));
        }
    }

    public boolean get(int at) {
        int big = at >>> 6 ;
        if (big >= bits.length) {
            return false;
        }
        return ((bits[big] >>> (at&63)) & 1) == 1;
    }

    public BitVector shiftLeft(int l) {
        BitVector ret = new BitVector(n+l);
        int big = l >>> 6;
        int small = l & 63;
        for (int i = 0; i < m ; i++) {
            ret.bits[i+big] |= bits[i] << small;
        }
        if (small >= 1) {
            for (int i = 0; i+big+1 < ret.m; i++) {
                ret.bits[i+big+1] |= (bits[i] >>> (64-small));
            }
        }
        return ret;
    }
    
	void shiftLOr(int shift) {
		int m1 = shift >> 6;
		int m2 = shift & 63;
		if (m2 == 0) {
			for (int i = bits.length - 1 - m1; i >= 0; i--) {
				bits[i + m1] |= bits[i];
			}
		} else {
			for (int i = bits.length - 1 - m1; i >= 0; i--) {
				int p1 = i + m1 + 1;
				int p2 = i + m1;
				long v1 = bits[i] >>> (64 - m2);
				long v2 = bits[i] << m2;
				if (p1 < bits.length) {
					bits[p1] |= v1;
				}
				bits[p2] |= v2;
			}
		}
	}

    public BitVector or(BitVector o) {
        BitVector ans = new BitVector(Math.max(n, o.n));
        for (int i = 0; i < ans.m ; i++) {
            if (i < m) {
                ans.bits[i] = bits[i];
            }
            if (i < o.m) {
                ans.bits[i] |= o.bits[i];
            }
        }
        return ans;
    }
}

class UnionFind {
	int[] par;
	int[] rank;
	int[] peers; //集合の要素数用
	
	public UnionFind(int n){
		par = new int[n];
		rank = new int[n];
		peers = new int[n];
		
		for(int i=0;i<n;i++){
			par[i] = i;
			peers[i] = 1;
		}
	}
	
	//木の根を求める
	int find(int x){
		if(par[x] == x){
			return x;
		}
		else{
			return par[x] = find(par[x]);	//経路圧縮
		}
	}
	
	//xとyの属する集合を併合
	public void unite(int x, int y){
		int px = find(x);
		int py = find(y);
		
		if(px == py){
			return;
		}
		else if(rank[px] < rank[py]){
			peers[py] += peers[px];
			par[px] = py;

		}
		else{
			peers[px] += peers[py];
			par[py] = px;
			if(rank[px]==rank[py]){
				rank[px]++;
			}
		}
		
	}
	
	//xとyが同じ集合に属するか
	public boolean isSame(int x, int y){
		return find(x) == find(y);
	}
	
	//xの仲間の数を求める
	public int setSize(int x){
		return peers[find(x)];
	}

	//頂点数
	public int N(){
		return par.length;
	}
	
	//全体でいくつの集合に分かれているか
	public int numOfSet(){
		int ans = 0;
		boolean[] checked = new boolean[N()];
		for(int i=0;i<N();i++){
			int r = find(i);
			if(!checked[r]){
				checked[r] = true;
				ans++;
			}
		}
		return ans;
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
		} else {
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
	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}
	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
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
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}
	public int[] nextintArray(int n){
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public long[] nextlongArray(int n){
		long[] a = new long[n];
		for(int i=0;i<n;i++){
			a[i] = nextLong();
		}
		return a;
	}
	public Integer[] nextIntegerArray(int n){
		Integer[] a = new Integer[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public int[][] nextintMatrix(int h, int w){
		int[][] mat = new int[h][w];
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				mat[i][j] = nextInt();
			}
		}
		return mat;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
