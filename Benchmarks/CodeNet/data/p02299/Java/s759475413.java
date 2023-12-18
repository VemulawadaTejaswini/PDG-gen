import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();
	static final double ALLOWABLE_ERROR = 0.00000000001;

	public static void main(String[] args) {
		int n = sc.nextInt();
		Point[] p = new Point[n];
		for(int i=0; i<n; i++) {
			p[i] = new Point(sc.nextDouble(), sc.nextDouble());
		}
		
		Point edge = new Point(10000.532523523, 0.3256235235);
		int q = sc.nextInt();
		StringBuilder ans = new StringBuilder();
		for(int i=0; i<q; i++) {
			Point pq = new Point(sc.nextDouble(), sc.nextDouble());
			boolean flag = false;
			for(int j=0; j<n; j++) {
				if(Math.abs((p[j].x-p[(j+1)%n].x)*(pq.y-p[j].y)+(p[j].y-p[(j+1)%n].y)*(p[j].x-pq.x)) < ALLOWABLE_ERROR
						 && pq.x >= Math.min(p[j].x, p[(j+1)%n].x) && pq.x <= Math.max(p[j].x, p[(j+1)%n].x) 
						 && pq.y >= Math.min(p[j].y, p[(j+1)%n].y) && pq.y <= Math.max(p[j].y, p[(j+1)%n].y)){
					ans.append(1);
					ans.append("\n");
					flag = true;
					break;
				}
			}
			if(flag) continue;
			
			int cnt = 0;
			for(int j=0; j<n; j++) {
				if(checkCross(pq, edge, p[j], p[(j+1)%n])) {
					cnt++;
				}
			}
			if(cnt%2 == 1) {
				ans.append(2);
			} else {
				ans.append(0);
			}
			ans.append("\n");
		}
		System.out.print(ans);
	}

	static boolean checkCross(Point p1, Point p2, Point p3, Point p4) {
		if(p1.x >= p2.x) {
			if((p1.x<p3.x && p1.x<p4.x) || (p2.x>p3.x && p2.x>p4.x)) {
				return false;
			}
		} else {
			if((p2.x<p3.x && p2.x<p4.x) || (p1.x>p3.x && p1.x>p4.x)) {
				return false;
			}
		}
		
		if(p1.y >= p2.y) {
			if((p1.y<p3.y && p1.y<p4.y) || (p2.y>p3.y && p2.y>p4.y)) {
				return false;
			}
		} else {
			if((p2.y<p3.y && p2.y<p4.y) || (p1.y>p3.y && p1.y>p4.y)) {
				return false;
			}
		}
		
		if(((p1.x-p2.x)*(p3.y-p1.y)+(p1.y-p2.y)*(p1.x-p3.x))*((p1.x-p2.x)*(p4.y-p1.y)+(p1.y-p2.y)*(p1.x-p4.x))>0) {
			return false;
		}
		if(((p3.x-p4.x)*(p1.y-p3.y)+(p3.y-p4.y)*(p3.x-p1.x))*((p3.x-p4.x)*(p2.y-p3.y)+(p3.y-p4.y)*(p3.x-p2.x))>0) {
			return false;
		}
		
		return true;
	}
	
	static class Point {
		double x;
		double y;
		Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
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