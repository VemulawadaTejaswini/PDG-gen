import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
 
public class Main {
	private static FastScanner sc = new FastScanner();
	static Node[] V;
	
	public static void main(String[] args) {
		int Vn = sc.nextInt();
		int En = sc.nextInt();
		
		V = new Node[Vn]; 
		for(int i=0; i<Vn; i++) {
			V[i] = new Node();
		}
		
		int[][] d = new int[Vn][Vn];
		for(int i=0; i<Vn; i++) {
			for(int j=0; j<Vn; j++) {
				if(i == j) {
					d[i][j] = 0;
				} else{
					d[i][j] = Integer.MAX_VALUE;
				}
			}
		}
		
		for(int i=0; i<En; i++) {
			d[sc.nextInt()][sc.nextInt()] = sc.nextInt();
		}
		
		for(int k=0; k<Vn; k++) {
			for(int i=0; i<Vn; i++) {
				for(int j=0; j<Vn; j++) {
					if(d[i][k] != Integer.MAX_VALUE && d[k][j] != Integer.MAX_VALUE && d[i][j] > d[i][k] + d[k][j]) {
						d[i][j] = d[i][k] + d[k][j];
					}
				}
			}
		}
		
		for(int k=0; k<Vn; k++) {
			for(int i=0; i<Vn; i++) {
				for(int j=0; j<Vn; j++) {
					if(d[i][k] != Integer.MAX_VALUE && d[k][j] != Integer.MAX_VALUE && d[i][j] > d[i][k] + d[k][j]) {
						System.out.println("NEGATIVE CYCLE");
						return;
					}
				}
			}
		}
		
		StringBuilder ans = new StringBuilder();
		for(int i=0; i<Vn; i++) {
			for(int j=0; j<Vn; j++) {
				if(d[i][j] == Integer.MAX_VALUE) {
					ans.append("INF");
				} else {
					ans.append(d[i][j]);
				}
				if(j != Vn-1) {
					ans.append(" ");
				}
			}
			ans.append("\n");
		}
		System.out.print(ans);
	}
	
	static class Node {
		int min = Integer.MAX_VALUE;
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