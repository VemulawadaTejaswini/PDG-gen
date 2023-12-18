import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
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
			V[i] = new Node(v, c, i);
		}
		V[0].d = 0;
		que.add(V[0]);
		
		while(!que.isEmpty()) {
			Node node1 = que.poll();
			for(int i=0; i<node1.v.length; i++) {
				if (node1.prev == node1.v[i]) {
                    continue;
                }
				Node node2 = V[node1.v[i]];
				if(node2.d > node1.d + node1.c[i]) {
					if(que.contains(node2)) {
						que.remove(node2);
					}
					node2.d = node1.d + node1.c[i];
					node2.prev = node1.id;
					que.add(node2);
				}
			}
		}
		
		Printer pr = new Printer(System.out);
		for(int i=0; i<n; i++) {
			pr.print(i);
            pr.print(" ");
            pr.print(V[i].d);
            pr.println("");
		}
	}
	
	static class Node {
		int d = Integer.MAX_VALUE;
		int[] v;
		int[] c;
		int prev = -1;
		int id;
		
		Node(int[] v, int[] c, int id) {
			this.v = v;
			this.c = c;
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
	
	private static class Printer {
        PrintStream out;
        StringBuffer strbuf;
        int bufSize;
        final String CR;
 
        Printer(PrintStream out) {
            this.out = out;
            strbuf = new StringBuffer();
            bufSize = 64 * 1024;
            CR = System.getProperty("line.separator");
        }
 
        void println(String str) {
            strbuf.append(str);
            strbuf.append(CR);
            checkStringBuffer();
        }
 
        void print(String str) {
            strbuf.append(str);
            checkStringBuffer();
        }
 
        void println(int n) {
            strbuf.append(n);
            strbuf.append(CR);
            checkStringBuffer();
        }
 
        void print(int n) {
            strbuf.append(n);
            checkStringBuffer();
        }
 
        void print(char c) {
            strbuf.append(c);
            checkStringBuffer();
        }
 
        void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                checkStringBuffer();
                strbuf.append(array[i]);
                strbuf.append(" ");
            }
            strbuf.delete(strbuf.length() - 1, strbuf.length());
            strbuf.append(CR);
        }
 
        void close() {
            flashStringBuffer();
        }
         
        private void flashStringBuffer() {
            if (strbuf.length() > 0) {
                out.print(strbuf);
                strbuf.setLength(0);
            }
        }
         
        private void checkStringBuffer() {
            if (strbuf.length() > bufSize) {
                out.print(strbuf);
                strbuf.setLength(0);
            }
        }
    }
}