import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();
	static Node[] V;
	static int time = 1;

	public static void main(String[] args) {
		int n = sc.nextInt();	
		
		V = new Node[n];
		for(int i=0; i<n; i++) {
			sc.nextInt();
			int k = sc.nextInt();
			ArrayDeque<Integer> adj = new ArrayDeque<>();
			for(int j=0; j<k; j++) {
				adj.add(sc.nextInt() - 1);
			}
			V[i] = new Node(adj);
		}
		
		for(int i=0; i<n; i++) {
			V[i].depthFirstSearch();
		}
		
		StringBuilder ans = new StringBuilder();
		for(int i=0; i<n; i++) {
			ans.append(i+1);
			ans.append(" ");
			ans.append(V[i].d);
			ans.append(" ");
			ans.append(V[i].f);
			ans.append("\n");
		}
		System.out.print(ans);
	}

	static class Node {	
		int d = -1;
		int f = -1;
		ArrayDeque<Integer> adj;
		
		Node(ArrayDeque<Integer> adj) {
			this.adj = adj;
		}
		
		public void depthFirstSearch() {
			if(d == -1) {
				d = time;
				time++;
			}
			while(!adj.isEmpty()) {
				V[adj.poll()].depthFirstSearch();
			}
			if(f == -1) {
				f = time;
				time++;
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