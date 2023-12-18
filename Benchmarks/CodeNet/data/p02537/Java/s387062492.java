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
		int n = f.nextInt(), k = f.nextInt();
		SegmentTree seg = new SegmentTree(300_002);
		for(int i=0;i<n;i++) {
			int now = f.nextInt();
			long max = seg.get(now-k, now+k+1);
			seg.update(now, (int)(max + 1));
		}

		long ans = 0;
		for(int i=0;i<300_002;i++) {
			ans = Math.max(ans, seg.arr[i]);
		}

		out.println(ans);
	}

    static class SegmentTree {
        int n;
        long[] arr;
 
        SegmentTree(int l) {
            this.n = calc(l);
            arr = new long[n << 1];
        }
 
        private static int calc(int size) {
            int ans = 1;
            while (ans < size) {
                ans <<= 1;
            }
            return ans;
        }

        void update(int i, int x) {
            int ind = n - 1 + i;
            arr[ind] = x;
            while (ind > 0) {
                ind = (ind-1)/2;
                arr[ind] = Math.max(arr[2*ind+1], arr[2*ind+2]);
            }
        }
 
        long get(int left, int right) {
            return search(left, right, 0, 0, n);
        }
 
        long search(int l, int r, int x, int lx, int rx) {
 
            if(rx <= l || r <= lx) {
                return 0;
            }
            if(l <= lx && rx <= r) {
                return arr[x];
            }
 
            return Math.max(search(l, r, 2*x+1, lx, (rx+lx)/2),
                    search(l, r, 2*x+2, (rx+lx)/2, rx));
        }
 
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

		long  nextLong() {
			return Long.parseLong(next());
		}
	}
}