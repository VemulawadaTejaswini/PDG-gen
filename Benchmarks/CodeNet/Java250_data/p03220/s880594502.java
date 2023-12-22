import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int[] h = new int[n];
		
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		double near = Double.MAX_VALUE;
		int res = -1;
		
		for (int i = 0; i < n; i++) {
			double temperature = Math.abs(a*1.0 -(t*1.0 - h[i]*1.0*0.006));
			if (temperature < near) {
				near = temperature;
				res = i+1;
			}
		}
		
		System.out.println(res);
	}
  
    static class FastReader {
	    BufferedReader br;
	    StringTokenizer st;
	
	    public FastReader() {
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
	
	    int nextInt() {
	      return Integer.parseInt(next());
	    }
	
	    long nextLong() {
	      return Long.parseLong(next());
	    }
	
	    double nextDouble() { 
	      return Double.parseDouble(next());
	    }
	
	    String nextLine() {
	      String str = "";
	        try{
	            str = br.readLine();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return str;
	      }
	  }
}