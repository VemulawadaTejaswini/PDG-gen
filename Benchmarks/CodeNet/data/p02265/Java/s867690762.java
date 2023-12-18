import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();

	public static void main(String[] args) {
		int n = sc.nextInt();
		ArrayDeque<Integer> list = new ArrayDeque<>();
		
		for(int i=1; i<=n; i++) {
			String cmd = sc.next();
			
			switch (cmd) {
			case "insert":
				int num1 = sc.nextInt();
				list.push(num1);
				break;
				
			case "delete":
				int num2 = sc.nextInt();
				list.removeFirstOccurrence(num2);
				break;
				
			case "deleteFirst":
				list.removeFirst();
				break;
				
			case "deleteLast":
				list.removeLast();
				break;

			}
		}
		
		int size = list.size();
		for(int i=0; i<size; i++) {
			System.out.print(list.pop());
			if(i != size-1) {
				System.out.print(" ");
			}
		}
		System.out.println();
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