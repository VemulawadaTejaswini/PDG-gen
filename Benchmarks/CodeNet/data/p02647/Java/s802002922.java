import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Main {
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);

	
	static int n;
	static int m;
	static int a;
	static int b;
	
	static String s;
	static String t;
	static Queue <Integer> q = new ArrayDeque <Integer>();
	//static List<ArrayList<Integer>> e;
	//static LinkedList<Integer> adj[]; 
	//static HashMap <Long, Integer> map;
	
	
	public static void main(String[] args) {
		n = sc.nextInt();
		int k = sc.nextInt();
		
		int a[] = sc.nextIntArray(n, true);
		
		long ans [] = new long [n+2];
		q = new ArrayDeque <Integer>();
		
		for (int i=1; i<=n; i++) {	
			int l = Math.max((i-a[i]),1);
			int r = Math.min((i+a[i]+1),n+1);
			ans[l]++;
			ans[r]--;
			if (l!=1 || r!=n+1)
				q.offer(i);
		}
		
		int cur = 0;
		for (int i=1; i<=n; i++) {
			cur+=ans[i];
			a[i] = cur;
		}
		
		for (int j=1; j<k; j++) {
			ans = new long [n+2];
			int cnt = n-q.size();
			ans[1]+=cnt;
			ans[n+1]-=cnt;
			
			for (int m=0; m<n-cnt; m++) {
				int i = q.poll();
				int l = Math.max((i-a[i]),1);
				int r = Math.min((i+a[i]+1),n+1);
				ans[l]++;
				ans[r]--;
				if (l!=1 || r!=n+1)
					q.offer(i);
			}
			
			cur = 0;
			for (int i=1; i<=n; i++) {
				cur+=ans[i];
				a[i] = cur;
			}

		}
		
		for (int i=1; i<=n; i++) {
			out.print(a[i]+" ");
		}
		
		
		out.flush();
		
	}
	

	
	static class FastScanner {
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

	    private int readByte() {
	      if (hasNextByte()) return buffer[ptr++];
	      else return -1;
	    }

	    private static boolean isPrintableChar(int c) {
	      return 33 <= c && c <= 126;
	    }

	    private void skipUnprintable() {
	      while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
	    }

	    public boolean hasNext() {
	      skipUnprintable();
	      return hasNextByte();
	    }

	    public String next() {
	      if (!hasNext()) throw new NoSuchElementException();
	      StringBuilder sb = new StringBuilder();
	      int b = readByte();
	      while (isPrintableChar(b)) {
	        sb.appendCodePoint(b);
	        b = readByte();
	      }
	      return sb.toString();
	    }
	    
	    public double nextDouble () {
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
	      while (true) {
	        if ('0' <= b && b <= '9') {
	          n *= 10;
	          n += b - '0';
	        } else if (b == -1 || !isPrintableChar(b)) {
	          return minus ? -n : n;
	        } else {
	          throw new NumberFormatException();
	        }
	        b = readByte();
	      }
	    }

	    public int nextInt() {
	      return (int) nextLong();
	    }

	    public int[] nextIntArray(int N, boolean oneBased) {
	      if (oneBased) {
	        int[] array = new int[N + 1];
	        for (int i = 1; i <= N; i++) {
	          array[i] = sc.nextInt();
	        }
	        return array;
	      } else {
	        int[] array = new int[N];
	        for (int i = 0; i < N; i++) {
	          array[i] = sc.nextInt();
	        }
	        return array;
	      }
	    }

	    public long[] nextLongArray(int N, boolean oneBased) {
	      if (oneBased) {
	        long[] array = new long[N + 1];
	        for (int i = 1; i <= N; i++) {
	          array[i] = sc.nextLong();
	        }
	        return array;
	      } else {
	        long[] array = new long[N];
	        for (int i = 0; i < N; i++) {
	          array[i] = sc.nextLong();
	        }
	        return array;
	      }
	    }
	  }
}
