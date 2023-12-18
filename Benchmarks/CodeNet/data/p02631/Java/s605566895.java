// created on : Sun Jun 21 2020
 
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        int n = in.nextInt();
        int a[] = readInt(n);
        SegmentTree tree = new SegmentTree(a, n);
        int ans[] = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = tree.query(0, 0, n - 1, 0, i - 1) ^ tree.query(0, 0, n - 1, i + 1, n - 1);
        }
        println(ans);
        in.close();
        out.close();
    }

    static int MIN = Integer.MIN_VALUE;
    static int MAX = Integer.MAX_VALUE;
    static Reader in = new Reader();
    static PrintWriter out = new PrintWriter(System.out);

    static int[] readInt(int N) throws IOException { 
    	int arr[] = new int[N];
    	for(int i = 0; i < N; i++){ 
    		arr[i] = in.nextInt(); 
    	} 
    	return arr;
    }
    
    static long[] readLong(int N) throws IOException { 
    	long arr[] = new long[N];
    	for(int i = 0; i < N; i++){ 
    		arr[i] = in.nextLong(); 
    	} 
    	return arr;
    }
    
    static void print(Object O) {  
    	out.print(O); 
    }
    
    static void println(Object O) { 
    	out.println(O); 
    }
    
    static void println(int arr[]) { 
    	for(int i = 0; i < arr.length; i++){ 
    		print(arr[i] + " "); 
    	} 
    	println(""); 
    }
    
    static void displayRuntime(long startTime){
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Runtime: " + elapsedTime / 1000D);
    }
}

class SegmentTree{
	int[] tree;

	SegmentTree(int a[], int n){
		tree = new int[4*n];
		for(int i = 0; i < n; i++){
			insert(0, 0, n - 1, i, a[i]);
		}
	}

	// insert(0, 0, n - 1, i, a[i])
	void insert(int idx, int low, int high, int i, int val) {											
		if(low == high) {
			tree[idx] = val;
		}
		else {
			int mid = low + (high - low)/2;
			if(low <= i && i <= mid) {
				insert(2*idx + 1, low, mid, i, val);
			}
			else {
				insert(2*idx + 2, mid + 1, high, i, val);
			}
			tree[idx] = tree[2*idx + 1] ^ tree[2*idx + 2];
		}
	}
	
	// query(0, 0, n - 1, i, j)
	int query(int idx, int low, int high, int i, int j) {  								
		if(low > j || high < i) {
			return 0;
		}
		if(i <= low && j >= high) {
			return tree[idx];
		}
		int mid = low + (high - low)/2;
		return query(2*idx + 1, low, mid, i, j) ^ query(2*idx + 2, mid+1, high, i, j);
	}
}

class Reader {
    BufferedReader reader;
    StringTokenizer tokenizer;

    Reader() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = new StringTokenizer("");
    }

    String next() throws IOException {
        while (!tokenizer.hasMoreTokens() ) { 
            tokenizer = new StringTokenizer(reader.readLine()); 
        }
        return tokenizer.nextToken();
    }

    int nextInt() throws IOException { 
        return Integer.parseInt(next()); 
    }
    
    double nextDouble() throws IOException { 
        return Double.parseDouble(next());
    }
    
    long nextLong() throws IOException { 
        return Long.parseLong(next()); 
    }
    
    String nextLine() throws IOException { 
        return reader.readLine(); 
    }
    
    void close() throws IOException { 
        reader.close(); 
    }
}
