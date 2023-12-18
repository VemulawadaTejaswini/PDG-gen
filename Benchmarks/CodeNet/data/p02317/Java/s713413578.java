import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
 
public class Main {
	private static FastScanner sc = new FastScanner();
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		int[] dp = new int[n];
		for(int i=0; i<n; i++) {
			dp[i] = Integer.MAX_VALUE;
		}
		
		for(int i=0; i<n; i++) {
			int l = 0;
			int r = n-1;
			int m = 0;
			while(l <= r) {
				m = (l + r) / 2;
				if(dp[m] >= a[i]) {
					if(m-1 >= 0 && dp[m-1] < a[i]) {
						break;
					} else {
						r = m-1;
					}
				} else {
					if(m+1 <= n-1 && dp[m+1] >= a[i]) {
						m++;
						break;
					} else {
						l = m+1;
					}
				}
			}
			
//			System.out.println(m + " " + i);
			dp[m] = a[i];
		}
		
		int i=0;
		for(; i<n; i++) {
			if(dp[i] == Integer.MAX_VALUE) {
				break;
			}
		}
		System.out.println(i);
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