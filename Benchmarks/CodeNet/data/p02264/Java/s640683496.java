import java.io.File;
import java.io.FileNotFoundException;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\2010-input.txt"));

		while (scan.hasNext()) {
			int n = scan.nextInt();
			int q = scan.nextInt();

			Qu qu = new Qu(n);
			for (int i = 0; i < n; i++) {
				qu.add(scan.next(), scan.nextInt());
			}
			while (qu.process(q))
				;
		}

		scan.close();
		System.exit(0);
	}
}

class Qu {
	class Proc {
		public Proc(String _name, int _time) {
			name = new String(_name);
			time = _time;
		}

		String name;
		int time;
	}

	List<Proc> proc = new ArrayList<Proc>();
	int pt = 0;
	int total = 0;

	public Qu(int n) {
	}

	public boolean process(int q) {
		if (proc.get(pt).time <= q) {
			total += proc.get(pt).time;
			System.out.println(proc.get(pt).name + " " + total);
			proc.remove(pt);
			if (proc.size() == 0)
				return false;
		} else {
			total += q;
			proc.get(pt).time -= q;
			pt++;
		}
		if (pt == proc.size())
			pt = 0;
		return true;
	}

	public void add(String _name, int _time) {
		proc.add(new Proc(_name, _time));
	}

}