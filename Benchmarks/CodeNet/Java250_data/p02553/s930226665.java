import java.util.*;
import java.io.*;
public class Main  {
    public static void main(String args[]) {
      FastScanner fs=new FastScanner();    
      PrintWriter out=new PrintWriter(System.out);
        
        long a=fs.nextLong(),b=fs.nextLong(),c=fs.nextLong(),d=fs.nextLong();
    
        long p1=a*c,p2=a*d,p3=b*c,p4=b*d;
        
        out.println(Math.max(p1,Math.max(p2,Math.max(p3,p4))));   
        
        
        out.flush();
        out.close();
    }
	static void ruffleSort(int[] a) {
 		Random random=new Random();
		int n=a.length;
		for (int i=0; i<n; i++) {
			int oi=random.nextInt(n), temp=a[oi];
			a[oi]=a[i]; a[i]=temp;
		}
		Arrays.sort(a);
	}
}
        class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		
		String next() {
			while (!st.hasMoreTokens())
				try {
				st=new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		String nextLine() {
		    String str="";
		    try {
		        str=br.readLine();
		    }
		    catch (IOException e) {
		        e.printStackTrace(); 
		    }
		    return str;
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		double nextDouble() {
		    return Double.parseDouble(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
	}