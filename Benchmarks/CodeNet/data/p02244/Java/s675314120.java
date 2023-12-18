import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();
	static Queen[] Q = new Queen[8];
	static HashSet<Integer> r_rest = new HashSet<>();
	static HashSet<Integer> c_rest = new HashSet<>();

	public static void main(String[] args) {
		int k = sc.nextInt();
		
		for(int i=0; i<8; i++) {
			r_rest.add(i);
			c_rest.add(i);
		}
		
		for(int i=0; i<k; i++) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			Q[i] = new Queen(r, c, i);
			r_rest.remove(r);
			c_rest.remove(c);
		}
//		System.out.println(r_rest);
//		System.out.println(c_rest);
		
		for(int r : r_rest) {
			for(int c : c_rest) {
				Q[0].backTrack(k, r, c);
			}
		}
		
		if(k == 8) {
			Q[0].showAnswer();
		}
	}
	
	static class Queen {
		int r;
		int c;
		int id;
		
		Queen(int r, int c, int id) {
			this.r = r;
			this.c = c;
			this.id = id;
		}
		
		public void backTrack(int k, int r, int c) {
			if(r != this.r && c != this.c && (r+c) != (this.r+this.c) && (r-c) != (this.r-this.c)) {
				if(id == k-1) {
					Q[k] = new Queen(r, c, k);
					if(k == 7) {
						showAnswer();
						System.exit(0);
					}
					for(int rt : r_rest) {
						for(int ct : c_rest) {
							Q[0].backTrack(k+1, rt, ct);
						}
					}
					
				} else {
					Q[id+1].backTrack(k, r, c);
				}
				
			}
		}
		
		public void showAnswer() {
			for(int i=0; i<8; i++) {
				for(int j=0; j<8; j++) {
					boolean flag = false;
					for(int k=0; k<8; k++) {
						if(Q[k].r == i && Q[k].c == j) {
							flag = true;
							break;
						}
					}
					if(flag) {
						System.out.print("Q");
					} else {
						System.out.print(".");
					}
					
				}
				System.out.println();
			}
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