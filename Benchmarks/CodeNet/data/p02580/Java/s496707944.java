
// Submitted By Subhash Yadav
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



import java.util.*;

public class Main {
	static class Pair{
		int a,b;
		Pair(int a,int b){
			this.a=a;
			this.b=b;
		}
		@Override
		public boolean equals(Object object)
		{
		    boolean isEqual= false;

		    if (object != null && object instanceof E)
		    {
		        isEqual = (this.a == ((Pair) object).a);
		    }

		    return isEqual;
		}
	}

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int h=sc.nextInt(),w=sc.nextInt(),m=sc.nextInt();
		ArrayList<Integer>[] set=new ArrayList[h+1];
		for(int i=0;i<=h;i++) set[i]=new ArrayList<>();
		int row[]=new int[h+1];
		int col[]=new int[w+1];
		for(int i=0;i<m;i++) {
			int x=sc.nextInt(),y=sc.nextInt();
			
			set[x].add(y);
			
			row[x]++;
			col[y]++;
			
		}
		
	
		
		long ans=Long.MIN_VALUE;
		for(int i=1;i<=h;i++) {
			for(int j=1;j<=w;j++) {
				long total=row[i]+col[j];
				
				
				
				if(set[i].contains(j)) {
					
					total--;
				}
				ans=Math.max(total, ans);
			}
		}
		System.out.println(ans);
		
		
		
		
		out.close();

	}

	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}
}