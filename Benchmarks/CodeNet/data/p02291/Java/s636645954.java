import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();

	public static void main(String[] args) {
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		double a = (y2 - y1) / (x2 - x1);
		double b = y1 - a * x1;
		
		int q = sc.nextInt();
		StringBuilder ans = new StringBuilder();
		for(int i=0; i<q; i++) {
			double xp = sc.nextDouble();
			double yp = sc.nextDouble();
			
			double x = 0;
			double y = 0;
			if(y1 == y2) {
				x = xp;
				y = y1;
			} else if(x1 == x2) {
				x = x1;
				y = yp;
			} else {
				x = (yp + xp / a - b) / (a + 1 / a);
				y = yp + xp / a - x / a;
			}
			
			x += x - xp;
			y += y - yp;
			
			ans.append(x);
			ans.append(" ");
			ans.append(y);
			ans.append("\n");
		}
		
		System.out.print(ans);
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