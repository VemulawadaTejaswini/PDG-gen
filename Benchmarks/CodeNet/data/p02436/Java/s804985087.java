import java.util.Scanner;

// Main
class Main {
	static final int INIT = 8;
	static int[] grow(int[] s) {
		int[] d = new int[s.length * 2];
		System.arraycopy(s, 0, d, 0, s.length);
		return d;
	}

	static class Queue {
		private int[] data;
		private int r, w;
		public Queue() {
			data = new int[INIT];
			// r 読み込み
			// w 書き込み
		}
		public boolean isEmpty() {
			return r == w;
		}
		public void enqueue(int x) {
			if (w >= data.length) {
				data = grow(data);
			}
			data[w++] = x;
		}
		public int getFront() {
			return data[r];
		}
		public void dequeue() {
			if (!isEmpty()) {
				r++;
			}
		}
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			Queue[] qq = new Queue[n];
			for (int i = 0; i < n; i++) {
				qq[i] = new Queue();
			}
			int q = sc.nextInt();
			for (int i = 0; i < q; i++) {
				int c = sc.nextInt();
				int t = sc.nextInt();
				switch (c) {
				case 0:
					int x = sc.nextInt();
					qq[t].enqueue(x);
					break;
				case 1:
					if (!qq[t].isEmpty()) {
						System.out.println(Integer.toString(qq[t].getFront()));
					}
					break;
				case 2:
					qq[t].dequeue();
					break;
				}
			}
		}
	}
}

