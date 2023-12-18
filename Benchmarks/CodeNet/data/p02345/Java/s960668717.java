import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main implements Runnable {

	int N,Q;

	static class SimpleSegTree {
		static int DEF = Integer.MAX_VALUE;
		int[] seg;
		int n;

		public SimpleSegTree(int size,int fill){

			n = 1;
			while(n < size){
				n <<= 1;
			}

			seg = new int[2 * n - 1];
			Arrays.fill(seg,fill);
		}

		public void set(int ind,int val){

			ind += n - 1;
			seg[ind] = val;

			while(ind > 0){

				ind = ind-1 >> 1;
				seg[ind] = Math.min(seg[ind * 2 + 1],seg[ind * 2 + 2]);
			}
		}

		public int query(int a,int b,int k,int l,int r){

			if(r <= a || b <= l){
				return DEF;
			}

			if(a <= l && r <= b){
				return seg[k];
			}

			int left = query(a,b,k * 2 + 1,l,(l+r)>>1);
			int right = query(a,b,k * 2 + 2,(l+r)>>1,r);

			return Math.min(left, right);
		}

		public int min(int l,int r){
			return query(l,r,0,0,n);
		}
	}


	public void solve() {
		N = nextInt();
        Q = nextInt();

        SimpleSegTree segTree = new SimpleSegTree(N,Integer.MAX_VALUE);

        for(int i = 0;i < Q;i++){
            int c = nextInt();
            int x = nextInt();
            int y = nextInt();

            if(c == 0){
                segTree.set(x,y);
            }else{
                out.println(segTree.min(x,y+1));
            }
        }

	}

	public static void main(String[] args) {
		new Thread(null, new Main(), "", 32 * 1024 * 1024).start();
	}

	/* Input */
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[2048];
	private int p = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (p < buflen)
			return true;
		p = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (buflen <= 0)
			return false;
		return true;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrint(buffer[p])) {
			p++;
		}
		return hasNextByte();
	}

	private boolean isPrint(int ch) {
		if (ch >= '!' && ch <= '~')
			return true;
		return false;
	}

	private int nextByte() {
		if (!hasNextByte())
			return -1;
		return buffer[p++];
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = -1;
		while (isPrint((b = nextByte()))) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	@Override
	public void run() {
		out.flush();
		new Main().solve();
		out.close();

	}
}