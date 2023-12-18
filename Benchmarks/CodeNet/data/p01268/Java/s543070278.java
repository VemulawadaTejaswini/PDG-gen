import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Collections;

public class Main {
	public static ArrayList<Integer> getLargePrime(int n, int k) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		primes.add(2);
		if(n < 2) result.add(2);
		int i = 3;
		while(true) {
			boolean isValid = true;
			for(int j=0; j<primes.size(); j++) {
				int e = primes.get(j);
				if(i % e == 0) {
					isValid = false;
					break;
				}
				if(i < e * e) break;
			}
			if(isValid) {
				primes.add(i);
				if(n < i) result.add(i);
			}
			if(k < result.size()) break;
			i += 2;
		}
		return result;
	}

	public static void main(String[] args) {
		FS r = new FS();
		while(true) {
			int n = r.nextInt();
			int p = r.nextInt();
			if(n==-1 && p==-1) break;
			ArrayList<Integer> ps = getLargePrime(n, p);
			ArrayList<Integer> re = new ArrayList<Integer>();
			for(int i=0; i<ps.size(); i++) {
				for(int j=i; j<ps.size(); j++) {
					re.add(ps.get(i)+ps.get(j));
				}
			}
			Collections.sort(re);
			System.out.println(re.get(p-1));
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