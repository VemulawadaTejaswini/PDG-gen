import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        SegmentTree t = new SegmentTree(100001);
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int com = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(com == 0){
                t.update(x,y);
            }else{
                int ans = t.query(x,y);
                System.out.println(ans);
            }
        }
    }
}

class SegmentTree{
    int[] tree;
    int N;
    int INF = Integer.MAX_VALUE;
    public SegmentTree(int n){
        int now = 1;
        while(now < n){
            now *= 2;
        }
        this.N = now;
        this.tree = new int[N*2];
        Arrays.fill(tree,2147483647);
    }
    
    public void update(int i, int x) {
        i += N - 1;
        tree[i] = x;
        while (i > 0) {
            i = (i - 1) / 2;
            tree[i] = Math.min(tree[i * 2 + 1], tree[i * 2 + 2]);
        }
    }
    
    public int query(int a, int b) { 
        return query(a, b+1, 0, 0, N); 
    }
    
    public int query(int a, int b, int k, int l, int r) {
        if (r <= a || b <= l){
            return INF;
        }else if (a <= l && r <= b) {
			return tree[k];
		} else {
			int lv = query(a, b, 2*k+1, l, (l+r)/2);
			int rb = query(a, b, 2*k+2, (l+r)/2, r);
			return marge(lv, rb);
		}
    }
    
    private int marge(int l, int r) {
		return Math.min(l, r);
	}
	
	public void printArr(){
	    for(int v : tree){
	        System.out.print(v + " ");
	    }
	    System.out.println();
	    return;
	}
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
    }
    
    public String[] nextArray(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = next();
        return a;
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    } 
}
