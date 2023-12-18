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
     int a[]=new int[n];
     a=in.readArray(n);
     sort(a);
     int ans=0;
     for(int i=0;i<n;i++){
         for(int j=i+1;j<n;j++){
             for(int k=j+1;k<n;k++){
                 if(a[i]!=a[j]&&a[j]!=a[k]&&a[i]!=a[k]&&a[i]+a[j]>a[k]) ans++;
             }
         }
     }
     out.println(ans);
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
