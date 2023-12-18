import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;

// import java.text.DecimalFormat; 
// import java.text.DecimalFormatSymbols; 
/*
caba
abc
  
 */

public class Main {

	public static Set<Integer>[] g;
	public static boolean[] vis;
	public static int max;
	public static int lo;
	
    @SuppressWarnings("unchecked")
	public static void main(String args[] ) throws Exception {
        PrintWriter pw=new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        
        int n = sc.nextInt(), m = sc.nextInt();
        n++;
        g = new HashSet[n];
        vis = new boolean[n];
        for(int i=0;i<n;i++) {
        	g[i] = new HashSet<>();
        }
        max=0;
        while(m-->0) {
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	g[a].add(b);
        	g[b].add(a);
        }
        for(int i=1;i<n;i++) {
        	lo=0;
        	if(!vis[i]) {
        		dfs(i);
        	}
        	if(max<lo)
        		max=lo;
        }
        pw.print(max);
        
        
        pw.close();
    }
    
    public static void dfs(int s) {
    	lo++;
    	vis[s] = true;
    	for(Integer e:g[s]) {
    		if(!vis[e]) {
    			dfs(e);
    		}
    	}
    }
    
    
    
    
   
   static <T> void deb(T x){
       System.out.println(x);
   }
   
   
   static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		
		public String next() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		public String next(int k) {
			try {
				return br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return "Not able to read";
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
		
	    
	}
   
}