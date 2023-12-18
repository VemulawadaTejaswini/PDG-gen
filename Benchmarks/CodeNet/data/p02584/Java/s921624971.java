import java.io.*;
import java.math.*;
import java.util.*;
 
public class Main {
	static final long MOD = 1000000007L;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		long X = sc.nl();
		long K = sc.nl();
		long D = sc.nl();
		if (Math.log(K)+Math.log(D) > Math.log(1e15) || K*D > Math.abs(X)) {
			//we can go to optimal positions
			long p1 = (D+X%D)%D;
			long p2 = p1-D;
			long moves = (X-p1)/D;
			if (moves%2 == K%2)
				pw.println(Math.abs(p1));
			else
				pw.println(Math.abs(p2));
		} else {
			pw.println(Math.abs(X-K*D));
		}
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