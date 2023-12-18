import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.math.BigInteger;
 
public class Main implements Runnable {
	
	static int mod = 1000000007;
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 1024 * 1024 * 1024).start();
    }
    
    public void run() {
    	PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();

        int n = sc.nextInt();
        int q = sc.nextInt();
    	WeightedUnionFind uf = new WeightedUnionFind(n);
        
        for(int i=0;i<q;i++){
        	int t = sc.nextInt();
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	
        	if(t==0){
        		long w = sc.nextLong();
        		uf.unite(x, y, new AbelWeight(w));
        	}
        	else{
        		if(!uf.isSame(x, y)){
        			out.println("?");
        		}
        		else{
        			out.println(uf.diff(y,x).value);
        		}
        	}
        }

        out.flush();
    }
    
}

class WeightedUnionFind {
	int[] par;
	int[] rank;
	AbelWeight[] diff;	//親ノードとのweightの差
	
	static AbelWeight ide = AbelWeight.ide();
	
	public WeightedUnionFind(int n){
		par = new int[n];
		rank = new int[n];
		diff = new AbelWeight[n];
		for(int i=0;i<n;i++){
			diff[i] = ide;
		}
		
		for(int i=0;i<n;i++){
			par[i] = i;
		}
	}
	
	//木の根を求める
	int find(int x){
		if(par[x] == x){
			return x;
		}
		else{
			int root = find(par[x]);
			diff[x] = diff[x].ope(diff[par[x]]); //重みの累積和
			return par[x] = root;	//経路圧縮	
		}
	}
	
	//親とのweightの差を求めつつ経路圧縮
	AbelWeight weight(int x){
		find(x);
		return diff[x];
	}
	
	//y-x
	AbelWeight diff(int y, int x){
		return weight(y).ope(weight(x).inv());
	}
	
	//big = small + w
	public void unite(int small, int big, AbelWeight w){
		w = w.ope(weight(small));
		w = w.ope(weight(big).inv());
		
		int px = find(small);
		int py = find(big);
		
		if(px == py){
			return;
		}
		else if(rank[px] < rank[py]){
			par[px] = py;
			diff[px] = w.inv();	//pyがpxの親になる

		}
		else{
			par[py] = px;
			if(rank[px]==rank[py]){
				rank[px]++;
			}
			diff[py] = w;	//pxがpyの親になる	
		}
		
	}
	
	//xとyが同じ集合に属するか
	public boolean isSame(int x, int y){
		return find(x) == find(y);
	}

}

//アーベル群
class AbelWeight{
	long value;
	
	public AbelWeight(long value){
		this.value = value;
	}
	
	//単位元
	static AbelWeight ide(){
		return new AbelWeight(0);
	}
	
	//逆元
	AbelWeight inv(){
		return new AbelWeight(-value);
	}
	
	//演算
	AbelWeight ope(AbelWeight y){
		return new AbelWeight(this.value + y.value);
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
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
