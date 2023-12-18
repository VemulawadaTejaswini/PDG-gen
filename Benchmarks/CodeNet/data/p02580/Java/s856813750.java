
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

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int h=sc.nextInt(),w=sc.nextInt(),m=sc.nextInt();
		int a[][]=new int[h+1][w+1];
		int row[]=new int[h+1];
		int col[]=new int[w+1];
		for(int i=0;i<m;i++) {
			int x=sc.nextInt(),y=sc.nextInt();
			a[x][y]=1;
			
			row[x]++;
			col[y]++;
			
		}
		
		long ans=Long.MIN_VALUE;
		for(int i=1;i<=h;i++) {
			for(int j=1;j<=w;j++) {
				long total=row[i]+col[j];
				if(a[i][j]==1) total--;
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