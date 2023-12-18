import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	static FastScanner sc = new FastScanner();
	static final double ALLOWABLE_ERROR = 0.00000001;

	public static void main(String[] args) {
		int q = sc.nextInt();
		
		StringBuilder ans = new StringBuilder();
		for(int i=0; i<q; i++) {
			double x0 = sc.nextDouble();
			double y0 = sc.nextDouble();
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			
			if(x0 == x1) {
				if(x2 == x3) {
					ans.append(2);
				} else if(y2 == y3) {
					ans.append(1);
				} else {
					ans.append(0);
				}
			} else if(y0 == y1) {
				if(x2 == x3) {
					ans.append(1);
				} else if(y2 == y3) {
					ans.append(2);
				} else {
					ans.append(0);
				}
			} else {
				double a1 = (y1 - y0) / (x1 - x0);
				double a2 = (y3 - y2) / (x3 - x2);
				
				if(a2 == a1) {
					ans.append(2);
				} else if(a1 * a2 == -1) {
					ans.append(1);
				} else {
					ans.append(0);
				}
			}
			
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