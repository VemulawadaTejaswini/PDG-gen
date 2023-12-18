import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Collections;
import java.util.Arrays;

public class Main {
	public static class Dinic {
		public int N;
		public int INF = 1 << 29;
		public int[] eadj, eprev, elast;
		public int eidx;
		private int[] flow, capa, now;

		public void init(int _N, int M) {
			N = _N;
			eadj  = new int[M];
			eprev = new int[M];
			elast = new int[N];
			flow  = new int[M];
			capa  = new int[M];
			now   = new int[N];
			level = new int[N];
			eidx  = 0;
			Arrays.fill(elast, -1);
		}

		private void add_edge(int a, int b, int c) {
			eadj[eidx] = b;
			flow[eidx] = 0;
			capa[eidx] = c;
			eprev[eidx] = elast[a];
			elast[a] = eidx++;
			eadj[eidx] = a;
			flow[eidx] = c;
			capa[eidx] = c;
			eprev[eidx] = elast[b];
			elast[b] = eidx++;
		}

		public int dinic(int source, int sink) {
			int res, flow = 0;
			while(bfs(source, sink)) {
				System.arraycopy(elast, 0, now, 0, N);
				while((res = dfs(source, INF, sink)) > 0) flow+=res;
			}
			return flow;
		}

		private int[] level;

		private boolean bfs(int source, int sink) {
			Arrays.fill(level, -1);
			int front = 0;
			int back = 0;
			int[] queue = new int[N];
			level[source] = 0;
			queue[back++] = source;
			while(front < back && level[sink] == -1) {
				int node = queue[front++];
				for(int e=elast[node]; e!=-1; e=eprev[e]) {
					int to = eadj[e];
					if (level[to]==-1 && flow[e] < capa[e]) {
						level[to] = level[node]+1;
						queue[back++] = to;
					}
				}
			}
			return level[sink]!=-1;
		}

		private int dfs(int cur, int curflow, int goal) {
			if(cur==goal) return curflow;
			for(int e=now[cur]; e!=-1; now[cur]=e=eprev[e]) {
				if(level[eadj[e]]>level[cur] && flow[e] < capa[e]) {
					int res = dfs(eadj[e], Math.min(curflow, capa[e]-flow[e]), goal);
					if(res>0) {
						flow[e]+=res;
						flow[e^1]-=res;
						return res;
					}
				}
			}
			return 0;
		}
	}

	public static int gcd(int a, int b) {
		while(true) {
			int c = a % b;
			if(c==0) return b;
			a = b;
			b = c;
		}
	}

	public static void main(String[] args) {
		FS fs = new FS();
		while(true) {
			int m = fs.nextInt();
			int n = fs.nextInt();
			if(m==0) break;
			int[] b = new int[m];
			int[] r = new int[n];
			for(int i=0; i<m; i++) {
				b[i] = fs.nextInt();
			}
			for(int i=0; i<n; i++) {
				r[i] = fs.nextInt();
			}
			// 0         : start
			// 1 - m     : blue
			// m+1 - m+n : red
			// m+n+1     : end
			Dinic d = new Dinic();
			d.init(n+m+2, (n*m+n+m)*2);
			for(int i=0; i<m; i++) {
				d.add_edge(0, i+1, 1);
			}
			for(int i=0; i<n; i++) {
				d.add_edge(m+1+i, m+n+1, 1);
			}
			for(int i=0 ;i<m; i++) {
				for(int j=0; j<n; j++) {
					if(gcd(b[i], r[j]) > 1) {
						d.add_edge(i+1,m+1+j, 1);
					}
				}
			}
			System.out.println(d.dinic(0, m+n+1));

		}
	}

	// Read Class
	static class FS {
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

		private int readByte() { return hasNextByte() ? buffer[ptr++] : -1;}
		private boolean isPrintableChar(int c) {return 33 <= c && c <= 126;}
		private void skipUnprintable() {while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}

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
		public int nextInt() {
			return (int)nextLong();
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
			while(true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if(b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
	}
}