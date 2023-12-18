

import java.io.*;
import java.util.*;


public class Main {
	 static FastReader sc=null;
	

	public static void main(String[] args) {
	    sc=new FastReader();
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    graph g=new graph(n);
	    for(int i=0;i<m;i++) {
	    	int v=sc.nextInt()-1;
	    	int w=sc.nextInt()-1;
	    	g.addEdge(v, w);
	    }
	    g.Connected();
	    System.out.println(g.count-1);
	   
		
	}
	
	static class graph{
		int v;
		List<Set<Integer>> adj;
		boolean marked[];
		int count;
		int distTo[];
		graph(int v){
			this.v=v;
			adj=new ArrayList<>();
			marked=new boolean[v];
			distTo=new int[v];
			for(int i=0;i<v;i++) {
				Set<Integer> al=new HashSet<>();
				adj.add(i,al);
			}
		}
		public void Connected() {
			for(int i=0;i<v;i++) {
				if(!marked[i]) {
					dfs(i);
					count++;
				}
			}
		}
		public void addEdge(int v,int w) {
			if(v==w)return;
			adj.get(v).add(w);
			adj.get(w).add(v);
			
		}
		public void dfs(int v) {
			marked[v]=true;
			for(int w:adj.get(v)) {
				if(!marked[w])dfs(w);
			}
		}
		public void bfs(int s) {
			ArrayDeque<Integer> bfs=new ArrayDeque<>();
			bfs.add(s);
			while(!bfs.isEmpty()) {
				int v=bfs.remove();
				marked[v]=true;
				for(int w:adj.get(v)) {
					if(!marked[w]) {
						distTo[w]=distTo[v]+1;
						bfs.add(w);
					}
				}
				
			}
			
			
		}
	}
	static int[] readArray(int n) {
		int a[]=new int [n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		return a;
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
