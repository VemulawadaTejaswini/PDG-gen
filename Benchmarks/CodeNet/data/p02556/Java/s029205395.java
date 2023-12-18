import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
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
	
	class SegTree {
		int n=1;
		long[] v;
		long INF=Long.MAX_VALUE/3;
	
		public SegTree(int n_) {
			while (n<n_) n*=2;
			v=new long[2*n-1];
			Arrays.fill(v, -INF);
		}
		
		void updateVal(int k,long val) {
			k+=n-1;
			v[k]=Math.max(v[k],val);
			while (k>0) {
				k=(k-1)/2;
				v[k]=Math.max(v[2*k+1],v[2*k+2]);
			}
		}
		
		long query(int a,int b) {
			return query(0,n,a,b,0);
		}
		
		long query(int l,int r,int a,int b,int k) {
			if (r<=a||b<=l) return -INF;
			if (a<=l&&r<=b) return v[k];
			long vl=query(l,(l+r)/2,a,b,2*k+1);
			long vr=query((l+r)/2,r,a,b,2*k+2);
			return Math.max(vl, vr);
		}
		
	}
	
	void run() {
		FastScanner sc=new FastScanner();
		int N=sc.nextInt();
		long[][] p=new long[N][2];
		HashMap<Long,Integer> map=new HashMap<>();
		{
			HashSet<Long> ys=new HashSet<>();
			for (int i=0;i<N;++i) {
				long x=sc.nextLong();
				long y=sc.nextLong();
				p[i][0]=x;
				p[i][1]=y;
				ys.add(y);
			}
			ArrayList<Long> y_array=new ArrayList<>();
			for (long y:ys) y_array.add(y);
			Collections.sort(y_array);
			for (int i=0;i<y_array.size();++i) map.put(y_array.get(i), i);
		}
		Arrays.sort(p, new Comparator<long[]>() {
			@Override
			public int compare(long[] o1, long[] o2) {
				return Long.compare(o1[0], o2[0]);
			}
		});
		SegTree seg1=new SegTree(N);
		SegTree seg2=new SegTree(N);
		long ans=Long.MIN_VALUE;
		for (int i=N-1;i>=0;--i) {
			int yi=map.get(p[i][1]);
			long ans1=-p[i][0]-p[i][1]+seg1.query(yi, N);
			long ans2=-p[i][0]+p[i][1]+seg2.query(0,yi+1);
			ans=Math.max(ans, ans1);
			ans=Math.max(ans, ans2);
			seg1.updateVal(yi, p[i][0]+p[i][1]);
			seg2.updateVal(yi, p[i][0]-p[i][1]);
		}
		System.out.println(ans);
	}
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
}