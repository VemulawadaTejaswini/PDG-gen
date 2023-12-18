import java.io.*;
import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		FastScanner in=new FastScanner();
		PrintWriter out=new PrintWriter(System.out);
	//	int t=in.nextInt();
	//	while(t-->0)
		solve(in,out);
		out.close();
	}
	static int max,c;
    static boolean visit[];
    static void dfs(int s,HashSet<Integer> e[]){
        visit[s]=true;
        c++;
        for(int i:e[s]){
            if(visit[i]) continue;
            dfs(i,e);
        }
        
        return;
    }
    static void solve(FastScanner in,PrintWriter out){
    int n=in.nextInt();
    int m=in.nextInt();
    visit=new boolean[n];
    HashSet<Integer> edge[]=new HashSet[n];
    Arrays.setAll(edge,e-> new HashSet<Integer>());
    for(int i=0;i<m;i++){
        int x=in.nextInt()-1, y=in.nextInt()-1;
        edge[x].add(y); edge[y].add(x);
    }
    max=0; c=0;
    for(int i=0;i<n;i++){
     if(!visit[i])
     dfs(0,edge); 
     max=Math.max(max,c);
     c=0;
    }
    out.println(max);
    }    
	


	static void sort(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}

	
}
