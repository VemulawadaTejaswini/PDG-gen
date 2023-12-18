import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

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
				int s = sc.nextInt() - 1;
				int t = sc.nextInt() - 1;
				int x = sc.nextInt();
				V[0].updateRangeAdd(x, s, t);

			} else {
				int s = sc.nextInt() - 1;
				int t = sc.nextInt() - 1;
				int ans = V[0].getSum(s, t);
				sb.append(ans);
				sb.append("\n");
			}
//
//			for(int j=0; j<N; j++) {
//				System.out.print(V[j].value + " ");
//			}
//			System.out.println();
		}

		System.out.print(sb);

	}

	static class NodeSegmentTree {
		int seg_left;
		int seg_right;
		int id;
		int value = 0;
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

		void updateRangeAdd(int value, int l, int r) {
            if(l <= seg_left && r >= seg_right) {
                this.value += value * (seg_right - seg_left + 1);
                return;
            }
            if(l > seg_right || r < seg_left) {
                return;
            }

            V[2 * id + 1].updateRangeAdd(value, l, r);
            V[2 * id + 2].updateRangeAdd(value, l, r);
        }

		public int getSum(int l, int r) {
            if(l > seg_right || r < seg_left) {
                return 0;
            }
            if(id >= N/2) {
            	return value;
            }
            V[2 * id + 1].value += value / 2;
            V[2 * id + 2].value += value / 2;
            this.value = 0;

            int a = V[2 * id + 1].getSum(l, r);
            int b = V[2 * id + 2].getSum(l, r);
            return a + b;
        }

	}

	static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            }else{
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }
        private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
        private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
        private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
        public boolean hasNext() { skipUnprintable(); return hasNextByte();}
        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }
        public long nextLong() {
            return Long.parseLong(next());
        }
        public int nextInt(){
            return Integer.parseInt(next());
        }
    }
}