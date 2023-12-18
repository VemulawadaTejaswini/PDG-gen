
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Main {
	static PrintWriter out = new PrintWriter(System.out);
	static Scanner stdIn = new Scanner(System.in);
	static FastScanner sc = new FastScanner();

	
	public static void main(String[] args) {
		while(true) {
			String[] in = stdIn.nextLine().split(" ");
			if(in[0].equals("0")) break;
			int[] inx = new int[in.length];
			for(int i = 0; i < in.length; i++) {
				inx[i] = Integer.parseInt(in[i]);
			}
			
			int sum = 0;
			int one = 0;
			for(int i = 0; i < inx.length; i++) {
				if(inx[i] == 1) {
					one++;
				}
				else if(inx[i] >= 10 && inx[i] <= 13) {
					sum += 10;
				}
				else {
					sum += inx[i];
				}
			}
			int ans = 0;
			if(sum + one > 21) {
				out.println(0);
				continue;
			}
			ans = sum + one;
			for(int i = 0; i < one; i++) {
				if(sum + (one - i - 1) + (i+1) * 11 <= 21) {
					ans = sum + (one - i - 1) + (i+1) * 11;
				}
				else {
					break;
				}
			}
			
			out.println(ans);
			
			
			
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