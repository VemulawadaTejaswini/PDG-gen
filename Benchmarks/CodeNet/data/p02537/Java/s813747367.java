
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B {

	static int mod = (int) 1e9 + 7;

	static int ar[];
	 static Scanner sc = new Scanner(System.in);
	static StringBuilder out = new StringBuilder();

	static ArrayList<Integer> gr[];
	int n;

	static class pair implements Comparable<pair> {

		int f;
		int s;

		public pair(int a, int b) {
			f = a;
			s = b;
		}

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			if (this.s == o.s)
				return o.f - this.f;
			return this.s - o.s;
		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int tc =1;// sc.nextInt();
		while (tc-- > 0) {

			
			int n=sc.nextInt();
			int k=sc.nextInt();
			int ar[]=new int [n];
			for(int i=0;i<n;i++)ar[i]=sc.nextInt();
			
			int dp[]=new int [n];
			for(int i=0;i<n;i++){
				dp[i]=1;
				
				for(int j=0;j<i;j++){
					
					
					if(Math.abs(ar[i]-ar[j])<=k)dp[i]=Math.max(dp[i], dp[j]+1);
				}
			}
			
			int max=0;
			for(int i=0;i<n;i++){
				max=Math.max(dp[i], max);
			}

			System.out.println(max);

		}

		System.out.println(out);

	}

	
	
	static int solve(int ar[], int n, int len) {

		boolean dp[] = new boolean[n + 1];
		int fre[] = new int[n + 1];
		for (int i = 0; i < len; i++) {

			dp[ar[i]] = true;
			fre[ar[i]]++;

		}

		for (int i = len; i < n; i++) {

			fre[ar[i]]++;
			fre[ar[i - len]]--;
			if (fre[ar[i - len]] == 0)
				dp[ar[i - len]] = false;
		}

		int val = -1;
		for (int i = 0; i <= n; i++) {
			if (dp[i])
				val = i;
		}

		return val;
	}

//	static Reader sc = new Reader();

	static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public Reader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public Reader(String file_name) throws IOException {
			din = new DataInputStream(new FileInputStream(file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public String readLine() throws IOException {
			byte[] buf = new byte[64]; // line length
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
		}

		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}

		public long nextLong() throws IOException {
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}

		public double nextDouble() throws IOException {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();

			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (c == '.') {
				while ((c = read()) >= '0' && c <= '9') {
					ret += (c - '0') / (div *= 10);
				}
			}

			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}

		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}
	}

}
