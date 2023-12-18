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
		// Scanner scan = new Scanner(new File("c:\\0519-in7.txt"));
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0)
				break;
			int m = scan.nextInt();

			Match match = new Match(n);
			for (int i = 0; i < m; i++)
				match.add(scan.nextInt(), scan.nextInt());
			for (int i = 0; i < n; i++)
				System.out.println(match.getTopOrder());
			System.out.println(match.getDefined());
		}

		scan.close();
		System.exit(0);
	}

}

class Match {
	class WinLose {
		public WinLose(int w, int l) {
			winner = w;
			loser = l;
		}

		int winner;
		int loser;
	}

	class LoserComp implements Comparator<WinLose> {

		@Override
		public int compare(WinLose o1, WinLose o2) {
			if (o1.loser > o2.loser)
				return 1;
			else if (o1.loser == o2.loser)
				return 0;
			else
				return -1;
		}

	}

	List<WinLose> wl = new ArrayList<WinLose>();
	List<Integer> order = new ArrayList<Integer>();
	boolean defined = true;
	int team;

	public Match(int n) {
		team = n;
		for (int i = 1; i <= team; i++)
			order.add(i);
	}

	public int getDefined() {
		if (defined)
			return 0;
		else
			return 1;
	}

	public int getTopOrder() {
		this.sort();
		return this.getTop();
	}

	private int getTop() {
		int top = 0;
		for (int tm = 0, i = 0, find = 0; tm < order.size() && find < 2;) {
			if (i < wl.size())
				if (wl.get(i).loser == order.get(tm)) {
					i++;
					tm++;
					continue;
				} else if (wl.get(i).loser < order.get(tm)) {
					i++;
					continue;
				}
			find++;
			if (find == 1)
				top = order.get(tm);
			else {
				defined = false;
				break;
			}
			tm++;
		}
		for (int i = 0; i < order.size(); i++)
			if (order.get(i) == top) {
				order.remove(i);
				break;
			}
		for (int i = 0; i < wl.size();)
			if (wl.get(i).winner == top)
				wl.remove(i);
			else
				i++;
		return top;
	}

	private void sort() {
		Collections.sort(wl, new LoserComp());
	}

	public void add(int w, int l) {
		wl.add(new WinLose(w, l));
	}

}