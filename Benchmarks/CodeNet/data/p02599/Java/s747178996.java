
import java.util.*;
import java.io.*;

public class Main {
	
	public static class FastReader {
		 
		private InputStream stream;
		private byte[] buf = new byte[4096];
		private int curChar, snumChars;
 
		public FastReader(InputStream stream) {
			this.stream = stream;
		}
 
		public int read() {
			if (snumChars == -1) {
				throw new InputMismatchException();
			}
			if (curChar >= snumChars) {
				curChar = 0;
				try {
					snumChars = stream.read(buf);
				} catch (IOException E) {
					throw new InputMismatchException();
				}
			}
			if (snumChars <= 0) {
				return -1;
			}
			return buf[curChar++];
		}
 
		public int nextInt() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int number = 0;
			do {
				number *= 10;
				number += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return number * sgn;
		}
 
		public long nextLong() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			long sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long number = 0;
			do {
				number *= 10L;
				number += (long) (c - '0');
				c = read();
			} while (!isSpaceChar(c));
			return number * sgn;
		}
 
		public int[] nextIntArray(int n) {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = this.nextInt();
			}
			return arr;
		}
 
		public long[] nextLongArray(int n) {
			long[] arr = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = this.nextLong();
			}
			return arr;
		}
 
		public String next() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}
 
		public String nextLine() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndofLine(c));
			return res.toString();
		}
 
		public boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}
 
		public boolean isEndofLine(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}
 
	}
 
	public static FastReader sc;
	public static PrintWriter out;
	public static void main(String[] args) {
		new Thread(null, null, "Thread", 1 << 28) {
			public void run() {
				try {
					out = new PrintWriter(new BufferedOutputStream(System.out));
					sc = new FastReader(System.in);
					new Main().solve();
					out.close();
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(1);
				}
			}
		}.start();
	}

	public void solve() {

     
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;++i) a[i] = sc.nextInt();
        Query[] queries = new Query[q]; 
        for (int i = 0; i < q; i++) { 
            queries[i] = new Query();
            queries[i].l = sc.nextInt()-1;
            queries[i].r = sc.nextInt()-1;
            queries[i].idx = i;
        }
        Arrays.sort(queries, new Comparator<Query>()  
        { 
            public int compare(Query x, Query y) 
            { 
                if (x.r < y.r) 
                    return -1; 
                else if (x.r == y.r) 
                    return 0; 
                else
                    return 1; 
            } 
        }); 
        answeringQueries(a, n, queries, q); 
        
		
		
	}
	 
	
	static int MAX = 5000001; 
	  
    // structure to store queries 
    static class Query  
    { 
        int l, r, idx; 
    } 
  
    // updating the bit array 
    static void update(int idx, int val,  
                        int bit[], int n)  
    { 
        for (; idx <= n; idx += idx & -idx) 
            bit[idx] += val; 
    } 
  
    // querying the bit array 
    static int query(int idx, int bit[], int n)  
    { 
        int sum = 0; 
        for (; idx > 0; idx -= idx & -idx) 
            sum += bit[idx]; 
        return sum; 
    } 
  
    static void answeringQueries(int[] arr, int n,  
                                Query[] queries, int q) 
    { 
  
        // initialising bit array 
        int[] bit = new int[n + 1]; 
        Arrays.fill(bit, 0); 
  
        // holds the rightmost index of any number 
        // as numbers of a[i] are less than or equal to 10^6 
        int[] last_visit = new int[MAX]; 
        Arrays.fill(last_visit, -1); 
  
        // answer for each query 
        int[] ans = new int[q]; 
        int query_counter = 0; 
        for (int i = 0; i < n; i++)  
        { 
  
            // If last visit is not -1 update -1 at the 
            // idx equal to last_visit[arr[i]] 
            if (last_visit[arr[i]] != -1) 
                update(last_visit[arr[i]] + 1, -1, bit, n); 
  
            // Setting last_visit[arr[i]] as i and updating 
            // the bit array accordingly 
            last_visit[arr[i]] = i; 
            update(i + 1, 1, bit, n); 
  
            // If i is equal to r of any query store answer 
            // for that query in ans[] 
            while (query_counter < q && queries[query_counter].r == i)  
            { 
                ans[queries[query_counter].idx] =  
                        query(queries[query_counter].r + 1, bit, n) 
                        - query(queries[query_counter].l, bit, n); 
                query_counter++; 
            } 
        } 
  
        // print answer for each query 
        for (int i = 0; i < q; i++) 
            out.println(ans[i]); 
    } 
  
	
}
