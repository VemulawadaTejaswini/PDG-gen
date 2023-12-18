import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.NoSuchElementException;
 
public class Main {
	private static FastScanner sc = new FastScanner();
	private static Node[] V;
	static int maxd = 0;
	static int maxid = 0;
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		V = new Node[n];
		for(int i=0; i<n; i++) {
			V[i] = new Node();
			V[i].id = i;
		}
		
		for(int i=0; i<n-1; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			int w = sc.nextInt();
			V[s].nbr.add(new Edge(t, w));
			V[t].nbr.add(new Edge(s, w));
		}
		
		V[0].dfs(0);
		
		maxd = 0;
		for(int i=0; i<n; i++) {
			V[i].visited = false;
		}
		
		V[maxid].dfs(0);
		
		System.out.println(maxd);
	}
	
	static class Node {
		int id;
		HashSet<Edge> nbr = new HashSet<>();
		boolean visited = false;
		
		void dfs(int d) {
			visited = true;
			
			if(d > maxd) {
				maxd = d;
				maxid = id;
			}
			
			for(Edge e : nbr) {
				if(!V[e.t].visited) {
					V[e.t].dfs(d + e.w);
				}
			}
		}
	}
	
	static class Edge {
		int t;
		int w;
		Edge(int t, int w) {
			this.t = t;
			this.w = w;
		}
	}
	
	static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if(ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch(IOException e) {
                    e.printStackTrace();
                }
                if(buflen <= 0) {
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
            return Long.parseLong(next());
        }
        public int nextInt(){
            return Integer.parseInt(next());
        }
        public double nextDouble(){
            return Double.parseDouble(next());
        }
    }
}