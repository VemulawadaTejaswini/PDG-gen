
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Main {
	static PrintWriter out = new PrintWriter(System.out);
	static Scanner stdIn = new Scanner(System.in);
	static FastScanner sc = new FastScanner();

	
	public static void main(String[] args) {
		while(sc.hasNext()) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(p);
			while(true) {
				p *= 10;
				out.print(p / q);
				p %= q;
				if(p == 0 || list.contains(p)) {
					break;
				}
				list.add(p);
			}
			out.println();
			if(p != 0&& list.contains(p)) {
				char a = ' ';
				for(int i = 0; i < list.size(); i++) {
					if(list.get(i) == p) a = '^';
					out.print(a);
				}
				out.println();
			}
		} 
		out.flush();
		
		
	}

}

class FastScanner {
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
        return (int)nextLong();
    }
     
    public double nextDouble() {
        return Double.parseDouble(next());
    }
     
 
}