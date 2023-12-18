
import java.util.Scanner;

public class Main {
	long count = 0;

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Card[] A = new Card[n];
		for (int i = 0; i < n; i++) {
			A[i] = new Card(scanner.next().charAt(0), scanner.nextInt(), i);
		}
		quicksort(A, 0, n - 1);
		boolean flag = true;
		int off;
		int[] I = new int[4];
		loop: for (int i = 0; i < n; i += off) {
			I[0] = A[i].idx;
			off = 1;
			while (i + off < n && A[i].num == A[i + off].num) {
				I[off] = A[i + off].idx;
				off++;
			}
			if (off != 1) {
				for (int j = 1; j < off; j++) {
					if (I[j - 1] > I[j]) {
						flag = false;
						break loop;

					}
				}
			}
		}
		if (flag)
			System.out.println("Stable");
		else
			System.out.println("Not stable");
		for (int i = 0; i < n; i++) {
			System.out.println(A[i].pic + " " + A[i].num);
		}

	}

	private void quicksort(Card[] A, int p, int r) {
		if (p < r) {
			int q = partition(A, p, r);
			quicksort(A, p, q - 1);
			quicksort(A, q + 1, r);
		}

	}

	private int partition(Card[] a, int p, int r) {
		Card work;
		int i = p - 1;
		for (int j = p; j < r; j++) {
			if (a[j].num <= a[r].num) {
				i++;
				work = a[i];
				a[i] = a[j];
				a[j] = work;
			}
		}
		work = a[i + 1];
		a[i + 1] = a[r];
		a[r] = work;
		return i + 1;
	}

	class Card {
		char pic;
		int num;
		int idx;

		public Card(char pic, int num, int idx) {
			this.pic = pic;
			this.num = num;
			this.idx = idx;
		}

		@Override
		public String toString() {
			return "[p=" + pic + ", n=" + num + ", id=" + idx + "]\n";
		}

	}
}