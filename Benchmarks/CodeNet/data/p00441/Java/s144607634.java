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
		// Scanner scan = new Scanner(new File("c:\\0515-input.txt"));
		while (true) {
			int n = scan.nextInt();
			if (n == 0)
				break;
			Map map = new Map(n);
			for (int i = 0; i < n; i++)
				map.add(scan.nextInt(), scan.nextInt());
			map.sort();
			// map.print();
			System.out.println(map.getMax());
		}

		scan.close();
		System.exit(0);
	}

}

class Map {
	class Loc {
		private int x, y;

		public Loc(int _x, int _y) {
			x = _x;
			y = _y;
		}

	}

	class LocComp implements Comparator<Loc> {

		@Override
		public int compare(Loc o1, Loc o2) {
			if (o1.x >= o2.x)
				return 1;
			else if (o1.x == o2.x)
				if (o1.y > o2.y)
					return 1;
				else
					return 0;
			else
				return -1;
		}
	}

	static final int mm = 5001;
	List<Loc> loc = new ArrayList<Loc>();
	boolean[][] ex = new boolean[mm][mm];

	public Map(int n) {
	}

	public int getMax() {
		int max = 0;
		for (int i = 0; i < loc.size(); i++)
			for (int j = i + 1; j < loc.size(); j++) {
				if (loc.get(i).y > loc.get(j).y)
					continue;
				int a = this.area(i, j);
				if (a > max)
					max = a;
			}
		return max;
	}

	private int area(int i, int j) {
		int dx = loc.get(j).x - loc.get(i).x;
		int dy = loc.get(j).y - loc.get(i).y;
		if (loc.get(i).x - dy < 0)
			return 0;
		if (loc.get(i).y + dx >= mm)
			return 0;
		if (loc.get(j).x - dy < 0)
			return 0;
		if (loc.get(j).y + dx >= mm)
			return 0;
		if (!ex[loc.get(i).x - dy][loc.get(i).y + dx] || !ex[loc.get(j).x - dy][loc.get(j).y + dx])
			return 0;
		return (dx * dx + dy * dy);
	}

	public void print() {
		for (int i = 0; i < loc.size(); i++)
			System.out.println(loc.get(i).x + " " + loc.get(i).y);

	}

	public void sort() {
		Collections.sort(loc, new LocComp());
	}

	public void add(int x, int y) {
		loc.add(new Loc(x, y));
		ex[x][y] = true;

	}

}