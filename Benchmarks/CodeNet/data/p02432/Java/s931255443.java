import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main{
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		int q = fs.nextInt();
		MyQueue qu = new MyQueue(q);
		for(int i = 0; i < q; i++) {
			int query = fs.nextInt();
			if(query == 0) {
				int d = fs.nextInt();
				int v = fs.nextInt();
				if(d == 0) {
					qu.addFirst(v);;
				}else {
					qu.addLast(v);
				}
			}else if(query == 1) {
				System.out.println(qu.get(fs.nextInt()));
			}else if(query == 2){
				int d = fs.nextInt();
				if(d == 0) {
					qu.removeFirst();;
				}else {
					qu.removeLast();
				}
			}
		}
	}
	static class MyQueue {
	    public int[] array;
	    public int first, last;

	    public MyQueue (int n) {
	        array = new int[n * 2];
	        this.first = n;
	        this.last = n;
	    }
	    void addFirst(int i) {
	    	array[first--] = i;
	    }
	    void addLast(int i) {
	    	array[++last] = i;
	    }
	    void removeFirst() {
	    	first++;
	    }
	    void removeLast() {
	    	last--;
	    }
	    int get(int n) {
	    	return array[n + first + 1];
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
	    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
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
	    public int nextInt() {
	        long nl = nextLong();
	        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
	        return (int) nl;
	    }
	    public double nextDouble() { return Double.parseDouble(next());}
	}
}
