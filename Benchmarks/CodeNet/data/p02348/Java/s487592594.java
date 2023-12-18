import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static FastScanner sc = new FastScanner();
	static NodeSegmentTree[] V;
	static int N;

	public static void main(String[] args) {
		int n = sc.nextInt();
		int q = sc.nextInt();

		N = 1;
		while(N < n) {
			N *= 2;
		}
		N = N * 2 - 1;
		if(N == 1) {
			N = 3;
		}

		V = new NodeSegmentTree[N];
		for(int i=0; i<N; i++) {
			V[i] = new NodeSegmentTree(i);
		}

		for(int i=N/2 - 1; i>=0; i--) {
			V[i].setSegment();
		}

		StringBuilder sb = new StringBuilder();
		for(int i=0; i<q; i++) {
			int cmd = sc.nextInt();

			if(cmd == 0) {
				int s = sc.nextInt();
				int t = sc.nextInt();
				int x = sc.nextInt();
				V[0].updateRangeValue(x, s, t);
			} else {
				int x = sc.nextInt();
				sb.append(V[0].find(x));
				sb.append("\n");
			}
		}

		System.out.print(sb);

	}

	static class NodeSegmentTree {
		int seg_left;
		int seg_right;
		int id;
		int value = Integer.MAX_VALUE;
		int lazy = Integer.MAX_VALUE;
		//left = 2 * id + 1
		//right = 2 * id + 2
		//parent = (id - 1) / 2
		//array[i] -> V[N/2 + i]

		NodeSegmentTree(int id) {
			this.id = id;
			this.seg_left = id - N/2;
			this.seg_right = id - N/2;
		}

		void setSegment() {
			seg_left = V[2 * id + 1].seg_left;
			seg_right = V[2 * id + 2].seg_right;
		}

		void updateRangeValue(int value, int l, int r) {
			if(l <= seg_left && r >= seg_right) {
				lazy = value;
				return;
			}
			if(l > seg_right || r < seg_left) {
				return;
			}

			if(lazy != -1) {
				V[2 * id + 1].lazy = lazy;
				V[2 * id + 2].lazy = lazy;
				lazy = -1;
			}
			V[2 * id + 1].updateRangeValue(value, l, r);
			V[2 * id + 2].updateRangeValue(value, l, r);
		}

		public int find(int idx) {
			if(id >= N/2) {
				if(lazy != -1) {
					value = lazy;
					lazy = -1;
				}
				return value;
			} else {
				if(lazy != -1) {
					V[2 * id + 1].lazy = lazy;
					V[2 * id + 2].lazy = lazy;
					lazy = -1;
				}
				if(idx <= (seg_left + seg_right) / 2) {
					return V[2 * id + 1].find(idx);
				} else {
					return V[2 * id + 2].find(idx);
				}
			}
		}

	}

	static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}