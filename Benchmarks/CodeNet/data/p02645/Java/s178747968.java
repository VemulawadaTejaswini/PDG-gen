import java.io.*;
import java.util.*;

public class Main implements Runnable {
	FastReader sc;
	PrintWriter out;
	long mod = (long)1e9 + 7;
	
	
	void solve() 
	{	
		int tc = 1;
		outer: while(tc-- > 0)
		{
			int a = sc.ni();
			int v = sc.ni();
			
			int b = sc.ni();
			int w = sc.ni();
			
			int t = sc.ni();
			int d = Math.abs(b-a);
			if(v <= w)
			{
				out.println("NO");
			}
			else 
			{
				int ct = (int)Math.ceil((double)d/(v-w));
				if(ct <= t)
				{
					out.println("YES");
				}
				else out.println("NO");
			}
		}
	}
	
	class Pair implements Comparable<Pair>
	{
		
		int x;
		int y;
		
		Pair(int x,int y)
		{
			this.x = x;
			this.y = y;
		}
		
		public int compareTo(Pair o) 
		{
			
			if(x != o.x)
			{
				if(x > o.x) return 1;  //increasing order
				else return -1;	
			}
			else
			{
				if(y > o.y) return 1;  //increasing order
				else return -1;	
			}
		}
	}

	public void run() 
	{
		out = new PrintWriter(System.out);
		sc = new FastReader();
		solve();
		out.flush();
	}

	public static void main(String[] args) 
	{
		new Thread(null, new Main(), "Main", 1 << 28).start();
	}

	class FastReader 
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
  
        int ni() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nl() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nd() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nln() 
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
        

		int[] nia(int n) {
			int[] ar = new int[n];
			for (int i = 0; i < n; i++)
				ar[i] = ni();
			return ar;
		}
		
		long[] nla(int n) {
			long[] ar = new long[n];
			for (int i = 0; i < n; i++)
				ar[i] = nl();
			return ar;
		}

	    
		int[][] nim(int n, int m) {
			int[][] ar = new int[n][];
			for (int i = 0; i < n; i++) {
				ar[i] = nia(m);
			}
			return ar;
		}

		long[][] nlm(int n, int m) {
			long[][] ar = new long[n][];
			for (int i = 0; i < n; i++) {
				ar[i] = nla(m);
			}
			return ar;
		}
		
		String reverse(String s)
		{
			StringBuilder r = new StringBuilder(s);
			return r.reverse().toString();
		}
		
		void merge1(int arr[], int l, int m, int r)
	    {
	        int n1 = m - l + 1;
	        int n2 = r - m;
	        int L[] = new int [n1];
	        int R[] = new int [n2];
	        for (int i=0; i<n1; ++i)
	            L[i] = arr[l + i];
	        for (int j=0; j<n2; ++j)
	            R[j] = arr[m + 1+ j];
	        int i = 0, j = 0;
	        int k = l;
	        while (i < n1 && j < n2)
	        {
	            if (L[i]<=R[j])
	            {
	                arr[k] = L[i];
	                i++;
	            }
	            else
	            {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	        while (i < n1)
	        {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }
	        while (j < n2)
	        {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	    }
	    void sort1(int arr[], int l, int r)
	    {
	        if (l < r)
	        {
	            int m = (l+r)/2;
	            sort1(arr, l, m);
	            sort1(arr , m+1, r);
	            merge1(arr, l, m, r);
	        }
	    }
    }
}