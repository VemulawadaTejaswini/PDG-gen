import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		FastReader in = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int n = in.nextInt();
		long sum = 0;
		for(int i = 1; i<=n; i++) {
			sum+= (i*sum(i));
		}
		out.print(sum);
		out.close();
				
    }
	static int sum(int n) { 
	    boolean hash[] = new boolean[n + 1]; 
	    Arrays.fill(hash, true); 
	    for (int p = 2; p * p < n; p++) 
	        if (hash[p] == true) 
	            for (int i = p * 2; i < n; i += p) 
	                hash[i] = false; 
	  
	    int total = 1; 
	    for (int p = 2; p <= n; p++)  
	    { 
	        if (hash[p]) 
	        { 
	            int count = 0; 
	            if (n % p == 0)  
	            { 
	                while (n % p == 0)  
	                { 
	                    n = n / p; 
	                    count++; 
	                } 
	                total = total * (count + 1); 
	            } 
	        } 
	    } 
	    return total; 
	} 

	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
		
}