import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int time = 0;

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\ALDS1_6_A-in9.txt"));

		int n = scan.nextInt();
		SSSPath sp = new SSSPath(n);

		for (int i = 0; i < n; i++) {
			int u = scan.nextInt();
			int k = scan.nextInt();
			for (int j = 0; j < k; j++)
				sp.addPath(u, scan.nextInt(), scan.nextInt());
		}
		sp.setPath(0);

		for (int i = 0; i < n; i++)
			System.out.println(i + " " + sp.getResult(i));

		scan.close();
		System.exit(0);
	}
}

class SSSPath {
	class Next {
		public Next(int to, int c) {
			pt = to;
			cost = c;
		}

		int pt;
		int cost;
	}

	class Point {
		List<Next> next = new ArrayList<Next>();
		int reach = -1;
		boolean fixed = false;
	}

	Point[] point;
	Bheap bheap;

	public SSSPath(int n) {
		point = new Point[n];
		for (int i = 0; i < n; i++)
			point[i] = new Point();

		bheap = new Bheap(n);
	}

	public int getResult(int i) {
		return point[i].reach;
	}

	public void setPath(int from) {
		point[from].reach = 0;
		bheap.add(from, 0);
		setP();
	}

	private void setP() {
		int p;
		while ((p = bheap.getTop()) != -1) {
			if (point[p].fixed)
				continue;
			point[p].fixed = true;
			for (int i = 0; i < point[p].next.size(); i++) {
				int np = point[p].next.get(i).pt;
				if (point[np].fixed)
					continue;
				int d = point[p].reach + point[p].next.get(i).cost;
				if (point[np].reach == -1 || point[np].reach > d) {
					point[np].reach = d;
					bheap.add(np, d);
				}
			}
		}
	}

	public void addPath(int from, int to, int c) {
		point[from].next.add(new Next(to, c));
	}

}

class Bheap {
	class Elem {
		int key;
		int pt;

		public Elem(int _pt, int _key) {
			key = _key;
			pt = _pt;
		}

		public void set(Elem e) {
			key = e.key;
			pt = e.pt;
		}
	}

	List<Elem> elem = new ArrayList<Elem>();

	public Bheap(int n) {
		elem.add(new Elem(-1, -1));
	}

	public int getTop() {
		if (elem.size() <= 1)
			return -1;
		int rpt = elem.get(1).pt;

		elem.get(1).set(elem.get(elem.size() - 1));
		elem.remove(elem.size() - 1);

		this.down(1);
		return rpt;
	}

	private void down(int c) {
		int min = c;
		if (c * 2 < elem.size() && elem.get(c * 2).key < elem.get(min).key)
			min = c * 2;
		if (c * 2 + 1 < elem.size() && elem.get(c * 2 + 1).key < elem.get(min).key)
			min = c * 2 + 1;
		if (min == c)
			return;
		this.swap(min, c);
		this.down(min);
	}

	private void swap(int c1, int c2) {
		Elem temp = new Elem(-1, -1);
		temp.set(elem.get(c1));
		elem.get(c1).set(elem.get(c2));
		elem.get(c2).set(temp);
	}

	public void add(int ptr, int cost) {
		elem.add(new Elem(ptr, cost));
		this.up(elem.size() - 1);
	}

	private void up(int c) {
		if (c < 2 || elem.get(c).key >= elem.get(c / 2).key)
			return;

		swap(c, c / 2);
		this.up(c / 2);
	}

}