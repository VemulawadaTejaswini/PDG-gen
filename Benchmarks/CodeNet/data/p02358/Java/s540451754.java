import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();

	public static void main(String[] args) {
		int N = sc.nextInt();
		
		Rectangle[] rect = new Rectangle[N];
		ArrayList<Rectangle> overlaplist = new ArrayList<>();
		long sum = 0;
		for(int i=0; i<N; i++) {
			rect[i] = new Rectangle(sc.nextLong(), sc.nextLong(), sc.nextLong(), sc.nextLong());
			sum += rect[i].area();
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<overlaplist.size(); j++) {
				Rectangle overlap = getOverlap(rect[i], overlaplist.get(j));
				if(overlap != null) {
					sum += overlap.area();
				}
			}
			
			for(int j=i-1; j>=0; j--) {		
				Rectangle overlap = getOverlap(rect[i], rect[j]);
				if(overlap != null) {
					sum -= overlap.area();
					overlaplist.add(overlap);
				}
			}
		}
		
		System.out.println(sum);
		
	}
	
	static Rectangle getOverlap(Rectangle a, Rectangle b) {
		long x1_max = Math.max(a.x1, b.x1);
		long x2_min = Math.min(a.x2, b.x2);
		if(x1_max >= x2_min) {
			return null;
		}
		
		long y1_max = Math.max(a.y1, b.y1);
		long y2_min = Math.min(a.y2, b.y2);
		if(y1_max >= y2_min) {
			return null;
		}
		
		Rectangle overlap = new Rectangle(x1_max, y1_max, x2_min, y2_min);				
		return overlap;
	}
	
	static class Rectangle {
		long x1;
		long y1;
		long x2;
		long y2;
		public Rectangle(long x1, long y1, long x2, long y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}
		
		public long area() {
			return (x2 - x1) * (y2 - y1);
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