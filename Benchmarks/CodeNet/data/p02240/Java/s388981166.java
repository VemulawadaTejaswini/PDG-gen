import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();
	static Node[] V;
	static ArrayDeque<Integer> que = new ArrayDeque<>();

	public static void main(String[] args) {
		int n = sc.nextInt();	
		int m = sc.nextInt();
		
		V = new Node[n];
		for(int i=0; i<n; i++) {
			V[i] = new Node();
		}
		
		for(int i=0; i<m; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			
			V[s].adj.add(t);
			V[t].adj.add(s);
		}
	
		int label = 0;
		for(int i=0; i<n; i++) {
			if(V[i].label == -1) {
				que.add(i);
				while(!que.isEmpty()) {
					V[que.poll()].setLabel(label);
				}
				label++;
			}
		}
		
		int q = sc.nextInt();
		for(int i=1; i<=q; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			if(V[s].label == V[t].label) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}

	static class Node {	
		int label = -1;
		ArrayList<Integer> adj = new ArrayList<>();
		
		public void setLabel(int label) {	
			this.label = label;
			for(int i=0; i<adj.size(); i++) {
				if(V[adj.get(i)].label == -1) {
					que.add(adj.get(i));
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