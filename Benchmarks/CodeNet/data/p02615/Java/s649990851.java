import java.io.*;
import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args)throws IOException {
		FastIO sc = new FastIO(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n= sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; ++i) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int ans = 0;
		int curr = n-2;
		int num = 0;
		for(int i=n-2; i>=0; --i) {
			if(i==n-2)ans+=arr[n-1];
			else {
				ans+=arr[curr];
				num++;
				if(num==2) {
					curr--;
					num = 0;
				}
			}
		}
		System.out.println(ans);
		out.close();
	}
	static class FastIO {
		InputStream dis;
		byte[] buffer = new byte[1 << 17];
		int pointer = 0;
		public FastIO(String fileName) throws IOException {
			dis = new FileInputStream(fileName);
		}
		public FastIO(InputStream is) throws IOException {
			dis = is;
		}
		int nextInt() throws IOException {
			int ret = 0;
 
			byte b;
			do {
				b = nextByte();
			} while (b <= ' ');
			boolean negative = false;
			if (b == '-') {
				negative = true;
				b = nextByte();
			}
			while (b >= '0' && b <= '9') {
				ret = 10 * ret + b - '0';
				b = nextByte();
			}
 
			return (negative) ? -ret : ret;
		}
		long nextLong() throws IOException {
			long ret = 0;
 
			byte b;
			do {
				b = nextByte();
			} while (b <= ' ');
			boolean negative = false;
			if (b == '-') {
				negative = true;
				b = nextByte();
			}
			while (b >= '0' && b <= '9') {
				ret = 10 * ret + b - '0';
				b = nextByte();
			}
			return (negative) ? -ret : ret;
		}
		byte nextByte() throws IOException {
			if (pointer == buffer.length) {
				dis.read(buffer, 0, buffer.length);
				pointer = 0;
			}
			return buffer[pointer++];
		}
		String next() throws IOException {
			StringBuffer ret = new StringBuffer();
 
			byte b;
			do {
				b = nextByte();
			} while (b <= ' ');
			while (b > ' ') {
				ret.appendCodePoint(b);
				b = nextByte();
			}
 
			return ret.toString();
		}
	}
}
