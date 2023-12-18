import java.util.*;
import java.io.*;
public class Main  {
    public static void main(String args[]) {
      FastScanner fs=new FastScanner();    
      PrintWriter out=new PrintWriter(System.out);
      
      int n=fs.nextInt();
      int m=fs.nextInt();
      
      ArrayList<ArrayList<Integer>> al=new ArrayList<>();
      
      int i,j;
      for(i=0;i<=n;i++)
      {
          ArrayList<Integer> temp=new ArrayList<>();
          al.add(temp);
      }
      
      for(i=0;i<m;i++)
      {
          int f=fs.nextInt();
          int s=fs.nextInt();
          al.get(f).add(s);
          al.get(s).add(f);
      }
      
      int c=0;
      int max=0;
      for(i=1;i<=n;i++)
      {
          if(al.get(i).size()>max)
          max=al.get(i).size();
      }
      out.println(n-max-1);
      
      
      
        
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