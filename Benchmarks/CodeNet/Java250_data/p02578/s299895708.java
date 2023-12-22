import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {

	public static void main(String[] args) {
		FastReader in = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int n = in.nextInt();
		int[] a = in.readArray(n);
		long ans = 0;
		int max = -1;
		for(int x:a) {
			max = Math.max(max,x);
			ans += max - x;
		}
		out.println(ans);
		out.close();
	}

	static final Random random=new Random();
	//	static void ruffleSort(Pair[] a) {
	//		int n=a.length;//shuffle, then sort 
	//		for (int i=0; i<n; i++) {
	//			int oi=random.nextInt(n);
	//			Pair temp=a[oi];
	//			a[oi]=a[i]; a[i]=temp;
	//		}
	//		Arrays.sort(a);
	//	}
	static void ruffleSort(int[] a) {
		int n=a.length;//shuffle, then sort 
		for (int i=0; i<n; i++) {
			int oi=random.nextInt(n), temp=a[oi];
			a[oi]=a[i]; a[i]=temp;
		}
		Arrays.sort(a);
	}
	static void ruffleSort(char[] a) {
		int n=a.length;//shuffle, then sort 
		for (int i=0; i<n; i++) {
			int oi=random.nextInt(n);
			char temp=a[oi];
			a[oi]=a[i]; a[i]=temp;
		}
		Arrays.sort(a);
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

		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
	}
}

//class Pair implements Comparable<Pair>{
//    int a;
//    int b;
//    public Pair(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }
//    public int compareTo(Pair o) {
//        if(this.a==o.a)
//            return this.b - o.b;
//        return this.a - o.a;
//    }   
//}