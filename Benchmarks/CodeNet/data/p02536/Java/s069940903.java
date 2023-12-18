import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;

// import java.text.DecimalFormat; 
// import java.text.DecimalFormatSymbols; 
/*
 
 
 
 */

public class Main {

    public static void main(String args[] ) throws Exception {
        PrintWriter pw=new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        
        int t=1;
        //t = sc.ni();
        while(t-->0) {
        	solve(pw,sc);
        }
       
        pw.close();
    }
  
   
    private static void solve(PrintWriter pw, FastScanner sc) {
    	int n = sc.ni(), m =sc.ni();
    	@SuppressWarnings("unchecked")
		List<Integer>[] li = new ArrayList[n];
    	for(int i=0;i<n;i++) li[i] = new ArrayList<>();
    	while(m-->0) {
    		int a = sc.ni()-1;
    		int b = sc.ni()-1;
    		li[a].add(b);
    		li[b].add(a);
    	}
    	int cnt=0;
    	boolean[] vis = new boolean[n];
    	for(int i=0;i<n;i++) {
    		if(!vis[i]) {
    			dfs(li,vis,i);
    			cnt++;
    		}
    	}
    	pw.print(cnt-1);
    	
	}
    static void dfs(List<Integer>[] li,boolean[] vis,int s) {
    	vis[s]=true;
    	for(int i=0;i<li[s].size();i++) {
    		int t = li[s].get(i);
    		if(vis[t]) continue;
    		dfs(li,vis,t);
    	}
    }

	static <T> void deb(T x,int o){
       System.out.print(x);
       if(o==0) {
    	   System.out.println();
    	   
       }
    }
   
   
   static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		
		public String ne() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		public String ne(int k) {
			try {
				return br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return "Not able to read";
		}
		
		int ni() {
			return Integer.parseInt(ne());
		}
		
		long nl() {
			return Long.parseLong(ne());
		}
		
		double nd() {
			return Double.parseDouble(ne());
		}
		
	    
	}
   
}