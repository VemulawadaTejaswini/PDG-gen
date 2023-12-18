import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();

	public static void main(String[] args) {
		int n = sc.nextInt();
		
		kochCurve(0, 0, 100, 0, 0, n);
		System.out.println(100.0 + " " + 0.0);
	}
	
	static void kochCurve(double x1, double y1, double x2, double y2 ,int k , int n) {
		if(k == n) {
			System.out.println(x1 + " " + y1);
			return;
		}
		
		double l = 100 / Math.pow(3, k+1);
		
		double xs = (x2 - x1) / 3 + x1;
		double ys = (y2 - y1) / 3 + y1;
		double xt = (x2 - x1) * 2 / 3 + x1;
		double yt = (y2 - y1) * 2 / 3 + y1;
		
		double dif = 0;
		double xu;
		double yu;
		dif = (-1) / ((y2 - y1) / (x2 - x1));
		if((dif > 0 && x1 < x2) || (dif < 0 && x1 > x2)) {
			xu = ((x1 + x2) / 2) + (Math.sqrt(3) * l) / (2 * Math.sqrt(dif * dif + 1));
		} else {
			xu = ((x1 + x2) / 2) - (Math.sqrt(3) * l) / (2 * Math.sqrt(dif * dif + 1));
		}
		if(x1 < x2) {
			yu = ((y1 + y2) / 2) + (Math.sqrt(3) * l) / (2 * Math.sqrt((1/dif) * (1/dif) + 1));
		} else {
			yu = ((y1 + y2) / 2) - (Math.sqrt(3) * l) / (2 * Math.sqrt((1/dif) * (1/dif) + 1));
		}
		
		k++;
		
		kochCurve(x1, y1, xs, ys, k, n);
		kochCurve(xs, ys, xu, yu, k, n);
		kochCurve(xu, yu, xt, yt, k, n);
		kochCurve(xt, yt, x2, y2, k, n);
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