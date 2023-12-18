import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Collections;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		FS fs = new FS();
		while(true) {
			int n = fs.nextInt();
			if(n==0) break;
			if(n==1) {
				double x = fs.nextDouble();
				double y = fs.nextDouble();
				System.out.println(-1);
				continue;
			}
			double[] px = new double[n];
			double[] py = new double[n];
			for(int i=0; i<n; i++) {
				px[i] = fs.nextDouble();
				py[i] = fs.nextDouble();
			}
			ArrayList<Double> csx = new ArrayList<Double>();
			ArrayList<Double> csy = new ArrayList<Double>();
			for(int i=0; i<n-1; i++) {
				for(int j=i+1; j<n; j++) {
					double vx = px[j]-px[i];
					double vy = py[j]-py[i];
					double l = Math.sqrt(Math.pow(vx,2.0)+Math.pow(vy,2.0));
					if(l > 2.0) continue;
					double r = Math.sqrt(1.0 - Math.pow(l/2.0, 2.0));
					vx = vx/l*r;
					vy = vy/l*r;
					double mx = (px[i]+px[j])/2.0;
					double my = (py[i]+py[j])/2.0;
					csx.add(mx-vy);
					csy.add(my+vx);
					csx.add(mx+vy);
					csy.add(my-vx);
				}
			}
			int maxCount = 0;
			for(int i=0; i<csx.size(); i++) {
				int count = 0;
				for(int j=0; j<n; j++) {
					if(Math.pow(csx.get(i)-px[j],2.0)+Math.pow(csy.get(i)-py[j],2.0) <= 1.0000000001) {
						count++;
					}
				}
				maxCount = Math.max(maxCount, count);
			}
			System.out.println(maxCount);
		}
	}

	// Read Class
	static class FS {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;
		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			} else {
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

		private int readByte() { return hasNextByte() ? buffer[ptr++] : -1;}
		private boolean isPrintableChar(int c) {return 33 <= c && c <= 126;}
		private void skipUnprintable() {while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}

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
		public int nextInt() {
			return (int)nextLong();
		}
		public double nextDouble() {
			return Double.parseDouble(next());
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
			while(true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if(b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
	}
}