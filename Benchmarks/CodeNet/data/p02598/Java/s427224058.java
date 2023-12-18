import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var k = sc.nextInt();
		var list = new Main().new SortedList();
		for (var i = 0; i < n; i++) {
			list.add(new Main().new Log(sc.nextInt(), 1));
		}
		sc.close();

		for (var i = 0; i < k; i++) {
			var log = list.get(n - 1);
			list.remove(n - 1);
			log.setC(log.getC() + 1);
			list.add(log);
		}
		System.out.println(list.get(n - 1).getV());
	}

	public class Log {
		private int a;
		private int c;

		public int getA() {
			return a;
		}

		public int getC() {
			return c;
		}

		public void setC(int c) {
			this.c = c;
		}

		public int getV() {
			return (int) Math.ceil((double) a / c);
		}

		public Log(int a, int c) {
			this.a = a;
			this.c = c;
		}
	}

	public class SortedList {
		List<Log> list;

		public SortedList() {
			this.list = new ArrayList<Log>();
		}

		public SortedList(List<Log> list) {
			this.list = list;
		}

		public Log get(int index) {
			return list.get(index);
		}

		public void add(Log log) {
			list.add(search(log.getV()), log);
		}

		public void remove(int index) {
			list.remove(index);
		}

		private int search(int value) {
			var min = 0;
			var max = list.size();
			while (max - min > 1) {
				var mid = min + (max - min) / 2;
				if (list.get(mid).getV() <= value) {
					min = mid;
				} else {
					max = mid;
				}
			}

			if (max - min == 1 && list.get(min).getV() <= value) {
				min++;
			}
			return min;
		}
	}
}
