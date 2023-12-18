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

		public int eval() {
			int ret = 0;
			for (int x = 0; x < 3; x++)
				for (int y = 0; y < 3; y++) {
					int p = pn[x][y];
					if (p != 0)
						ret += Math.abs(x - gx[p]) + Math.abs(y - gy[p]);
				}
			return ret;
		}

		public void copy(Bd bd) {
			for (int x = 0; x < 3; x++)
				for (int y = 0; y < 3; y++)
					pn[x][y] = bd.pn[x][y];
		}

		private boolean up() {
			for (int x = 0; x < 3; x++)
				for (int y = 0; y < 2; y++)
					if (pn[x][y] == 0) {
						pn[x][y] = pn[x][y + 1];
						pn[x][y + 1] = 0;
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

		public boolean same(Bd b) {
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

	public void SetIni(int x, int y, int a) {
		bd.pn[x][y] = a;
	}

	public int solve() {
		Bd b = new Bd();
		b.copy(bd);
		hist.add(0, b);
		search(b);
		return hist.size() - 1;
	}

	private boolean search(Bd b) {
		// printBd(b);

		if (b.eval() == 0)
			return true;

		int[] pri = new int[4];
		Bd[] nb = new Bd[4];

		for (int i = 0; i < 4; i++) {
			nb[i] = new Bd();
			nb[i].copy(b);
			if (nb[i].move(i) && newPat(nb[i]))
				pri[i] = nb[i].eval();
			else
				pri[i] = -1;
		}

		while (true) {
			int min = Integer.MAX_VALUE;
			int imin = -1;
			for (int i = 0; i < 4; i++)
				if (pri[i] != -1 && pri[i] < min) {
					min = pri[i];
					imin = i;
				}
			if (imin == -1)
				break;

			pri[imin] = -1;
			hist.add(0, nb[imin]);
			if (search(nb[imin]))
				return true;
			hist.remove(0);
		}
		return false;
	}

	private boolean newPat(Bd b) {
		for (int i = 0; i < hist.size(); i++)
			if (b.same(hist.get(i)))
				return false;
		return true;
	}

	private void printBd(Bd b) {
		System.out.println("----------------");
		for (int y = 0; y < 3; y++)
			System.out.println("- " + b.pn[0][y] + " " + b.pn[1][y] + " " + b.pn[2][y] + " -");
		System.out.println("------- " + b.eval() + " hist " + hist.size());
	}
}