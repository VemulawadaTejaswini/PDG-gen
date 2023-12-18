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

    static void solve(FastScanner in,PrintWriter out){
     int n=in.nextInt();
     int m=in.nextInt();
     int M=in.nextInt();
     int ans=0;
     int r[]=new int[M]; int c[]=new int[M];
     HashMap<Integer,Integer> x=new HashMap<>();
     HashMap<Integer,Integer> y=new HashMap<>();
     for(int i=0;i<M;i++){
         int xx=in.nextInt(), yy=in.nextInt(); r[i]=xx; c[i]=yy;
         if(x.containsKey(xx)) x.put(xx,x.get(xx)+1); else x.put(xx,1);
          if(y.containsKey(yy)) y.put(yy,y.get(yy)+1); else y.put(yy,1);
     }
     for(int i=0;i<M;i++){
         ans=Math.max(ans,x.get(r[i])-1+y.get(c[i]));
     }
     out.println(ans);
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
