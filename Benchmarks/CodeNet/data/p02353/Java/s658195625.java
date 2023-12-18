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
        
        LazySegmentTree t = new LazySegmentTree(n);
        
        for(int i=0;i<q;i++){
        	int c = sc.nextInt();
        	
        	if(c==0){
            	int s = sc.nextInt();
            	int e = sc.nextInt();
            	int x = sc.nextInt();
        		t.update(s,e+1, new Action(x,i));
        	}
        	else{
        		int x = sc.nextInt();
        		int y = sc.nextInt();
        		out.println(t.query(x, y+1).value);
        	}
        }
        
        out.flush();
    }

}

class LazySegmentTree {
	
	Data[] tree;
	Action[] lazy;
	
	//要素数で初期化
	public LazySegmentTree(int n){
		int num = 1;
		while(num<n){
			num = num*2;
		}
		tree = new Data[num*2-1];
		Arrays.fill(tree,id_T);
		lazy = new Action[num*2-1];
		Arrays.fill(lazy,id_E);
	}
	
	//配列で初期化
	public LazySegmentTree(Data[] start){
		int num = 1;
		while(num<start.length){
			num = num*2;
		}
		tree = new Data[num*2-1];
		Arrays.fill(tree,id_T);
		lazy = new Action[num*2-1];
		Arrays.fill(lazy,id_E);
		
		for(int i=0;i<start.length;i++){
			update(i,start[i]);
		}
	}

	//演算
	Data ope(Data x, Data y){
		return new Data(x.value + y.value);
	}
	
	//単位元
	static Data id_T = new Data(0);

	//sbjのobjへの作用
	Data g(Action sbj, Data obj){
		return new Data(sbj.value);
	}
	
	//作用素のマージ
	Action h(Action obj, Action sbj){
		if(obj.priority < sbj.priority){
			return sbj;
		}
		else{
			return obj;
		}
	}
	
	//長さlenの区間にxを作用させるときの作用の変化　例：和の加算なら*len、min/maxならそのまま
	Action p(Action x, int len){
		return new Action(x.value * len, x.priority);
	}
	
	//作用素の単位元
	static Action id_E = new Action(0,-1);
	
	//idがkの木の頂点を遅延伝播 lenはkの区間の長さ
	void eval(int len, int k){
		
		if(!lazy[k].equals(id_E)){
			tree[k] = g(p(lazy[k],len),tree[k]);
			
			//子は親の半分の範囲
			if(k*2+1 < inum()*2-1){ //最下段かチェック
				lazy[2*k+1] = h(lazy[2*k+1],lazy[k]);
				lazy[2*k+2] = h(lazy[2*k+2],lazy[k]);
			}
		}
		//伝播終了
		lazy[k] = id_E;
	}
	
	//インデックス数
	int inum(){
		return (tree.length+1)/2;
	}
	
	//区間[a,b)に作用素xを入れる
	Data update(int a, int b, Action x){
		return update(a,b,x,0,0,inum());
	}
	
	//再帰全体の更新範囲[a,b) [l,r)を表すkに作用素xを入れる
	Data update(int a, int b, Action x, int k, int l, int r){
		eval(r-l,k);	//遅延伝播
		
		if(r<=a || b<=l){
			return tree[k];
		}
		if(a<=l && r<=b){
			lazy[k] = h(lazy[k],x);
			return g(p(lazy[k],r-l),tree[k]);
		}
		return tree[k] = ope(update(a,b,x,k*2+1,l,(l+r)/2),update(a,b,x,k*2+2,(l+r)/2,r));
	}
	
	//i番目の値をnに更新
	void update(int i, Data x){
		i = inum() + i - 1; //単体のa_iが格納されているindex
		tree[i] = x;
		while (i > 0) {
			i = (i - 1) / 2; //1つ上の区間和が格納されているindex
			tree[i] = ope(tree[i * 2 + 1], tree[i * 2 + 2]);
		}
	}
	
	//O(logN)で[start,end)の区間和
	Data query(int start, int end) {
		return query(start, end, 0, 0, inum());
	}

	//[a,b)の区間和, kは自分のいるセグ木のインデックス、対象範囲は[l,r)
	private Data query(int a, int b, int k, int l, int r) {
		
		eval(r-l,k);
		
		// 要求区間と対象区間が交わらない -> 適当に返す
		if(r <= a || b <= l){
			return id_T;
		}
			
		// 要求区間が対象区間を完全に被覆 -> 対象区間を答えの計算に使う
		if(a<=l && r<=b){
			return tree[k];
		}
		else{
			Data lv = query(a, b, 2*k+1, l, (l+r)/2);
			Data rb = query(a, b, 2*k+2, (l+r)/2, r);
			return ope(lv, rb);
		}
	}
	
}

//保持すべき値
class Data{
	long value;
	
	//単位元
	static Data id_T = new Data(0);
	
	public Data(long value){
		this.value = value;
	}
	
}

//作用素
class Action{

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + priority;
		result = prime * result + (int) (value ^ (value >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Action other = (Action) obj;
		if (priority != other.priority)
			return false;
		if (value != other.value)
			return false;
		return true;
	}

	long value;
	int priority;
	
	public Action(long value, int priority){
		this.value = value;
		this.priority = priority;
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
