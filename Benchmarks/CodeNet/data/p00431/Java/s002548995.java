import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			int n = scan.nextInt();
			if (n == 0)
				break;

			Ring r = new Ring(n);

			for (int i = 0; i < n; i++) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				r.add(x, y, i);
			}

			r.sort();

			int max = 0;
			for (int x = r.elem(); x > 0; x = r.elem()) {
				int m = r.maxRing(x);
				if (m > max)
					max = x;
			}
			System.out.println(max);

		}

		scan.close();
		System.exit(0);
	}
}

class Ring {
	private int[] st;
	private int[] ed;

	public Ring(int n) {
		st = new int[n * 2];
		ed = new int[n * 2];
	}

	private int[] used = new int[100];
	private int usedC = 0;

	public int maxRing(int r) {
		used[usedC++] = r;
		// this.print();
		int len = 0;
		for (int i = 0; i < st.length; i++) {
			if (st[i] > r)
				break;
			if (st[i] < r)
				continue;
			if (this.isUsed(ed[i]))
				continue;
			int le = this.maxRing(ed[i]);
			if (len < le)
				len = le;
		}
		usedC--;
		return len + 1;
	}

	private boolean isUsed(int r) {
		for (int i = 0; i < usedC; i++)
			if (used[i] == r)
				return true;
		return false;
	}

	private int elemP = 0, elemV = -1;

	public int elem() {
		for (; elemP < st.length; elemP++)
			if (st[elemP] != elemV) {
				elemV = st[elemP];
				return elemV;
			}
		return -1;
	}

	public void sort() {
		for (int i = 0; i < st.length; i++)
			for (int j = st.length - 1; j > i; j--)
				if (st[j] < st[j - 1] || (st[j] == st[j - 1] && ed[j] < ed[j - 1])) {
					int tmp = st[j];
					st[j] = st[j - 1];
					st[j - 1] = tmp;
					tmp = ed[j];
					ed[j] = ed[j - 1];
					ed[j - 1] = tmp;
				}
	}

	public void add(int x, int y, int i) {
		st[i * 2] = x;
		ed[i * 2] = y;
		st[i * 2 + 1] = y;
		ed[i * 2 + 1] = x;
	}

	public void print() {
		for (int i = 0; i < usedC; i++)
			System.out.print(used[i] + " ");
		System.out.println();
	}
}