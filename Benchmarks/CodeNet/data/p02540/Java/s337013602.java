import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

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
	
	void run() {
		FastScanner sc=new FastScanner();
		int N=sc.nextInt();
		int[][] p=new int[N][3];
		for (int i=0;i<N;++i) {
			p[i][0]=sc.nextInt()-1;
			p[i][1]=sc.nextInt()-1;
			p[i][2]=i;
		}
		
		
		int[] maxx=new int[N];
		int[] minx=new int[N];
		int[] maxy=new int[N];
		int[] miny=new int[N];

		{
			Arrays.sort(p, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return Integer.compare(o1[0], o2[0]);
				}
			});
			int my=Integer.MAX_VALUE/3;
			for (int i=0;i<N;++i) {
				int id=p[i][2];
				my=Math.min(my, p[i][1]);
				miny[id]=my;
			}
		}

		{
			Arrays.sort(p, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return Integer.compare(o1[1], o2[1]);
				}
			});
			int mx=Integer.MAX_VALUE/3;
			for (int i=0;i<N;++i) {
				int id=p[i][2];
				mx=Math.min(mx, p[i][0]);
				minx[id]=mx;
			}
		}
		
		
		{
			Arrays.sort(p, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return -Integer.compare(o1[0], o2[0]);
				}
			});
			int My=-Integer.MAX_VALUE/3;
			for (int i=0;i<N;++i) {
				int id=p[i][2];
				My=Math.max(My, p[i][1]);
				maxy[id]=My;
			}
		}
		
		
		
		{
			Arrays.sort(p, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return -Integer.compare(o1[1], o2[1]);
				}
			});
			int Mx=-Integer.MAX_VALUE/3;
			for (int i=0;i<N;++i) {
				int id=p[i][2];
				Mx=Math.max(Mx, p[i][0]);
				maxx[id]=Mx;
			}
		}
		
		
		int[] ans=new int[N];
		Arrays.fill(ans, N);
		{
			class State0 implements Comparable<State0>{
				int t;
				int x,y,id;
			
				public State0(int t,int x,int y,int id) {
					this.t=t;
					this.x=x;
					this.y=y;
					this.id=id;
				}
				
				public int compareTo(State0 o) {
					return Integer.compare(x, o.x);
				};
			}
			PriorityQueue<State0> pq=new PriorityQueue<>();
			for (int i=0;i<N;++i) {
				State0 state0=new State0(1, minx[i], maxy[i], i);
				pq.add(state0);
			}
			for (int i=0;i<N;++i) {
				State0 state0=new State0(0, p[i][0], p[i][1], p[i][2]);
				pq.add(state0);
			}
			
			
			BIT bit=new BIT(N);
			while (!pq.isEmpty()) {
				State0 q=pq.poll();
				if (q.t==0) {
					bit.add(q.y, 1);
				} else {
					ans[q.id]-=bit.sum(q.y+1,N);
				}
			}
		}
		
		{
			class State0 implements Comparable<State0>{
				int t;
				int x,y,id;
			
				public State0(int t,int x,int y,int id) {
					this.t=t;
					this.x=x;
					this.y=y;
					this.id=id;
				}
				
				public int compareTo(State0 o) {
					return -Integer.compare(x, o.x);
				};
			}
			PriorityQueue<State0> pq=new PriorityQueue<>();
			for (int i=0;i<N;++i) {
				State0 state0=new State0(1, maxx[i], miny[i], i);
				pq.add(state0);
			}
			for (int i=0;i<N;++i) {
				State0 state0=new State0(0, p[i][0], p[i][1], p[i][2]);
				pq.add(state0);
			}
			
			
			BIT bit=new BIT(N);
			while (!pq.isEmpty()) {
				State0 q=pq.poll();
				if (q.t==0) {
					bit.add(q.y, 1);
				} else {
					ans[q.id]-=bit.sum(0, q.y);
				}
			}
		}
		
		PrintWriter pw=new PrintWriter(System.out);
		for (int i=0;i<N;++i) {
			pw.println(ans[i]);
		}
		pw.flush();
	}
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
}
