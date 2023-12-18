import java.util.*;
import java.io.*;

public class Main {
	static FastReader f = new FastReader();
	static PrintWriter out = new PrintWriter(System.out);
	

	public static void main(String[] args) {
		//int t = f.nextInt();
		//while(t-- > 0)
			solve();
		out.close();
	}

	static void solve() {
		int n = f.nextInt();
		
		long ans = 0;
		for(int i=1;i<=n;i++) {
			long min = 0;
			long max = n;

			while(min < max) {
				long mid = (min + max) / 2;

				if(i * mid < n) {
					min = mid+1;
				} else {
					max = mid-1;
				}
			}

			long loc = Math.max(0, min-3);
			for(long j = Math.max(0, min-3);j<min+3;j++) {
				if(j * i <= n) {
					loc = j;
				} else {
					break;
				}
			}
			if(loc * i == n) {
				loc--;
			}
			ans += loc;
		}

		out.println(ans);
	}

	static class FastReader {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String next() {
			while(st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch(IOException ioe) {
					ioe.printStackTrace();
				}
			}
			return st.nextToken();
		}

		String nextLine() {
			String s = "";
			try {
				s = br.readLine();
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}

			return s;
		}

		int  nextInt() {
			return Integer.parseInt(next());
		}
	}
}