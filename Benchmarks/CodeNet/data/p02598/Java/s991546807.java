import java.io.*;
import java.math.*;
import java.util.*;
 
public class Main {
	static final long MOD = 1000000007L;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.ni();
		long K = sc.nl();
		long[] nums = new long[N];
		for (int i = 0; i<  N; i++)
			nums[i] = sc.nl();
		int low = 1;
		int high = 1000000000;
		while (low < high) {
			int med = (low+high)/2;
			long cut = 0;
			for (int i = 0; i < N; i++) {
				cut += (nums[i]-1)/med;
			}
			if (cut <= K) {
				high = med;
			} else {
				low = med+1;
			}
		}
		pw.println(low);
		pw.close();
	}
	
    static class FastScanner { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastScanner() { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next() { 
            while (st == null || !st.hasMoreElements()) { 
                try { 
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        }
        
        int ni() { 
            return Integer.parseInt(next()); 
        }
  
        long nl() { 
            return Long.parseLong(next()); 
        } 
  
        double nd() { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() {
            String str = ""; 
            try { 
                str = br.readLine(); 
            } catch (IOException e) {
                e.printStackTrace(); 
            } 
            return str;
        }
    }
}