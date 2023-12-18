import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();

	public static void main(String[] args) {
		int n = sc.nextInt();
		
		Card[] A = new Card[n];
		for(int i=0; i<n; i++) {
			String suit = sc.next();
			int num = sc.nextInt();
			A[i] = new Card(suit, num, i);
		}
		
		quickSort(A, 0, n-1);
		
		boolean flag = true;
		for(int i=1; i<n; i++) {
			if(A[i-1].num == A[i].num && A[i-1].id > A[i].id) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(A[i].suit + " " + A[i].num);
		}
	}
	
	static void quickSort(Card[] A, int p, int r) {
		if(p < r) {
			int q = partition_num(A, p, r);
			quickSort(A, p, q-1);
			quickSort(A, q+1, r);
		}
	}
	
	static int partition_num(Card[] A, int p, int r) {
		int x = A[r].num;
		int i = p-1;
		Card temp;
		for(int j=p; j<=r-1; j++) {
			if(A[j].num <= x) {
				i++;
				temp = A[j];
				A[j] = A[i];
				A[i] = temp;
			}
		}
		temp = A[r];
		A[r] = A[i+1];
		A[i+1] = temp;
		
		return i+1;
	}
	
	static class Card {
		String suit;
		int num;
		int id;
		Card(String suit, int num, int id) {
			this.suit = suit;
			this.num = num;
			this.id = id;
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