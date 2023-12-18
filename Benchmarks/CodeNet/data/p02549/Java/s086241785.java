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

	static int MOD = 998244353;
	static void solve() {
		int n = f.nextInt();
		int k = f.nextInt();
		int[][] arr = new int[k][2];
		for(int i=0;i<k;i++) {
			arr[i][0] = f.nextInt();
			arr[i][1] = f.nextInt();
		}

		SegmentTree seg = new SegmentTree(n);
		seg.update(0,1);
		for(int i=1;i<n;i++) {
			long loc = 0;
			for(int j=0;j<k;j++) {
				loc = (loc + seg.get(Math.max(0,i-arr[j][1]), Math.max(i-arr[j][0]+1,0))) % MOD; 
			}
			seg.update(i, (int) loc);
		}

		out.println(seg.get(n-1,n));
	}

	static class SegmentTree {
        int n;
        int[] arr;
 
        SegmentTree(int l) {
            this.n = calc(l);
            arr = new int[n << 1];
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
                arr[ind] = (arr[2*ind+1]+ arr[2*ind+2]) % MOD;
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
 
            return (search(l, r, 2*x+1, lx, (rx+lx)/2)+
                    search(l, r, 2*x+2, (rx+lx)/2, rx)) % MOD;
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
	}
}