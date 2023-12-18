import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.NoSuchElementException;
 
public class Main {
	private static FastScanner sc = new FastScanner();
	private static Node[] V;
	static int Vn;
	
	public static void main(String[] args) {
		Vn = sc.nextInt();
		int En = sc.nextInt();
		
		V = new Node[Vn];
		for(int i=0; i<Vn; i++) {
			V[i] = new Node();
			V[i].id = i;
		}
		
		for(int i=0; i<En; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int c = sc.nextInt();
			V[u].nbr.add(new Edge(v, c));
			V[v].nbr.add(new Edge(u, 0));
		}
		
		int flow = 0;
		while(true) {
			for(int i=0; i<Vn; i++) {
				V[i].used = false;
			}
			int f = V[0].dfs(Integer.MAX_VALUE);
			if (f == 0) {
				System.out.println(flow);
				return;
			}
			flow += f;
		}
	}
	
	static class Node {
		int id;
		boolean used;
		HashSet<Edge> nbr = new HashSet<>();
		
		int dfs (int f) {
			if(id == Vn - 1) {
				return f;
			}
			used = true;
			for(Edge e : nbr) {
				if(!V[e.t].used && e.c > 0) {
					int d = V[e.t].dfs(Math.min(f, e.c));
					if(d > 0) {
						e.c -= d;
						for(Edge e2 : V[e.t].nbr) {
							if(e2.t == id) {
								e2.c += d;
								break;
							}
						}
						
						return d;
					}
				}
			}
			
			return 0;
		}
	}
	
	static class Edge {
		int t;
		int c;
		Edge(int t, int c) {
			this.t = t;
			this.c = c;
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