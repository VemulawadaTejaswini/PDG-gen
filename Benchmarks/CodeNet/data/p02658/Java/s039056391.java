package main;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n=sc.nextInt();
		BigInteger a=new BigInteger("1");
		for(int i=0;i<n;i++) {
			BigInteger b=new BigInteger(""+sc.nextLong());
			a=a.multiply(b);
		}
		BigInteger b=new BigInteger("1000000000000000000");
		if(a.compareTo(b)==1)System.out.println(-1);
		else System.out.println(a);
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(String file) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}
		public int[] nextArr(int n) throws IOException{
			int arr[]=new int[n];
			for(int i=0;i<n;i++)arr[i]=nextInt();
			return arr;
		}

	}
}