import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
 
public class Main {
	private static FastScanner sc = new FastScanner();
	static Node[] V;
	
	public static void main(String[] args) {
		int Vn = sc.nextInt();
		int En = sc.nextInt();
		
		V = new Node[Vn]; 
		for(int i=0; i<Vn; i++) {
			V[i] = new Node();
			V[i].id = i;
		}
		
		PriorityQueue<Edge> edges = new PriorityQueue<>((a, b) -> a.d - b.d);
		for(int i=0; i<En; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			int d = sc.nextInt();
			edges.add(new Edge(s, t, d));
		}
		
		int ans = 0;
		
		while(!edges.isEmpty()) {
			Edge e = edges.poll();
			int sp = V[e.s].findParent();
			int tp = V[e.t].findParent();
			
			if(sp != tp) {
				ans += e.d;
				V[tp].parent = sp;
			}
		}
		
		System.out.println(ans);
	}
	
	static class Node {
		int id;
		int parent = -1;
		
		int findParent() {
			if(parent == -1) {
				return id;
			}
			
			int p = V[parent].findParent();
			parent = p;
			return p;
		}
	}
	
	static class Edge {
		int s;
		int t;
		int d;
		
		Edge(int s, int t, int d) {
			this.s = s;
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