import java.util.Scanner;

// Main
class Main {
	static final int INIT = 8;
	static int[] grow(int[] s) {
		int[] d = new int[s.length * 2];
		System.arraycopy(s, 0, d, 0, s.length);
		return d;
	}

	static class PrioQue {
		private int[] data;
		public PrioQue() {
			data = new int[INIT];
			// data[0] を項目数にする
		}
		public boolean isEmpty() {
			return data[0] == 0;
		}
		public void insert(int x) {
			int next = data[0] + 1;
			if (next >= data.length) {
				data = grow(data);
			}
			data[next] = x;
			data[0] = next;
			// up-heap
			int i = next;
			while (i >= 2) {
				int p = i / 2;
				if (data[p] < data[i]) {
					// 入れ替えて続行
					int t = data[p];
					data[p] = data[i];
					data[i] = t;
					i = p;
				} else {
					// ここで終わり
					break;
				}
			}
		}
		public int getMax() {
			return data[1];
		}
		public void deleteMax() {
			if (!isEmpty()) {
				// top へ入れ替え
				data[1] = data[data[0]];
				int size = data[0] - 1;
				data[0] = size;
				// down-heap
				for (int i = 1; ; ) {
					int c0 = i * 2;
					int c1 = i * 2 + 1;
					int c;
					if (c0 <= size && c1 <= size) {
						if (data[c1] > data[c0]) {
							c = c1;
						} else {
							c = c0;
						}
					} else if (c0 <= size) {
						c = c0;
					} else {
						break;
					}
					if (data[i] < data[c]) {
						// 入れ替えて続行
						int t = data[c];
						data[c] = data[i];
						data[i] = t;
						i = c;
					} else {
						// ここで終わり
						break;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			PrioQue[] qq = new PrioQue[n];
			for (int i = 0; i < n; i++) {
				qq[i] = new PrioQue();
			}
			int q = sc.nextInt();
			for (int i = 0; i < q; i++) {
				int c = sc.nextInt();
				int t = sc.nextInt();
				switch (c) {
				case 0:
					int x = sc.nextInt();
					qq[t].insert(x);
					break;
				case 1:
					if (!qq[t].isEmpty()) {
						System.out.println(Integer.toString(qq[t].getMax()));
					}
					break;
				case 2:
					qq[t].deleteMax();
					break;
				}
			}
		}
	}
}

