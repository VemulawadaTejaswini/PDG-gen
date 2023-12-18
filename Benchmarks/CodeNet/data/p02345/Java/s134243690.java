import java.util.Map.Entry;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	static int MOD = 1000000007;
	
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[] a = new int[n];
		Arrays.fill(a, (1<<31)-1);
		
		SegmentTree tree = new SegmentTree(a);
		for(int i = 0; i < q; i++){
			int com = sc.nextInt();
			
			if(com == 0){
				int index = sc.nextInt();
				int val = sc.nextInt();
				tree.updata(index, val);
			}else{
				int s = sc.nextInt();
				int t = sc.nextInt();
				System.out.println(tree.getMin(s, t+1));
			}
		}
	}
}

/*
 * セグメント木
 * RMQ(要素更新、区間中の最小値取得クエリ)による例
 */
class SegmentTree{
	int n;
	int[] node;
	
	//元配列vをセグメント木で表現する
	public SegmentTree(int[] v){
		int sz = v.length;
		n = 1;
		while(n < sz) n *= 2;
		node = new int[2*n-1];
		
		for(int i = 0; i < sz; i++)
			node[i+n-1] = v[i];
		for(int i = n-2; i >= 0; i--)
			node[i] = Math.min(node[2*i+1], node[2*i+2]);
	}
	
	//x番目の要素をvalに更新
	public void updata(int x, int val){
		x = x + n - 1;
		node[x] = val;
		while(x > 0){
			x = (x - 1) / 2;
			node[x] = Math.min(node[2*x+1], node[2*x+2]);
		}
	}
	
	/*
	 * query
	 * 指定した開区間[a,b)の最小値を求めるクエリ
	 */
	public int getMin(int a, int b){
		return getMin(a, b, 0, 0, n);
	}
	
	/*
	 *要求区間 [a, b)中の要素の最小値を答える
	 *k := 自分がいるノードのインデックス
	 *対象区間は [l, r) にあたる
	 */
	public int getMin(int a, int b, int k, int l, int r){
		//要求区間と対象区間が交わらない -> 適当に返す
		if(r <= a || b <= l) return Integer.MAX_VALUE;
		
		//要求区間が対象区間を完全に被覆 -> 対象区間を答えの計算に使う
		if(a <= l && r <= b) return node[k];
		
		/*
		 * 要求区間が対象区間の一部を被覆 -> 子について探索を行う
		 * 左側の子を vl ・ 右側の子を vr としている
		 * 新しい対象区間は、現在の対象区間を半分に割ったもの
		 */
		int vl = getMin(a, b, 2*k+1, l, (l+r)/2);
		int vr = getMin(a, b, 2*k+2, (l+r)/2, r);
		return Math.min(vl, vr);
	}
}

class FastScanner {
    private InputStream in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public FastScanner(InputStream in) {
		this.in = in;
	}
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
    private int readByte() {
    	if (hasNextByte()) return buffer[ptr++];
    	else return -1;
    }
    private static boolean isPrintableChar(int c){
    	return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
    	while(hasNextByte() && !isPrintableChar(buffer[ptr]))
    		ptr++; return hasNextByte();
    }
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
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
}

