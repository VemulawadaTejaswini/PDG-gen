import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
	 int n=fs.nextInt();
	 int k=fs.nextInt();
	 int a[]=fs.readArray(n);
	 long mult=1;
//	 for(int i=0;i<k;i++) {
//		 mult=mult*a[i];
//	 }
//	 long prev=mult;
	 
	 for(int i=k;i<n;i++) {
//		 System.out.println("i-k"+" "+a[i-k]);
//		 System.out.println("i"+" "+a[i]);
		 if(a[i-k]>=a[i]) {
			 System.out.println("No");
		 }
		 else {
			 System.out.println("Yes");
		 }
//	 mult=mult/a[i-k];
//	 mult=mult*a[i];
//	 if(mult>prev) {
//		 System.out.println("Yes");
//	 }
//	 else {
//		 System.out.println("No");
//	 }
//	 prev=mult;
	 }
	 
	   
	}
	static void sort(int[] a ) {
		ArrayList<Integer> l = new ArrayList<>();
		for(int i:a) l.add(i);
		Collections.sort(l);
		for(int i=0;i<l.size();i++) a[i]=l.get(i);
	}
	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		String next() {
			while(!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				}catch(IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a = new int[n];
			for(int i=0;i<n;i++)a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
