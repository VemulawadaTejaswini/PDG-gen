import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
 
public class Main {
	private static FastScanner sc = new FastScanner();
	static Node[] V;
	
	public static void main(String[] args) {
		int Vn = sc.nextInt();
		int En = sc.nextInt();
		int r = sc.nextInt();
		
		V = new Node[Vn]; 
		for(int i=0; i<Vn; i++) {
			V[i] = new Node();
		}
		
		for(int i=0; i<En; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			int d = sc.nextInt();
			V[s].nbr.add(new Edge(t, d));
		}
		
		V[r].min = 0;
		
		for(int i=0; i<Vn; i++) {
			boolean flag = false;
			for(int j=0; j<Vn; j++) {
				Node n = V[j];
				for(Edge e : n.nbr) {
					if(n.min != Integer.MAX_VALUE && n.min + e.d < V[e.t].min) {
						V[e.t].min = n.min + e.d;
						flag = true;
					}
				}
			}
			
			if(i == Vn-1 && flag) {
				System.out.println("NEGATIVE CYCLE");
				return;
			}
		}
		
		StringBuilder ans = new StringBuilder();
		for(int i=0; i<Vn; i++) {
			if(V[i].min == Integer.MAX_VALUE) {
				ans.append("INF");
			} else {
				ans.append(V[i].min);
			}
			ans.append("\n");
		}
		System.out.print(ans);
	}
	
	static class Node {
		int min = Integer.MAX_VALUE;
		Set<Edge> nbr = new HashSet<>();
	}
	
	static class Edge {
		int t;
		int d;
		
		Edge(int t, int d) {
			this.t = t;
			this.d = d;
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