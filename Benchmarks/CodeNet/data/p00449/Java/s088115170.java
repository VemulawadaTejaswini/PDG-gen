import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new File("c:\\0520-input.txt"));

		while (scan.hasNext()) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			if (n == 0)
				break;
			FareList f = new FareList(n);
			for (int i = 0; i < k; i++) {
				int c = scan.nextInt();
				if (c == 0)
					System.out.println(f.answer(scan.nextInt(), scan.nextInt()));
				else if (c == 1) {
					f.addRoot(scan.nextInt(), scan.nextInt(), scan.nextInt());
					// f.print();
				}
			}
		}
		scan.close();
		System.exit(0);
	}
}

class FareList {
	Root[] root;
	int N;

	public FareList(int n) {
		root = new Root[n + 1];
		for (int i = 1; i <= n; i++)
			root[i] = new Root();
		N = n;
	}

	public void print() {
		for (int i = 1; i < root.length; i++) {
			System.out.println("- from " + i);
			root[i].print();
		}
	}

	public void addRoot(int fr, int to, int f) {
		root[fr].newFare(to, f);
		root[to].newFare(fr, f);
	}

	public int answer(int fr, int to) {
		int[] roop = new int[1];
		roop[0] = fr;
		return this.searchRoot(fr, to, roop);
	}

	private int searchRoot(int fr, int to, int[] roop) {
		if (fr == to)
			return 0;
		int fee = -1;
		for (int i = 0; i < root[fr].size(); i++) {
			int x = root[fr].getDist(i);
			if (this.isRoop(x, roop))
				continue;
			int[] roopnx = new int[roop.length + 1];
			System.arraycopy(roop, 0, roopnx, 0, roop.length);
			roopnx[roop.length] = x;
			int f = searchRoot(x, to, roopnx);
			if (f == -1)
				continue;
			if (fee > f + root[fr].getAmt(i) || fee == -1)
				fee = f + root[fr].getAmt(i);
		}

		return fee;
	}

	private boolean isRoop(int x, int[] roop) {
		for (int i = 0; i < roop.length; i++)
			if (roop[i] == x)
				return true;
		return false;
	}

	class Root {
		class Fare {
			public Fare(int to, int f) {
				dist = to;
				amt = f;
			}

			int dist;
			int amt;
		}

		private List<Fare> dist = new ArrayList<Fare>();

		public void newFare(int to, int f) {
			int i = this.isExist(to);
			if (i == -1)
				dist.add(new Fare(to, f));
			else
				dist.get(i).amt = Math.min(dist.get(i).amt, f);
		}

		public void print() {
			for (int i = 0; i < dist.size(); i++) {
				System.out.println("  - to " + dist.get(i).dist + " " + dist.get(i).amt);
			}
		}

		public int getAmt(int i) {
			return dist.get(i).amt;
		}

		public int getDist(int i) {
			return dist.get(i).dist;
		}

		public int size() {
			return dist.size();
		}

		private int isExist(int to) {
			for (int i = 0; i < dist.size(); i++)
				if (dist.get(i).dist == to)
					return i;
			return -1;
		}

	}

}