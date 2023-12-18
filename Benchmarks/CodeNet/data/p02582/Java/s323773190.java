
// Submitted By Subhash Yadav
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.*;

public class Main {
	

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		char c[]=sc.next().toCharArray();
		if(c[0]=='R'&&c[1]=='R'&&c[2]=='R')System.out.println(3);
		else if((c[0]=='R'&&c[1]=='R')||(c[2]=='R'&&c[1]=='R'))System.out.println(2);
		else if(c[0]=='R'||c[1]=='R'||c[2]=='R') System.out.println(1);
		else System.out.println(0);
		
		
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

		double nextDouble() {
			return Double.parseDouble(next());
		}
	}

}