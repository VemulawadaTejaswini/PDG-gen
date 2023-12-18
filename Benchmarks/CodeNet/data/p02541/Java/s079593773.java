import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
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
    int nextInt() {
    	return (int)nextLong();
    }
}

class RMQ {
	int n=1;
	int[] v;
	final int INF=Integer.MAX_VALUE;
	
	public RMQ(int n_) {
		while (n<n_) n*=2;
		v=new int[2*n-1];
		Arrays.fill(v, -INF);
	}
	
	void set(int k,int val) {
		k+=n-1;
		v[k]=val;
		while (k>0) {
			k=(k-1)/2;
			v[k]=Math.max(v[2*k+1], v[2*k+2]);
		}
	}
	
	int query(int a,int b) {
		return query(0,n,a,b,0);
	}
	
	int query(int l,int r,int a,int b,int k) {
		if (r<=a||b<=l) return -INF;
		if (a<=l&&r<=b) return v[k];
		int vl=query(l,(l+r)/2,a,b,2*k+1);
		int vr=query((l+r)/2,r,a,b,2*k+2);
		return Math.max(vl, vr);
	}
}


class BIT {
	int n;
	int[] a;
	
	public BIT(int n_) {
		n=n_;
		a=new int[n+1];
	}
	
	void add(int k,int val) {
		k++;
		while (k<=n) {
			a[k]+=val;
			k+=k&-k;
		}
	}
	
	int sum(int k) {
		k++;
		int ret=0;
		while (k>0) {
			ret+=a[k];
			k-=k&-k;
		}
		return ret;
	}
	
	int sum(int a,int b) {
		return sum(b-1)-sum(a-1);
	}
}

class Main {
	public static void main(String[] $) {
		new Main().run();
	}
	
	long gcd(long a,long b) {
		return a==0?b:gcd(b%a,a);
	}
	// P^{-1} mod Q
	long inv(long P,long Q) {
		assert(gcd(P,Q)==1);
		P%=Q;
		long a0=0;
		long b0=1;
		long a1=1;
		long b1=0;
		long s0=Q;
		long s1=P;
		while (s1!=0) {
			long q=s0/s1;
			s0-=q*s1;
			a0-=q*a1;
			b0-=q*b1;
			s0^=s1;s1^=s0;s0^=s1;
			a0^=a1;a1^=a0;a0^=a1;
			b0^=b1;b1^=b0;b0^=b1;
		}
		if (a0<0) a0+=Q;
		return a0;
	}
	
	void run() {
		FastScanner sc=new FastScanner();
		long N=sc.nextLong();
		if (N==1) {
			System.out.println(1);
			return;
		}
		N*=2;
		ArrayList<Long> a=new ArrayList<>();
		{
			long N_=N;
			for (long p=2;p*p<=N_;++p) {
				long pe=1;
				while (N_%p==0) {
					pe*=p;
					N_/=p;
				}
				if (pe!=1) a.add(pe);
			}
			if (N_!=1) a.add(N_);
		}
		int n=a.size();
		
		long ans=Long.MAX_VALUE;
		for (int s=1;s<(1<<n)-1;++s) {
			long P=1;
			for (int shift=0;shift<n;++shift) {
				if ((s>>shift)%2==1) P*=a.get(shift);
			}
			long Q=N/P;
			long u=inv(P,Q);
			long v=(u*P-1)/Q;
			ans=Math.min(ans, v*Q);
		}
		System.out.println(ans);
	}
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
}
