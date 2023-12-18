import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static int time = 0;

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\ALDS1_6_A-in9.txt"));

		HS hs = new HS();

		for (int y = 0; y < 3; y++)
			for (int x = 0; x < 3; x++)
				hs.SetIni(x, y, scan.nextInt());

		System.out.println(hs.solve());

		scan.close();
		System.exit(0);
	}
}

class HS {
	class Bd {
		int[][] pn = new int[3][3];
		int oper = 0;
		int diff = 0;

		public int eval() {
			int ret = 0;
			for (int x = 0; x < 3; x++)
				for (int y = 0; y < 3; y++) {
					int p = pn[x][y];
					if (p != 0)
						ret += Math.abs(x - gx[p]) + Math.abs(y - gy[p]);
				}
			diff = ret;
			return ret;
		}

		public void copy(Bd b) {
			for (int x = 0; x < 3; x++)
				for (int y = 0; y < 3; y++)
					pn[x][y] = b.pn[x][y];
			diff = b.diff;
			oper = b.oper;
		}

		private boolean up() {
			for (int x = 0; x < 3; x++)
				for (int y = 0; y < 2; y++)
					if (pn[x][y] == 0) {
						pn[x][y] = pn[x][y + 1];
						pn[x][y + 1] = 0;
						oper++;
						eval();
						return true;
					}
			return false;
		}

		private boolean down() {
			for (int x = 0; x < 3; x++)
				for (int y = 1; y < 3; y++)
					if (pn[x][y] == 0) {
						pn[x][y] = pn[x][y - 1];
						pn[x][y - 1] = 0;
						oper++;
						eval();
						return true;
					}
			return false;
		}

		private boolean right() {
			for (int x = 1; x < 3; x++)
				for (int y = 0; y < 3; y++)
					if (pn[x][y] == 0) {
						pn[x][y] = pn[x - 1][y];
						pn[x - 1][y] = 0;
						oper++;
						eval();
						return true;
					}
			return false;
		}

		private boolean left() {
			for (int x = 0; x < 2; x++)
				for (int y = 0; y < 3; y++)
					if (pn[x][y] == 0) {
						pn[x][y] = pn[x + 1][y];
						pn[x + 1][y] = 0;
						oper++;
						eval();
						return true;
					}
			return false;
		}

		public boolean move(int op) {
			switch (op) {
			case (0):
				return up();
			case (1):
				return down();
			case (2):
				return right();
			case (3):
				return left();
			}
			return false;
		}

		public boolean isSame(Bd b) {
			for (int x = 0; x < 3; x++)
				for (int y = 0; y < 3; y++)
					if (b.pn[x][y] != pn[x][y])
						return false;
			return true;
		}
	}

	private Bd bd = new Bd();
	private int[] gx = { 2, 0, 1, 2, 0, 1, 2, 0, 1 };
	private int[] gy = { 2, 0, 0, 0, 1, 1, 1, 2, 2 };
	private ArrayList<Bd> hist = new ArrayList<Bd>();
	private PriorityQueue<Bd> pqueue = new PriorityQueue<Bd>(3, new Qcomparator());

	class Qcomparator implements Comparator<Bd> {
		@Override
		public int compare(Bd b1, Bd b2) {
			if (b1.diff + b1.oper > b2.diff + b2.oper)
				return 1;
			else if (b1.diff + b1.oper == b2.diff + b2.oper)
				return 0;
			else
				return -1;
		}
	}

	public void SetIni(int x, int y, int a) {
		bd.pn[x][y] = a;
	}

	public int solve() {
		Bd b = new Bd();
		b.copy(bd);
		b.eval();
		pqueue.add(b);
		hist.add(b);
		return search();
	}

	private int search() {
		while (true) {
			Bd b = pqueue.poll();
			if (b == null)
				return -1;

	//		printBd(b);

			if (b.diff == 0)
				return b.oper;

			for (int i = 0; i < 4; i++) {
				Bd nb = new Bd();
				nb.copy(b);
				if (nb.move(i))
					addQueue(nb);
			}
		}
	}

	private boolean addQueue(Bd b) {
		for (int i = 0; i < hist.size(); i++)
			if (b.isSame(hist.get(i)))
				if (b.oper < hist.get(i).oper) {
					hist.get(i).oper = b.oper;
					pqueue.add(b);
					return true;
				} else
					return false;
		pqueue.add(b);
		return true;
	}

	private void printBd(Bd b) {
		System.out.println("----------------");
		for (int y = 0; y < 3; y++)
			System.out.println("- " + b.pn[0][y] + " " + b.pn[1][y] + " " + b.pn[2][y] + " -");
		System.out.println("------- diff " + b.diff + " oper " + b.oper);
	}
}