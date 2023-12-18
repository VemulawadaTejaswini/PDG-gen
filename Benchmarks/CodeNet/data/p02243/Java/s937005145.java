import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {
	private static FastScanner sc = new FastScanner();
	static Node[] V;
	static PriorityQueue<Node> que = new PriorityQueue<>((a, b) -> a.d - b.d);

	public static void main(String[] args) {
		int n = sc.nextInt();
		
		V = new Node[n];
		for(int i=0; i<n; i++) {
			sc.nextInt();
			int k = sc.nextInt();
			int[] v = new int[n];
			int[] c = new int[n];
			for(int j=0; j<k; j++) {
				v[j] = sc.nextInt();
				c[j] = sc.nextInt();
			}
			V[i] = new Node(i == 0 ? 0 : Integer.MAX_VALUE, v, c);
		}
		que.add(V[0]);
		
		while(!que.isEmpty()) {
			Node node = que.poll();
			node.dijkstra();
		}
		
		StringBuilder ans = new StringBuilder();
		for(int i=0; i<n; i++) {
			ans.append(i);
			ans.append(" ");
			ans.append(V[i].d);
			ans.append("\n");
		}
		System.out.print(ans);
	}
	
	static class Node {
		int d;
		int[] v;
		int[] c;
		
		Node(int d, int[] v, int[] c) {
			this.d = d;
			this.v = v;
			this.c = c;
		}
		
		public void dijkstra() {
			for(int i=0; i<v.length; i++) {
				Node node = V[v[i]];
				if(node.d > d + c[i]) {
					if(node.d == Integer.MAX_VALUE || que.remove(node)) {
						node.d = d + c[i];
						que.add(node);
					}
				}
			}
		}
	}

	static class FastScanner {
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
	        return Long.parseLong(next());
	    }
	    public int nextInt(){
	    	return Integer.parseInt(next());
	    }
	}
}