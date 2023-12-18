import java.util.*;
import java.io.*;

public class Main {
   public static void main(String[] args) {
	   
	   	FastScanner in = new FastScanner();
	   	int k = in.nextInt();
	   	if(k == 1) {
	   		System.out.println("ACL");
	   	}	else if(k == 2) {
	   		System.out.println("ACLACL");
	   	}	else if(k == 3) {
	   		System.out.println("ACLACLACL");
	   	}	else if(k == 4) {
	   		System.out.print("ACLACLACLACL");
	   	}	else {
	   		System.out.println("ACLACLACLACLACL");
	   	}
		
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